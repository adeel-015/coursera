/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastCollinearPoints {
    private List<LineSegment> segments;

    public FastCollinearPoints(Point[] points) {
        if (points == null) throw new IllegalArgumentException("null array");

        Point[] copy = points.clone();
        for (Point p : copy) if (p == null) throw new IllegalArgumentException("null point");

        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].compareTo(copy[i - 1]) == 0)
                throw new IllegalArgumentException("Duplicate point found");
        }

        segments = new ArrayList<>();

        int n = copy.length;
        for (int i = 0; i < n; i++) {
            Point origin = copy[i];
            Point[] sortedBySlope = copy.clone();
            Arrays.sort(sortedBySlope, origin.slopeOrder());

            int j = 1;
            while (j < n) {
                double slope = origin.slopeTo(sortedBySlope[j]);
                int start = j;

                while (j < n && Double.compare(origin.slopeTo(sortedBySlope[j]), slope) == 0) {
                    j++;
                }
                if (j - start >= 3) {
                    Point[] collinear = new Point[j - start + 1];
                    collinear[0] = origin;
                    for (int k = 0; k < j - start; k++) {
                        collinear[k + 1] = sortedBySlope[start + k];
                    }
                    Arrays.sort(collinear);
                    if (collinear[0].compareTo(origin) == 0) {
                        segments.add(
                                new LineSegment(collinear[0], collinear[collinear.length - 1]));
                    }
                }
            }
        }
    }

    public int numberOfSegments() {
        return segments.size();
    }

    public LineSegment[] segments() {
        return segments.toArray(new LineSegment[0]);
    }

    public static void main(String[] args) {

    }
}

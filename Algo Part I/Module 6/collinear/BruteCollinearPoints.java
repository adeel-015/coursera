/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteCollinearPoints {
    private final List<LineSegment> segments = new ArrayList<>();

    public BruteCollinearPoints(Point[] points) {
        if (points == null) throw new IllegalArgumentException();
        Point[] copy = points.clone();
        for (Point p : copy) if (p == null) throw new IllegalArgumentException();

        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].compareTo(copy[i - 1]) == 0)
                throw new IllegalArgumentException("Duplicate points");
        }

        int n = copy.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int m = k + 1; m < n; m++) {
                        Point p = copy[i], q = copy[j], r = copy[k], s = copy[m];
                        double slopePQ = p.slopeTo(q);
                        if (slopePQ == p.slopeTo(r) && slopePQ == p.slopeTo(s))
                            segments.add(new LineSegment(p, s));
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

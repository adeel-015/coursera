/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private static final double CONFIDENCE_95 = 1.96;
    private int trial;
    private double[] trialResults;

    public PercolationStats(int n, int trial) {
        if (n <= 0 || trial <= 0)
            throw new IllegalArgumentException("N and T must be positive");
        this.trial = trial;
        trialResults = new double[trial];

        for (int i = 0; i < trial; i++) {
            Percolation percolation = new Percolation(n);
            while (!percolation.percolates()) {
                int row = StdRandom.uniformInt(1, n + 1);
                int col = StdRandom.uniformInt(1, n + 1);
                percolation.open(row, col);
            }
            int openSites = percolation.numberOfOpenSites();
            double result = (double) openSites / (n * n);
            trialResults[i] = result;
        }
    }

    public double mean() {
        return StdStats.mean(trialResults);
    }

    public double stddev() {
        return StdStats.stddev(trialResults);
    }

    public double confidenceLo() {
        return mean() - ((CONFIDENCE_95 * stddev()) / Math.sqrt(trial));
    }

    public double confidenceHi() {
        return mean() + ((CONFIDENCE_95 * stddev()) / Math.sqrt(trial));
    }

    public static void main(String[] args) {
        int gridSize = 10;
        int trial = 10;
        if (args.length >= 2) {
            gridSize = Integer.parseInt(args[0]);
            trial = Integer.parseInt(args[1]);
        }
        PercolationStats stats = new PercolationStats(gridSize, trial);

        String confidence = stats.confidenceLo() + ", " + stats.confidenceHi();
        StdOut.println("mean                    = " + stats.mean());
        StdOut.println("stddev                  = " + stats.stddev());
        StdOut.println(
                "95% confidence interval = [" + stats.confidenceLo() + ", " + stats.confidenceHi()
                        + "]");
    }
}
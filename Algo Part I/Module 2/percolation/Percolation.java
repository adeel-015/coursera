/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private final boolean[] grid;
    private final WeightedQuickUnionUF uf;
    private final WeightedQuickUnionUF uf2;
    private final int gridSize;
    private final int virtualTop;
    private final int virtualBottom;
    private int openSites;

    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException("Grid size must be > 0");
        this.gridSize = n;
        int gridSquared = n * n;
        grid = new boolean[gridSquared];
        uf = new WeightedQuickUnionUF(gridSquared + 2);  // with virtual top and bottom
        uf2 = new WeightedQuickUnionUF(gridSquared + 1); // with only virtual top (for backwash fix)
        virtualTop = gridSquared;
        virtualBottom = gridSquared + 1;
        openSites = 0;
    }

    public void open(int row, int col) {
        validate(row, col);
        int index = flatten(row, col);
        if (grid[index]) return;

        grid[index] = true;
        openSites++;

        // Connect to virtual top if in first row
        if (row == 1) {
            uf.union(index, virtualTop);
            uf2.union(index, virtualTop);
        }

        // Connect to virtual bottom if in last row
        if (row == gridSize) {
            uf.union(index, virtualBottom);
        }

        // Connect to adjacent open sites
        connectIfOpen(row - 1, col, index); // up
        connectIfOpen(row + 1, col, index); // down
        connectIfOpen(row, col - 1, index); // left
        connectIfOpen(row, col + 1, index); // right
    }

    public boolean isOpen(int row, int col) {
        validate(row, col);
        return grid[flatten(row, col)];
    }

    public boolean isFull(int row, int col) {
        validate(row, col);
        return uf2.find(virtualTop) == uf2.find(flatten(row, col));
    }

    public int numberOfOpenSites() {
        return openSites;
    }

    public boolean percolates() {
        return uf.find(virtualTop) == uf.find(virtualBottom);
    }

    private int flatten(int row, int col) {
        return (row - 1) * gridSize + (col - 1);
    }

    private void validate(int row, int col) {
        if (row < 1 || row > gridSize || col < 1 || col > gridSize) {
            throw new IllegalArgumentException("row and col must be between 1 and " + gridSize);
        }
    }

    private void connectIfOpen(int row, int col, int index) {
        if (row < 1 || row > gridSize || col < 1 || col > gridSize) return;
        if (isOpen(row, col)) {
            int neighborIndex = flatten(row, col);
            uf.union(index, neighborIndex);
            uf2.union(index, neighborIndex);
        }
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        Percolation percolation = new Percolation(size);
        int argCount = args.length;
        for (int i = 1; argCount >= 2; i += 2) {
            int row = Integer.parseInt(args[i]);
            int col = Integer.parseInt(args[i + 1]);
            StdOut.printf("Adding row: %d  col: %d %n", row, col);
            percolation.open(row, col);
            if (percolation.percolates()) {
                StdOut.printf("%nThe System percolates %n");
            }
            argCount -= 2;
        }
        if (!percolation.percolates()) {
            StdOut.printf("Does not percolate %n");
        }
    }
}

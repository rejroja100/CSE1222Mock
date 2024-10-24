public class Matrix {

    private int numRows;
    private int numColumns;
    private String[][] grid;


    public static class Cell {
        private int row;
        private int column;


        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        @Override
        public String toString() {
            return "Cell{" + "row=" + row + ", column=" + column + '}';
        }
    }


    public void set(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IllegalArgumentException("Invalid row or column");
        }
    }
}

public class Point {
    private final int x, y;

    public Point(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return x; }

    public int getY() { return y; }

    public boolean equals(Object o) {
        // ...
        return x == that.x && y == that.y;
    }

    public int hashCode() {
        return 31 * x + y;
    }

    public String toString() {
        return String.format("Point(%d, %d)", x, y);
    }
}

Point point = new Point(1, 2)

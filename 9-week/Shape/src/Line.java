public class Line extends OneDimensionalShape {
    private int x1, x2, y1, y2, z1, z2;

    public Line(Point p1, Point p2) {
        super();
        x1 = p1.getX();
        y1 = p1.getY();
        z1 = p1.getZ();
        x2 = p2.getX();
        y2 = p2.getY();
        z2 = p2.getZ();
    }

    public double getLength() {
        return Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2), 0.5);
    }

    public void move(int x, int y, int z) {
        x1 += x;
        x2 += x;
        y1 += y;
        y2 += y;
        z1 += z;
        z2 += z;
    }

}

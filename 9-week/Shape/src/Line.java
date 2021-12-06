public class Line extends OneDimensionalShape {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        super();
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return Math.round(
                (Math.pow(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2)
                        + Math.pow((p2.getZ() - p1.getZ()), 2), 0.5)) * 100.0)
                / 100.0;
    }

    public void move(int x, int y, int z) {
        p1.setX(p1.getX() + x);
        p2.setX(p2.getX() + x);
        p1.setY(p1.getY() + y);
        p2.setY(p2.getY() + y);
        p1.setZ(p1.getZ() + z);
        p2.setZ(p2.getZ() + z);
    }

    public String toString() {
        return "Shape: " + this.getClass().getSimpleName() + "\r\nShapeID: " + getID() + "\r\nPoint 1: (" + p1.getX()
                + ","
                + p1.getY() + "," + p1.getZ() + ")\r\nPoint 2: (" + p2.getX() + "," + p2.getY() + "," + p2.getZ()
                + ")\r\nLength: " + getLength();
    }

}

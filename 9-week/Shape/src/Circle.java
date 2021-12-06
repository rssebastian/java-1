public class Circle extends TwoDimensionalShape {
    private Point center;
    private int radius;

    public Circle(Point p, int radius) {
        super();
        this.center = p;
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    public void move(int x, int y, int z) {
        center.setX(center.getX() + x);
        center.setY(center.getY() + y);
        center.setZ(center.getZ() + z);
    }

    public String toString() {
        return "Shape: " + this.getClass().getSimpleName() + "\r\nShapeID: " + getID() + "\r\nCenter: (" + center.getX()
                + ","
                + center.getY() + "," + center.getZ() + ")\r\nRadius: " + radius + "\r\nArea: " + getArea();
    }
}

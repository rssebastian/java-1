public class Sphere extends ThreeDimensionalShape {
    private int centerX, centerY, centerZ, radius;

    public Sphere(Point p, int radius) {
        super();
        this.centerX = p.getX();
        this.centerY = p.getY();
        this.centerZ = p.getZ();
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(4 * Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    public double getVolume() {
        return Math.round((double) 4 / 3 * Math.PI * Math.pow(radius, 3) * 100.0) / 100.0;
    }

    public void move(int x, int y, int z) {
        centerX += x;
        centerY += y;
        centerZ += z;
    }

    public String toString() {
        return "Shape: " + this.getClass().getSimpleName() + "\r\nShapeID: " + getID() + "\r\nCenter: (" + centerX + ","
                + centerY + "," + centerZ + ")\r\nRadius: " + radius + "\r\nArea: " + getArea() + "\r\nVolume: "
                + getVolume();
    }
}

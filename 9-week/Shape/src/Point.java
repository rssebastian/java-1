public class Point extends ZeroDimensionalShape {
    private int xCoord;
    private int yCoord;
    private int zCoord;

    public Point() {
        super();
    }

    public Point(int xCoord, int yCoord, int zCoord) {
        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    public int getZ() {
        return zCoord;
    }

    public void setX(int x) {
        xCoord = x;
    }

    public void setY(int y) {
        yCoord = y;
    }

    public void setZ(int z) {
        zCoord = z;
    }

    public void move(int x, int y, int z) {
        xCoord += x;
        yCoord += y;
        zCoord += z;
    }

    public String toString() {
        return "Shape: " + this.getClass().getSimpleName() + "\r\nShapeID: " + getID() + "\r\nX-Coordinate: "
                + this.getX() + "\r\nY-Coordinate: " + this.getY() + "\r\nZ-Coordinate: " + this.getZ();
    }
}

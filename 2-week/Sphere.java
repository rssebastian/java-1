public class Sphere {
    private int xCoord;
    private int yCoord;
    private int zCoord;
    private int radius;

    public Sphere() {
    }

    public void setXCoord(int x) {
        this.xCoord = x;
    }

    public void setYCoord(int y) {
        this.yCoord = y;
    }

    public void setZCoord(int z) {
        this.zCoord = z;
    }

    public int getXCoord() {
        return xCoord;
    }

    public int getYCoord() {
        return yCoord;
    }

    public int getZCoord() {
        return zCoord;
    }

    public String getCoordinatesString() {
        return "(" + xCoord + "," + yCoord + "," + zCoord + ")";
    }

    public void setCoordinates(int x, int y, int z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
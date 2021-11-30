public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public double area() {
        return (double) getHeight() * getWidth();
    }
}

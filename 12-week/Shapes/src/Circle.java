public class Circle implements Shape {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

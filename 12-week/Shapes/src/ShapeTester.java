public class ShapeTester {
    public static void ShowArea(Shape s) {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(4, 3);

        ShowArea(c);
        ShowArea(r);

    }
}

// TEST CASE OUTPUT
// The area of the shape is 50.26548245743669
// The area of the shape is 12.0
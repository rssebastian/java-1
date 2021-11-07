public class ShapeTester {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Point();
        s[1] = new Line();
        s[2] = new Circle();
        s[3] = new Sphere();

        System.out.println(s[0].getID());
        System.out.println(s[1].getID());
        System.out.println(s[2].getID());
        System.out.println(s[3].getID());
    }
}

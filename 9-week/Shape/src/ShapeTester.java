public class ShapeTester {
    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Point(1, 1, 1);
        s[1] = new Line(new Point(0, 0, 0), new Point(4, 4, 4));
        s[2] = new Circle(new Point(2, 2, 2), 2);
        s[3] = new Sphere(new Point(2, 2, 2), 3);

        String linebreak = "--------------------";
        // Testing ID Function
        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Shapes:");
        System.out.println(linebreak);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            System.out.println(linebreak);
        }
        System.out.println(linebreak);
        System.out.println("Moving each shape by 2,2,2");
        System.out.println(linebreak);
        System.out.println("Shapes:");
        System.out.println(linebreak);
        for (int i = 0; i < s.length; i++) {
            s[i].move(2, 2, 2);
            System.out.println(s[i]);
            System.out.println(linebreak);
        }
        System.out.println("Dimensions:");
        System.out.println(linebreak);
        for (int i = 0; i < s.length; i++) {
            if (s[i] instanceof OneDimensionalShape) {
                OneDimensionalShape ods = (OneDimensionalShape) s[i];
                System.out.printf("%s length is %.2f%n", ods.getClass().getSimpleName() + " #" + ods.getID() + "'s",
                        ods.getLength());
            }
            if (s[i] instanceof TwoDimensionalShape) {
                TwoDimensionalShape tds = (TwoDimensionalShape) s[i];
                System.out.printf("%s area is %.2f%n", tds.getClass().getSimpleName() + " #" + tds.getID() + "'s",
                        tds.getArea());
            }
            if (s[i] instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape tds = (ThreeDimensionalShape) s[i];
                System.out.printf("%s area is %.2f%n", tds.getClass().getSimpleName() + " #" + tds.getID() + "'s",
                        tds.getArea());
                System.out.printf("%s volume is %.2f%n", tds.getClass().getSimpleName() + " #" + tds.getID() + "'s",
                        tds.getVolume());
            }
        }

    }
}

// TEST CASE OUTPUT
// --------------------
// --------------------
// Shapes:
// --------------------
// Shape: Point
// ShapeID: 1
// X-Coordinate: 1
// Y-Coordinate: 1
// Z-Coordinate: 1
// --------------------
// Shape: Line
// ShapeID: 4
// Point 1: (0,0,0)
// Point 2: (4,4,4)
// Length: 6.93
// --------------------
// Shape: Circle
// ShapeID: 6
// Center: (2,2,2)
// Radius: 2
// Area: 12.57
// --------------------
// Shape: Sphere
// ShapeID: 8
// Center: (2,2,2)
// Radius: 3
// Area: 113.1
// Volume: 113.1
// --------------------
// --------------------
// Moving each shape by 2,2,2
// --------------------
// Shapes:
// --------------------
// Shape: Point
// ShapeID: 1
// X-Coordinate: 3
// Y-Coordinate: 3
// Z-Coordinate: 3
// --------------------
// Shape: Line
// ShapeID: 4
// Point 1: (2,2,2)
// Point 2: (6,6,6)
// Length: 6.93
// --------------------
// Shape: Circle
// ShapeID: 6
// Center: (4,4,4)
// Radius: 2
// Area: 12.57
// --------------------
// Shape: Sphere
// ShapeID: 8
// Center: (4,4,4)
// Radius: 3
// Area: 113.1
// Volume: 113.1
// --------------------
// Dimensions:
// --------------------
// Line #4's length is 6.93
// Circle #6's area is 12.57
// Sphere #8's area is 113.10
// Sphere #8's volume is 113.10
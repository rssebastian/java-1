import java.util.Scanner;

public class SphereTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Sphere SphereTester = new Sphere();
        System.out.println("You've created a new sphere! Set the coordinates!");
        System.out.print("What's the x-coordinate of the sphere? ");
        SphereTester.setXCoord(keyboard.nextInt());
        System.out.printf("%d is the x-coordinate of the center!%n", SphereTester.getXCoord());

        System.out.print("What's the y-coordinate of the sphere? ");
        SphereTester.setYCoord(keyboard.nextInt());
        System.out.printf("%d is the y-coordinate of the center!%n", SphereTester.getYCoord());

        System.out.print("What's the z-coordinate of the sphere? ");
        SphereTester.setZCoord(keyboard.nextInt());
        System.out.printf("%d is the z-coordinate of the center!%n", SphereTester.getZCoord());

        System.out.print("What's the radius of the sphere? ");
        SphereTester.setRadius(keyboard.nextInt());
        System.out.printf("%d is the radius of the sphere!%n", SphereTester.getRadius());

        System.out.println("----------------------------------------------");
        System.out.println("The center of your new sphere is at " + SphereTester.getCoordinatesString() + ",");
        System.out.printf("has a volume of %.2f,%n", SphereTester.getVolume());
        System.out.printf("and a surface area of %.2f.%n", SphereTester.getSurfaceArea());
        keyboard.close();
    }
}
// TEST CASE OUTPUT
// You've created a new sphere! Set the coordinates!
// What's the x-coordinate of the sphere? 12
// 12 is the x-coordinate of the center!
// What's the y-coordinate of the sphere? 14
// 14 is the y-coordinate of the center!
// What's the z-coordinate of the sphere? 15
// 15 is the z-coordinate of the center!
// What's the radius of the sphere? 16
// 16 is the radius of the sphere!
// ----------------------------------------------
// The center of your new sphere is at (12,14,15),
// has a volume of 17157.28,
// and a surface area of 3216.99.
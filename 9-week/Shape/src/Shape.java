public abstract class Shape {
    public static int shapeIDCount;
    private int shapeID;

    public Shape() {
        shapeIDCount += 1;
        shapeID = shapeIDCount;
    }

    public int getID() {
        return shapeID;
    }

    public abstract void move(int x, int y, int z);

}
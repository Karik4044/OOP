public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyPoint p3 = new MyPoint(3, 0);

        MyTriangle tri = new MyTriangle(p1, p2, p3);
        System.out.println("Perimeter of triangle is: " + tri.getPerimeter());
        System.out.println("Type of triangle is: " + tri.getType());
        System.out.println("Triangle: " + tri);
    }
}
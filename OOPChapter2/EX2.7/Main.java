public class Main {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p2 to origin: " + p2.distance());


        MyLine line1 = new MyLine(1, 2, 3, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line1: " + line1);
        System.out.println("Line2: " + line2);

        
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());
        System.out.println("Begin coordinates of line1: " + java.util.Arrays.toString(line1.getBeginXY()));
        System.out.println("End coordinates of line1: " + java.util.Arrays.toString(line1.getEndXY()));
        System.out.println("Length of line2: " + line2.getLength());
        System.out.println("Gradient of line2: " + line2.getGradient());
    }
}
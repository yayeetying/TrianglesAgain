public class Tester {

  public static void main(String[] args) {

    Point p1 = new Point(3.0, 4.0);
    Point p1Clone = new Point(p1);
    Point p2 = new Point(3.0, 14.35);
    Point p3 = new Point(2.5, 3.2);
    Point p3Clone = new Point(2.5, 3.2);

    System.out.println(p1.getX());
    System.out.println(p3.getY());
    System.out.println(p1Clone.getY());
    System.out.println();

    System.out.println(p1.distanceTo(p1Clone));
    System.out.println(p1.distanceTo(p2));
    System.out.println(p2.distanceTo(p3));
    System.out.println();

    System.out.println(p1.equals(p1Clone));
    System.out.println(p3.equals(p3Clone));
    System.out.println(p2.equals(p1));
  }
}
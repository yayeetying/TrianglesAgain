public class Tester {

  public static void main(String[] args) {

    Point p1 = new Point(3.0, 4.0);
    Point p1Clone = new Point(p1);
    Point p2 = new Point(2.5, 3.2);

    System.out.println(p1.getX());
    System.out.println(p2.getY());
    System.out.println(p1Clone.getY());
  }
}

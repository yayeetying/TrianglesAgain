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
    System.out.println();

    Triangle t1 = new Triangle(p1, p2, p3);
    Triangle t2 = new Triangle(0, 0, 3, 0, 0, 4);
    System.out.println(t1.toString());
    System.out.println(t2.toString());
    System.out.println(t1.getPerimeter());
    System.out.println(t2.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t2.getArea());
    Triangle t3 = new Triangle(0,0,0,0,0,0);
    Triangle t4 = new Triangle(0,0,4,0,2,3);
    Triangle t5 = new Triangle(0,0,4,0,4,0);
    System.out.println(t3.classify()); //equilateral
    System.out.println(t4.classify()); //isosceles
    System.out.println(t5.classify()); //isosceles
    System.out.println(t1.classify()); //scalene
    System.out.println();

    t3.setVertex(0, p1);
    t3.setVertex(1, p2);
    System.out.println(t3.toString()); //v1(3.0, 4.0) v2(3.0, 14.35) v3(0.0, 0.0)
  }
}

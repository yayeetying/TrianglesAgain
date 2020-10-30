public class Point {

  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  //construct a point given a point (redundant, but provides flexibility)
  public Point(Point p) {
    x = p.x; //private access in the same file is allowed!
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    if (other != null) return Math.sqrt(Math.pow((x - other.x), 2) + Math.pow((y - other.y), 2));
    else return 0;
  }

  public boolean equals(Point other) {
    return other != null && x == other.x && y == other.y;
  }

}

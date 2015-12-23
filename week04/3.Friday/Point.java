package week4_Friday;

public class Point {

	private double x, y;

	Point() {
		x = 0.0;
		y = 0.0;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static Point getOrigin() {
		return new Point();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point p = (Point) obj;
		if (x != p.getX() || y != p.getY())
			return false;

		return true;

	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + new Double(x).intValue();
		hash = hash * 23 + new Double(y).intValue();
		return hash;

	}

	@Override
	public String toString() {

		String ans = "(" + x + ", " + y + ")";
		return ans;
	}

	public static LineSegment Add(Point point1, Point point2) throws InvalidParametersException {
		return new LineSegment(point1, point2);
	}

}

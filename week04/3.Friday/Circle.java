package week4_Friday;

public class Circle extends Figure {

	private final Point center;
	private final double radius;

	Circle(Point c, double r) {
		center = new Point(c);
		radius = r;
	}

	Circle(Circle c) {
		this.center = c.center;
		this.radius = c.radius;
	}

	public Point getTop() {
		return new Point(center.getX(), center.getY() + radius);
	}

	public Point getLeft() {
		return new Point(center.getX() - radius, center.getY());
	}

	public Point getRight() {
		return new Point(center.getX() + radius, center.getY());

	}

	public Point getBottom() {
		return new Point(center.getX(), center.getY() - radius);
	}

	public Point getCenter() {
		return new Point(center);
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Circle cast = (Circle) obj;
		if (radius != cast.radius || !center.equals(cast.center))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = 23 * Double.hashCode(radius);
		hash = 23 * center.hashCode();
		return hash;
	}

	@Override
	public String toString() {

		return "[" + center + ", " + new Point(2 * radius, 2 * radius) + "]";

	}

}

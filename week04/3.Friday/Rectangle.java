package week4_Friday;

public class Rectangle extends Figure {

	private Point upperLeft = null;
	private Point lowerRight = null;

	public Rectangle(Point upperLeft, Point lowerRight) throws InvalidParametersException {

		if (upperLeft.getX() == lowerRight.getX() || upperLeft.getY() == lowerRight.getY()) {
			throw new InvalidParametersException("The points cannot be on the same axis!");
		}

		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}

	public Rectangle(Rectangle r) {
		upperLeft = new Point(r.upperLeft);
		lowerRight = new Point(r.lowerRight);
	}

	public Point getUpperLeft() {
		return new Point(upperLeft);
	}

	public Point getLowerRight() {
		return new Point(lowerRight);
	}

	public Point getLowerLeft() {
		return new Point(upperLeft.getX(), lowerRight.getY());
	}

	public Point getUpperRight() {
		return new Point(lowerRight.getX(), upperLeft.getY());
	}

	public LineSegment lowerEdge() throws InvalidParametersException {
		return Point.Add(getLowerLeft(), getLowerRight());
	}

	public LineSegment upperEdge() throws InvalidParametersException {
		return Point.Add(getUpperLeft(), getUpperRight());
	}

	public LineSegment rightEdge() throws InvalidParametersException {
		return Point.Add(getLowerRight(), getUpperRight());
	}

	public LineSegment leftEdge() throws InvalidParametersException {
		return Point.Add(getLowerLeft(), getUpperRight());
	}

	public double getWidth() throws InvalidParametersException {
		return new LineSegment(rightEdge()).getLength();
	}

	public double getLength() throws InvalidParametersException {
		return new LineSegment(lowerEdge()).getLength();
	}

	public Point getCenter() throws InvalidParametersException {
		double x = (getLowerRight().getX() - getUpperLeft().getX()) / 2;
		double y = (getUpperLeft().getY() - getLowerLeft().getY()) / 2;
		return new Point(x, y);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle r = (Rectangle) obj;

		if (!r.upperLeft.equals(upperLeft) || !r.lowerRight.equals(lowerRight))
			return false;
		return true;

	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + upperLeft.hashCode();
		hash = hash * 23 + lowerRight.hashCode();

		return hash;
	}

	@Override
	public String toString() {
		try {
			String ans = "[" + getCenter() + ", (" + getLength() + ", " + getWidth() + ")]";
			return ans;
		} catch (InvalidParametersException e) {
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public double getPerimeter() throws InvalidParametersException {

		return getWidth() * 2 + getLength() * 2;
	}

	@Override
	public double getArea() throws InvalidParametersException {
		return getWidth() * getLength();
	}

}

package week4_Friday;

public class Triangle extends Figure {

	Point A = null, B = null, C = null;

	public Triangle(Point top, Point left, Point right) throws InvalidParametersException {

		if ((top.getX() == left.getX() && left.getX() == right.getX())
				|| (top.getY() == left.getY() && left.getY() == right.getY())) {
			throw new InvalidParametersException("Points are on the same axis!");
		}

		this.A = top;
		this.B = left;
		this.C = right;
	}

	@Override
	public double getPerimeter() throws InvalidParametersException {
		double perimeter = 0;

		perimeter += new LineSegment(A, B).getLength();
		perimeter += new LineSegment(A, C).getLength();
		perimeter += new LineSegment(B, C).getLength();

		return perimeter;
	}

	@Override
	public double getArea() throws InvalidParametersException {
		double halfPerimeter = getPerimeter() / 2;
		double top_left = halfPerimeter - new LineSegment(A, B).getLength();
		double left_right = halfPerimeter - new LineSegment(B, C).getLength();
		double top_right = halfPerimeter - new LineSegment(A, C).getLength();
		double area = Math.sqrt(top_left * left_right * top_right);

		return area;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle t = (Triangle) obj;
		if (!t.B.equals(B) || !t.C.equals(C) || !t.A.equals(A))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 23;
		hash = hash * 17 + A.hashCode();
		hash = hash * 17 + B.hashCode();
		hash = hash * 17 + C.hashCode();
		return hash;
	}

	@Override
	public String toString() {
		String ans;
		try {
			ans = "[" + getCenter().toString() + ", (" + getHeight() + ", " + getBase() + "]";
			return ans;
		} catch (InvalidParametersException e) {
			e.printStackTrace();
		}
		return "";
	}

	public LineSegment getBase() throws InvalidParametersException {
		return Point.Add(A, B);
	}

	public double getHeight() throws InvalidParametersException {
		return (2 * getArea() / getBase().getLength());
	}

	public Point getUpperLeft() {
		return new Point(C);
	}

	public Point getLowerLeft() {
		return new Point(A);
	}

	public Point getLowerRight() {
		return new Point(B);
	}

	public LineSegment getLeft() throws InvalidParametersException {
		return Point.Add(A, C);
	}

	public LineSegment getRight() throws InvalidParametersException {
		return Point.Add(B, C);
	}

	public LineSegment getLower() throws InvalidParametersException {
		return Point.Add(A, B);
	}

	public Point getCenter() {
		return new Point((A.getX() + B.getX() + C.getX()) / 3, (A.getY() + B.getY() + C.getY()) / 3);
	}

}

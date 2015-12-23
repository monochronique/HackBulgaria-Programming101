package week4_Friday;

public class Elipse extends Figure {

	private final Point minor_axis_top;
	private final Point major_axis_left;

	public Elipse(Point minor, Point major) throws InvalidParametersException {
		if (minor.getX() == major.getX() || minor.getY() == major.getY()) {
			throw new InvalidParametersException("Points are on origin!");
		}
		minor_axis_top = new Point(minor);
		major_axis_left = new Point(major);
	}

	public Elipse(Elipse el) {
		minor_axis_top = new Point(el.minor_axis_top);
		major_axis_left = new Point(el.major_axis_left);
	}

	public Point getTop() {
		return minor_axis_top;
	}

	public Point getLeft() {
		return major_axis_left;
	}

	public Point getRight() {
		return new Point(
				major_axis_left.getX()
						+ Math.abs(Math.abs(minor_axis_top.getX()) - Math.abs(major_axis_left.getX())) * 2,
				major_axis_left.getY());
	}

	public Point getBottom() {
		return new Point(minor_axis_top.getX(), minor_axis_top.getY()
				- Math.abs(Math.abs(minor_axis_top.getY()) - Math.abs(major_axis_left.getY())) * 2);
	}

	public double getArea() throws InvalidParametersException {
		return Math.PI * Point.Add(getTop(), getBottom()).getLength() * Point.Add(getLeft(), getRight()).getLength();
	}

	public double getPerimeter() throws InvalidParametersException {
		double a = Point.Add(getTop(), getBottom()).getLength() / 2;
		double b = Point.Add(getLeft(), getRight()).getLength() / 2;
		return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elipse cast = (Elipse) obj;

		if (!this.major_axis_left.equals(cast.major_axis_left) || !this.minor_axis_top.equals(cast.minor_axis_top))
			return false;
		return true;

	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + this.minor_axis_top.hashCode();
		hash = hash * 23 + this.major_axis_left.hashCode();
		return hash;
	}

	public Point getCenter() {
		return new Point(minor_axis_top.getX(), major_axis_left.getY());
	}

	@Override
	public String toString() {

		try {
			double width = Point.Add(getLeft(), getRight()).getLength();
			double height = Point.Add(getTop(), getBottom()).getLength();
			String ans = "[" + getCenter() + ", " + new Point(height, width) + "]";
			return ans;
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
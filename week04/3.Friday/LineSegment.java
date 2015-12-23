package week4_Friday;

public class LineSegment {

	private Point start = null;
	private Point end = null;

	public LineSegment() {
		start = new Point();
		end = new Point();
	}

	public LineSegment(Point start, Point end) throws InvalidParametersException {
		if (start.getX() == end.getX() && start.getY() == end.getY()) {
			throw new InvalidParametersException("Cannot create a line segment with zero length");
		}
		this.start = start;
		this.end = end;

	}

	public LineSegment(LineSegment ls) {
		start = new Point(ls.start);
		end = new Point(ls.end);
	}

	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}

	public double getLength() {
		return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineSegment ls = (LineSegment) obj;
		if (!start.equals(ls.start) || !end.equals(ls.end))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + start.hashCode();
		hash = hash * 23 + end.hashCode();
		return hash;
	}

	@Override
	public String toString() {
		String ans = "[" + start.toString() + ", " + end.toString() + "]";
		return ans;
	}

}

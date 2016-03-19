package week10_Monday;

public class Point {
	private int x, y;
	private int pointID;
	public Point (int x, int y)
	{
		this.x = x;
		this.y = y;
		pointID = IDGenerator.getId();
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public double lengthToPoint (Point p)
	{
		return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
	}
	
	public String toString()
	{
		String str = "(" + x + ", " + y + ")";
		return str;
	}
	@Override
	public int hashCode()
	{
		return pointID;
	}

}

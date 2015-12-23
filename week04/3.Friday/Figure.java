package week4_Friday;

public abstract class Figure {
	
	public abstract double getPerimeter() throws InvalidParametersException;
	public abstract double getArea() throws InvalidParametersException;
	@Override
	public abstract  boolean equals(Object obj);
	@Override
	public abstract int hashCode();
	@Override
	public abstract String toString();
	
}

import java.awt.Color;

public class Ball {

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	private int diameter;
	private int x;
	private int y;
	private Color c = null;
	private int directionX;
	private int directionY;
	private int speed;

	public void move() {
		x += speed * directionX;
		y += speed * directionY;
	}

	public Ball(int diameter, int x, int y, Color c, int directionX, int directionY, int speed) {
		super();
		this.diameter = diameter;
		this.x = x;
		this.y = y;
		this.c = c;
		this.directionX = directionX;
		this.directionY = directionY;
		this.speed = speed;
	}

	public int getDiameter() {
		return diameter;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Color getC() {
		return c;
	}

	public int getDirectionX() {
		return directionX;
	}

	public int getDirectionY() {
		return directionY;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}

	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}

}

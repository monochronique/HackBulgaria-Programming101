
public class Player {

	private int x;

	Player(int _x) {
		x = _x;
	}

	public void moveLeft() {
		x -= 5;
	}

	public void moveRight() {
		x += 5;
	}

	public int getX() {
		return x;
	}

}

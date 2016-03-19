
public class Player {

	private int x;

	Player(int _x) {
		x = _x;
	}

	public void moveLeft() {
		x -= 2;
	}

	public void moveRight() {
		x += 2;
	}

	public int getX() {
		return x;
	}

}

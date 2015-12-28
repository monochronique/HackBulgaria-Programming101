import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel implements KeyListener, ActionListener {

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}

	private int width, heigth;
	public ArrayList<Ball> balls = null;
	private Player player;
	private int shootFrom;
	private boolean shooting = false;
	private int shotY = 783;
	private final int MIN_DIAMETER = 10;
	private Integer score = 0;

	public Game(int width, int heigth, Player p) {
		super();
		this.width = width;
		this.heigth = heigth;
		balls = new ArrayList<>();
		player = p;
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

	private void moveAll() {

		for (Ball b : balls) {
			if (b.getX() + b.getDiameter() + 15 > width || b.getX() < 0)
				b.setDirectionX(b.getDirectionX() * -1);
			if (b.getY() + b.getDiameter() + 45 > heigth || b.getY() < 0)
				b.setDirectionY(b.getDirectionY() * -1);

			if (Math.abs(b.getX() - player.getX()) <= b.getDiameter() && b.getY() > 783) {
				System.out.println("game over");
				System.exit(0);
			}

			b.move();

		}
	}

	private void shoot() {
		shootFrom = player.getX();
		shooting = true;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillRect(player.getX(), 818, 20, 35);
		g2d.drawString("SCORE  " + score.toString(), 750, 50);
		if (shooting) {
			if (shotY < 0) {
				shooting = false;
				shotY = 783;
			} else {

				g2d.drawLine(shootFrom, 782, shootFrom, shotY);
				Ball toRemove = null;
				Ball leftBall = null;
				Ball rightBall = null;
				for (Ball b : balls) {
					if (b.getY() > shotY && Math.abs(b.getX() - shootFrom) < b.getDiameter()) {
						score += 100;
						shooting = false;
						shotY = 783;
						toRemove = b;
						if (b.getDiameter() > MIN_DIAMETER) {
							toRemove = b;

							leftBall = new Ball(b.getDiameter() / 2, b.getX() - b.getDiameter(), b.getY(), b.getC(),
									b.getDirectionX() * -1, b.getDirectionY(), b.getSpeed());
							rightBall = new Ball(b.getDiameter() / 2, b.getX() + b.getDiameter(), b.getY(), b.getC(),
									b.getDirectionX(), b.getDirectionY(), b.getSpeed());

						}
					}
				}

				if (toRemove != null)
					balls.remove(toRemove);
				if (leftBall != null) {
					balls.add(leftBall);
					balls.add(rightBall);
				}

				if (balls.size() == 0) {
					System.out.println("Congrats ur score is " + score);
					System.exit(0);
				}

				shotY -= 5;
			}
		}

		for (Ball b : balls) {
			g2d.setColor(b.getC());
			g2d.fillOval(b.getX(), b.getY(), b.getDiameter(), b.getDiameter());

		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();

		if (c == KeyEvent.VK_LEFT)
			player.moveLeft();
		if (c == KeyEvent.VK_RIGHT)
			player.moveRight();
		if (c == KeyEvent.VK_SPACE)
			if (!shooting)
				shoot();

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Sample Frame");
		Player p = new Player(450);
		Game game = new Game(900, 900, p);
		frame.setSize(900, 900);
		frame.add(game);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ball b = new Ball(30, 700, 55, Color.orange, 3, 0, 1);
		Ball b2 = new Ball(30, 400, 500, Color.black, 2, 2, 1);
		game.balls.add(b);
		game.balls.add(b2);
		while (true) {
			game.moveAll();
			game.repaint();
			Thread.sleep(10);
		}

	}

}

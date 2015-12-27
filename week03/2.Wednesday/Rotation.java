import java.util.Collection;
import java.util.LinkedList;

public class Rotation {

	private static <T> void rotateLeft(Collection<T> t) {
		LinkedList<T> l = new LinkedList<>();
		l.addAll(t);
		l.addFirst(l.getLast());
		l.removeLast();
		t.clear();
		t.addAll(l);

	}

	public static <T> void rotateRight(Collection<T> t) {
		LinkedList<T> l = new LinkedList<>();
		l.addAll(t);
		l.addLast(l.getFirst());
		l.removeFirst();
		t.clear();
		t.addAll(l);
	}

	public static <T> void rotate(Collection<T> t, int rotateStep) {
		if (rotateStep < 0) {

			rotateStep *= -1;

			for (int i = 0; i < rotateStep; i++) {
				rotateRight(t);
			}
		}

		else {
			for (int i = 0; i < rotateStep; i++) {
				rotateLeft(t);
			}
		}
	}

}

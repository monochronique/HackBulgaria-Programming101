import java.util.Collection;
import java.util.LinkedList;

public class Reverse {
	public static <T> void reverse(Collection<T> coll) {

		LinkedList<T> l = new LinkedList<>();

		for (T el : coll) {

			l.offerFirst(el);
		}
		coll.clear();
		coll.addAll(l);
	}
}

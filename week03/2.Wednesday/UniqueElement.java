import java.util.Collection;
import java.util.LinkedList;

public class UniqueElement {

	public static <T> T firstUniqueElement(Collection<T> a) {
		LinkedList<T> list = new LinkedList<>();
		list.addAll(a);
		while (list.size() != 0) {
			T element = list.getFirst();
			list.removeFirst();
			if (!list.contains(element))
				return element;
		}
		
		return null;

	}

}

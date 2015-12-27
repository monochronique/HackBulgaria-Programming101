import java.util.Collection;
import java.util.LinkedList;

public class DuplicatingElements {

	@SafeVarargs
	public static <T> LinkedList<T> duplicatingElements(Collection<T>... sets) {
		Collection<T> smallest = sets[0];
		LinkedList<T> list = new LinkedList<>();
		for (Collection<T> set : sets) {
			if (smallest.size() > set.size())
				smallest = set;
		}
		boolean allContain = true;
		for (T element : smallest) {
			for (Collection<T> set : sets) {
				if (!set.contains(element)) {
					allContain = false;
					break;
				}
			}
			if (allContain)
				list.addLast(element);
			allContain = true;
		}

		return list;

	}

}

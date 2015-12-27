import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class OnOff<T> implements Collection<T> {

	private ArrayList<T> col = null;

	OnOff() {
		col = new ArrayList<T>();
	}

	@Override
	public boolean add(Object e) {
		if (e == null)
			throw new NullPointerException();
		@SuppressWarnings("unchecked")
		T el = (T) e;
		if (col.contains(el))
			return col.remove(el);
		else
			return col.add(el);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(@SuppressWarnings("rawtypes") Collection c) {

		for (Object el : c) {
			if (col.contains(el))
				col.remove(el);
			else
				col.add((T) el);
		}
		return true;

	}

	@Override
	public void clear() {
		col.clear();

	}

	@Override
	public boolean contains(Object o) {
		return col.contains(o);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean containsAll(Collection c) {
		return col.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return col.isEmpty();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Iterator iterator() {
		return col.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return col.remove(o);
	}

	@Override
	public boolean removeAll(@SuppressWarnings("rawtypes") Collection c) {
		return col.removeAll(c);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean retainAll(Collection c) {
		return col.retainAll(c);
	}

	@Override
	public int size() {
		return col.size();
	}

	@Override
	public Object[] toArray() {
		return col.toArray();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(Object[] a) {
		return col.toArray(a);
	}

}

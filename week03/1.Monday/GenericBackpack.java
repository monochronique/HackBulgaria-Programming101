public class GenericBackpack<T> {
	T item = null;

	GenericBackpack(T it) {
		item = it;
	}

	public void setItem(T it) {
		item = it;
	}

	public T getItem() {
		return item;
	}

}

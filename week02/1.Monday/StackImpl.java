public class StackImpl implements Stack {

	private int maxSize = 20;
	private Object stack[] = new Object[maxSize];
	private int size = 0;

	public boolean contains(Object o) {
		if (size != 0 && !o.getClass().equals(stack[0].getClass())) {
			System.err.println("Class type violation");
			return false;
		}

		for (int i = 0; i < size; i++) {
			if (o.equals(stack[i]))
				return true;
		}

		return false;

	}

	private void resize() {
		maxSize *= 2;
		Object newStack[] = new Object[maxSize];
		for (int i = 0; i < size; i++) {
			newStack[i] = stack[i];
		}

		stack = new Object[maxSize];

		for (int i = 0; i < size; i++)
			stack[i] = newStack[i];

	}

	public void push_back(Object o) {
		if (size != 0 && !o.getClass().equals(stack[0].getClass())) {
			System.err.println("Class type violation");
			return;
		}
		
		if (contains(o))
		{
			System.err.println("Object already in stack");
			return;
		}
		
		if (size == maxSize) {
			resize();
		}
		stack[size] = o;
		size++;

	}

	public int size() {
		return size;
	}

	public Object pop_back() {
		if (size == 0) {
			System.err.println("No elements in stack to be popped");
		}
		Object ans = new Object();
		ans = stack[size - 1];
		stack[size] = null;
		size--;
		return ans;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		size = 0;
		stack = new Object[400];
	}

}
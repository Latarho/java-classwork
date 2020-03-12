// Used to profile ArrayList reads and writes. I used ArrayLists to allow use of a profiling wrapper class; this will impact time performance but not array access performance.
public class ProfiledList<E> extends java.util.ArrayList<E> {
	static final long serialVersionUID = 69420; // unsure what this does

	public int reads = 0;
	public int writes = 0;
	public long startTime = 0;
	public long elapsed = 0;

	@Override
	public E get(final int i) {
		reads++;
		return super.get(i);
	}

	@Override
	public E set(final int i, final E e) {
		writes++;
		return super.set(i, e);
	}

	@Override
	public void add(final int i, final E e) {
		writes++;
		super.add(i, e);
	}

	@Override
	public E remove(final int i) {
		writes++;
		return super.remove(i);
	}

	public void startTimer() {
		startTime = System.currentTimeMillis();
	}

	public void endTimer() {
		elapsed = System.currentTimeMillis() - startTime;
	}

	public void fill(final E[] array) {
		for (int i = 0; i < array.length; i++) {
			this.add(array[i]);
		}
		reads = 0;
		writes = 0;
	}
}
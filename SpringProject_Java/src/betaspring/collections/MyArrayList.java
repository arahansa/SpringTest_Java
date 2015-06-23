package betaspring.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> extends ArrayList<E> {
	transient Object[] elementData; // non-private to simplify nested class
									// access
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	private static final Object[] EMPTY_ELEMENTDATA = {};
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	public MyArrayList(int initialCapacity) {
		
		if (initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);
		}
	}

	public boolean add(E e)
	{
		ensureCapacityInternal(size + 1); // Increments modCount!!
		elementData[size++] = e;
		return true;
	}

	private void ensureCapacityInternal(int minCapacity)
	{
		if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
		}

		ensureExplicitCapacity(minCapacity);
	}

	public void ensureCapacity(int minCapacity)
	{
		int minExpand = (elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
		// any size if not default element table
		? 0
				// larger than default for default empty table. It's already
				// supposed to be at default size.
				: DEFAULT_CAPACITY;

		if (minCapacity > minExpand) {
			ensureExplicitCapacity(minCapacity);
		}
	}

	private void ensureExplicitCapacity(int minCapacity)
	{
		modCount++;

		// overflow-conscious code
		if (minCapacity - elementData.length > 0)
			grow(minCapacity);
	}

	private void grow(int minCapacity)
	{
		// overflow-conscious code
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println("ArrrayList 예전크기 :" + oldCapacity + ", ArrrayList 새로운크기 :" + newCapacity);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		if (newCapacity - MAX_ARRAY_SIZE > 0)
			newCapacity = hugeCapacity(minCapacity);
		// minCapacity is usually close to size, so this is a win:
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	private static int hugeCapacity(int minCapacity)
	{
		if (minCapacity < 0) // overflow
			throw new OutOfMemoryError();
		return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE
				: MAX_ARRAY_SIZE;
	}

	public E get(int index)
	{
		rangeCheck(index);

		return elementData(index);
	}

	E elementData(int index)
	{
		return (E) elementData[index];
	}

	private void rangeCheck(int index)
	{
		if (index >= size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}
	private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

}

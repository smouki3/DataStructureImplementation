package zhivko.implementation.arraylist;

import java.util.Arrays;

/**
 * @author smouki3
 * 
 * @param <T>
 */
public class ArrayListImplementation<T>
{

    private int minCapacity = 10;
    private int size = 0;
    @SuppressWarnings({ "unchecked" })
    private T[] array = (T[]) new Object[minCapacity];

    public ArrayListImplementation()
    {
        T[] array = (T[]) new Object[minCapacity];

    }

    // implementation of add method
    public void add(T item)
    {
        add(size, item);

    }

    // implementation of enshureCapacity method
    public void enshureCapacity()
    {
        array = Arrays.copyOf(array, array.length * 2);
    }

    // implementation of lowCapacity method
    public void lowCapacity()
    {
        array = Arrays.copyOf(array, array.length / 2);
    }

    // implementation method that of add item on certain index
    public void add(int index, T item)
    {
        if (index > size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Invalid index:" + index);
        }
        if (size + 1 == array.length)
        {

            enshureCapacity();
        }
        T[] arrHolder = array;
        System.arraycopy(array, 0, arrHolder, 0, index);
        size++;
        System.arraycopy(array, index, arrHolder, index + 1, size - index - 1);
        arrHolder[index] = item;
        array = arrHolder;
    }

    // return size of the list
    public int size()
    {
        return size;
    }

    @Override
    public String toString()
    {

        return Arrays.toString(array);

    }

    public T remoove(int index)
    {
        T itemOnCurrentIndex = array[index];

        if (index > size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Invalid index" + index);

        }

        System.arraycopy(array, index + 1, array, index, (size - index + 1));
        array[size - 1] = null;
        size--;

        return itemOnCurrentIndex;
    }

}

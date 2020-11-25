package Day03_Integer_list;

public class ArrayIntegerList implements IntegerList {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    int[] source;

    public ArrayIntegerList() {
        source = new int[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(int element) {
        if (size == source.length)
            increaseCapacity();

        source[size++] = element;
        //   source[size] = element;
        //   size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return source[index];
    }

    @Override
    public void set(int index, int value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        int oldValue = source[index];
        source[index] = value;
    }

    @Override
    public int removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        int oldValue = source[index];
        if (index == size - 1) {
            size--;
            source[size - 1] = 0;
        } else {
            for (int i = index; i < size - 2; i++) {
                source[i] = source[i + 1];
            }
            source[size - 1] = 0;
            size--;
        }
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            source[i] = 0;

        size = 0;
    }
}

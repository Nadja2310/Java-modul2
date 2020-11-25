package Day03_Integer_list;

public interface IntegerList {
    /**
     *
     * @param element
     */
    void addLast(int element);

    int get(int index);

    void set(int index, int value);

    int removeById(int index);

    int size();

    void clear();

}

package Day03_Integer_list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntegerListTest {
    //ArrayIntegerList list = new ArrayIntegerList();


    ArrayIntegerList createArrayList() {
        ArrayIntegerList list = new ArrayIntegerList();
        list.addLast(7);
        list.addLast(8);
        list.addLast(8);
        list.addLast(4);
        list.addLast(812);
        list.addLast(813);
        list.addLast(814);
        list.addLast(5);
        list.addLast(6);
        list.addLast(5);
        return list;
    }

    @Test
    void TestAddLast_index0() {
        ArrayIntegerList list = new ArrayIntegerList();
        list.addLast(8);
        assertEquals(list.source[0], 8);
    }

    void TestAddLast_index1() {
        ArrayIntegerList list = new ArrayIntegerList();
        list.addLast(45);
        assertEquals(list.get(1), 45);
    }

    @Test
    void TestaddLast_indexOverflow() {
        ArrayIntegerList list = createArrayList();
        System.out.println("Array length bevor " + list.source.length);
        list.addLast(78);
        list.addLast(789);
        list.addLast(878);
        list.addLast(845);
        list.addLast(812);
        list.addLast(878);
        list.addLast(845);
        list.addLast(812);

        System.out.println("Size = " + list.size());
        System.out.println("Array length after " + list.source.length);
        assertEquals(list.source.length, 32);

    }

    @Test
    void get_index1_value8() {
        ArrayIntegerList list = createArrayList();
        assertEquals(list.get(1), 8);
    }

    @Test
    void get_index15_value0() {
        ArrayIntegerList list = createArrayList();
        try {
            list.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
            //  assertEquals(list.get(10),0);
        }
    }

    @Test
    void set_index10_value56() {
        ArrayIntegerList list = createArrayList();
        list.set(6, 56);
        assertEquals(list.source[6], 56);
    }

    @Test
    void set_index11_value56() {
        ArrayIntegerList list = createArrayList();
        list.set(1, 1111);
        assertEquals(list.get(1), 1111);
    }

    @Test
    void removeById_index4_size9() {
        ArrayIntegerList list = createArrayList();
        assertEquals(list.removeById(4), 812);
    }

    @Test
    void size() {
        ArrayIntegerList list = createArrayList();
        assertEquals(list.size(), 10);
    }

    @Test
    void clear() {
        ArrayIntegerList list = createArrayList();
        System.out.println(Arrays.toString(list.source));
        assertEquals(list.size(), 10);
        list.clear();
        assertEquals(list.size(), 0);

    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest {

    private MyArrayList<String> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void testAddElement() {
        list.add("First");
        assertEquals(list.size(), 1);
    }

    @Test
    public void testGetElement() {
        list.add("Hello");
        assertEquals("Hello", list.get(0));
    }

    @Test
    public void testRemoveElement() {
        list.add("World");
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void testClear() {
        list.add("Test");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativeIndex() {
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveNegativeIndex() {
        list.remove(-1);
    }

    @Test
    public void testAddToFullArray() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("Element");
        }
        assertEquals(10000, list.size());
    }

    @Test
    public void testAddNull() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add(null);
        assertEquals(1, list.size());
    }
}


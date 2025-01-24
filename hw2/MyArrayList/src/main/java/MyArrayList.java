import java.util.Comparator;

/**
 * MyArrayList - это реализация динамического массива с использованием generics.
 * Этот класс предоставляет эффективный способ хранения и управления коллекцией объектов.
 *
 * @param <T> Тип элементов, которые могут быть добавлены в коллекцию
 */
public class MyArrayList<T> {
    private Object[] array;
    public int size;

    /**
     * Конструктор по умолчанию. Инициализирует пустой массив длиной 10.
     */
    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }

    /**
     * Добавляет элемент в конец коллекции.
     *
     * @param element Элемент для добавления в коллекцию
     * @throws IndexOutOfBoundsException Если указан недопустимый индекс
     */
    public void add(T element) {
        if (size == array.length) {
            resize();
        }
        array[size] = element;
        size++;
    }
    /**
     * Добавляет элемент в указанную позицию коллекции.
     *
     * @param index Позиция для вставки элемента
     * @param element Элемент для добавления
     * @throws IndexOutOfBoundsException Если указан недопустимый индекс
     */
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            resize();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    /**
     * Получает элемент из коллекции по указанному индексу.
     *
     * @param index Индекс элемента для получения
     * @return Возвращаемое значение элемента
     * @throws IndexOutOfBoundsException Если указан недопустимый индекс
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    /**
     * Удаляет элемент из коллекции по указанному индексу.
     *
     * @param index Индекс элемента для удаления
     * @throws IndexOutOfBoundsException Если указан недопустимый индекс
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    /**
     * Очищает всю коллекцию, удаляя все элементы.
     */
    public void clear() {
        size = 0;
    }

    /**
     * Сортирует коллекцию с помощью указанного компаратора.
     *
     * @param comparator Компаратор для сортировки элементов
     */
    public void sort(Comparator<T> comparator) {
        quickSort(0, size - 1, comparator);
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private void quickSort(int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int pivotIndex = partition(low, high, comparator);
            quickSort(low, pivotIndex - 1, comparator);
            quickSort(pivotIndex + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<T> comparator) {
        T pivot = (T) array[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (comparator.compare((T) array[j], pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public String join(String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(separator);
            sb.append(get(i));
        }
        return sb.toString();
    }

    public double size() {
        return size++;
    }

}

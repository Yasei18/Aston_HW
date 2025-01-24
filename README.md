// Homework_1

package com.aston.javabase;

public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        return null;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        return null;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        return false;
    }
}

// Homework_2

public class Homework {

    1. Реализовать MyArrayList.
 Методы, обязательные к реализации:
- добавить элемент: add(T element), 
- добавить элемент по индексу: add(int index, T element), 
- получить элемент: get(int index), 
- удалить элемент remove(int index), 
- очистить всю коллекцию: clear(), 
- отсортировать коллекцию: sort(Comparator<T> comparator), 
остальное по желанию.

2. Реализовать алгоритм quicksort для реализованного вами MyArrayList.
Ваш QuickSort должен принимать список любого типа и сортировать его. Использовать: 
○ Java generics 
○ Comparable, Comparator

3. Документировать код. Что, зачем и как. Все классы и интерфейсы должны быть
задокументированы на уровне класса (class-level javadoc). Все публичные
методы ваших реализаций должны содержать javadoc. Документация должна
быть в полном объёме и представлять исчерпывающее и интуитивно понятное
руководство пользования вашим кодом для другого разработчика.

4. Необходимо убедиться, что методы могут корректно отрабатывать с различными типами данных и большим количеством данных.

}


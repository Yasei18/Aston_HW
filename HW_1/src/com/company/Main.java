package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String input = "I love Java";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        int[] originalArray = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int[] distinctArray = getDistinctNumbers(originalArray);

        System.out.println("\nOriginal array:");
        printArray(originalArray);

        System.out.println("\nDistinct array:");
        printArray(distinctArray);

        int[] testArray = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        Integer secondMax = findSecondMaxElement(testArray);
        System.out.println("\nSecond max element: " + secondMax);

        String testString = "    fly me    to the moon    ";
        Integer lastWordLength = lengthOfLastWord(testString);
        System.out.println("\nLength of last word: " + lastWordLength);

        String palindromeTest = "112211";
        boolean isPalindrome = isPalindrome(palindromeTest);
        System.out.println("\nIs palindrome: " + isPalindrome);
    }

    public static String reverseString(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }

    public static int[] getDistinctNumbers(int[] ints) {
        Set<Integer> set = new HashSet<>();
        for (int num : ints) {
            set.add(num);
        }
        return new ArrayList<>(set).stream().mapToInt(Integer::intValue).toArray();
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static Integer findSecondMaxElement(int[] arr) {
        if (arr.length < 2) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax == Integer.MIN_VALUE ? null : secondMax;
    }

    public static Integer lengthOfLastWord(String string) {
        // Удаляем все пробелы с начала строки
        string = string.trim();

        // Найдем последнее пробел
        int lastSpaceIndex = string.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            // Если нет пробелов, то вся строка - последнее слово
            return string.length();
        } else {
            // Возвращаем длину слова после последнего пробела
            return string.substring(lastSpaceIndex + 1).length();
        }
    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


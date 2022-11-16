package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String i: array) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length/2; i++){
            String arrayCopy = array[i];
            array[i] = array[array.length - i -1];
            array[array.length -i - 1] = arrayCopy;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i=0;i<array.length;i++){
            if (!array[i].equals(array[array.length - i - 1]))
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String newArray = Arrays.toString(array).toLowerCase();

        for (char i = 'a'; i <= 'z'; i++){
            if (!newArray.contains(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurance = 0;
        for (String i : array){
            if (i == value){
                occurance++;
            }
        }
        return occurance;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> arr = new ArrayList<String>();
        int removed = 0;
        for (String i : array){
            if (!(i == valueToRemove)){
                arr.add(i);
                removed++;
            }
        }
        return arr.toArray(new String[removed]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> arr = new ArrayList<String>();
        String[] arrayCopy = new String[arr.size()];

        for (int i = 0; i < array.length -1; i++){
            if (array[i] != array[i + 1]){
                arr.add(array[i]);
            }
        }
        arr.add(array[array.length -1]);
        arrayCopy = arr.toArray(arrayCopy);
        return arrayCopy;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;
    }


}

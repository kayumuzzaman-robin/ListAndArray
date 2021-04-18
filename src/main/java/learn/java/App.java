package learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List & Array
 */
public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer[] x = {6, 7, 8, 9, 10};

//      List to Array
        Integer[] listToArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

//      Array to List
        List<Integer> arrayToList = new ArrayList<>();
        arrayToList = Arrays.asList(x);
        System.out.println(arrayToList);

    }
}

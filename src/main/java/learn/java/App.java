package learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
//      Add value 0 at index 0 & all index will shift by 1 place, no data will remove or replace
        list.add(0, 0);
//      Add value 10 at index 1 by replacing the previous value of index 1 which was 1
        list.set(1, 10);
//      sort a list & sorted list will be set to the list
        Collections.sort(list, Collections.reverseOrder());

        Integer[] x = {6, 7, 8, 9, 10};

//      List to Array
        Integer[] listToArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

//      Array to List
        List<Integer> arrayToList;
        arrayToList = Arrays.asList(x);
        System.out.println(arrayToList);

    }
}

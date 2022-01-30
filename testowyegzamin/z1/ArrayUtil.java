package pl.edu.uwm.gkrych.testowyegzamin.z1;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] tab){
        boolean isSorted = true;

        for(int i = 0; i < tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) > 0){
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}

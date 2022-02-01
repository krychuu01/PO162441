package EGZ_162441_E01.Z1;

public class ArrayUtil {

    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab){
        boolean jestPalind = true;
        for(int i = 0; i < tab.length/2; i++){
            if(tab[i].compareTo(tab[tab.length-1-i]) < 0){
                jestPalind = false;
                break;
            }
        }


        return jestPalind;
    }

}

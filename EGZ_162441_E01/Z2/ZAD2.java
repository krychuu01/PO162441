package EGZ_162441_E01.Z2;

import java.util.*;

public class ZAD2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,2,1,2,1,2));
        Set<Integer> set = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9));
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(1,2,3,4,5,6));

        wypiszCoDrugi(arrayList);
        System.out.println(" ");
        System.out.println("----");
        wypiszCoDrugi(set);
        System.out.println(" ");
        System.out.println("----");
        wypiszCoDrugi(treeSet);
    }

    public static <E extends Iterable<?>> void wypiszCoDrugi(E dowolny_obiekt){
        Iterator<?> iterator = dowolny_obiekt.iterator();
        int coDrugi = 0;
        System.out.print(iterator.next());
        while(iterator.hasNext()){
            if(coDrugi % 2 == 1){
                System.out.print(", " + iterator.next());
            }
            else {
                iterator.next();
            }
            coDrugi++;
        }

    }
}

import java.util.ArrayList;
import java.util.Collections;

public class labpiaty {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<Integer>(a.size() + b.size() + 1);

        temp.addAll(0, a);
        temp.addAll(a.size(), b);

        return temp;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<Integer>(a.size() + b.size() + 1);
        int i = 0;

            while (a.size() > i && b.size() > i){
                temp.add(0,a.get(i));
                temp.add(0,b.get(i));
                i++;
            }
            if (a.size() > i){
                while(a.size() > i){
                    temp.add(0,a.get(i));
                    i++;
                }
            }
            if (b.size() > i){
                while(b.size() > i){
                    temp.add(0,b.get(i));
                    i++;
                }
            }

        Collections.reverse(temp);
        return temp;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a , ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<Integer>(a.size() + b.size() + 1);
        int i = 0;
        int j = 0;
        Collections.sort(a);
        Collections.sort(b);

        while(a.size()-1 > i-1 && b.size()-1 > j-1){
            if(a.get(i) > b.get(j)){
                temp.add(b.get(j));
                j++;
            }
            else{
                temp.add(a.get(i));
                i++;
            }

        }

        if (a.size() > i){
            while(a.size() > i){
                temp.add(temp.size(),a.get(i));
                i++;
            }
        }

        if (b.size() > j){
            while(b.size() > j){
                temp.add(temp.size(),b.get(j));
                j++;
            }
        }

        return temp;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<Integer>(a.size());

        for(int i = 0; i < a.size(); i++){
            temp.add(a.get(a.size()-i-1));
        }

        return temp;
    }

    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<Integer>(a.size());
        for(int i = 0; i < a.size(); i++){
            temp.add(a.get(a.size()-i-1));
        }

        a.clear();
        for(int i = 0; i < temp.size(); i++){
            a.add(temp.get(i));
        }
    }


    public static void main(String[] args){

        // 1 zadanie
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println("Zadanie pierwsze: ");
        System.out.println(append(a,b));

        // 2 zadanie
        System.out.println("Zadanie drugie: ");
        System.out.println(merge(a,b));

        // 3 zadanie
        System.out.println("Zadanie trzecie");
        System.out.println(mergeSorted(a,b));

        // 4 zadanie
        System.out.println("Zadanie czwarte");
        ArrayList<Integer> d = new ArrayList<Integer>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println(reversed(d));

        // 5 zadanie
        System.out.println("Zadanie piate");
        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(4);
        e.add(5);
        System.out.println("Przed uzyciem metody reverse: " + e);
        reverse(e);
        System.out.println("Po uzyciu metody reverse: " + e);

    }
}

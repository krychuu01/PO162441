package pl.edu.uwm.gkrych.lab05;

import java.util.ArrayList;
import java.util.Objects;

public class integerSet{

    private final ArrayList<Integer> list;

    public integerSet(ArrayList<Integer> list){
        this.list = list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>(a.size() + b.size());
        temp.addAll(a);
        temp.addAll(b);
        return temp;
    }

    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>(a.size());
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < b.size(); j++){
                if (Objects.equals(a.get(i), b.get(j))){
                    temp.add(a.get(i));
                }
            }
        }
        return temp;
    }

    public void insertElement(int n){
        list.add(n);
    }

    public void deleteElement(int n){
        list.remove(n);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Integer integer : list) {
            temp.append(integer).append(" ");
        }
        return temp.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        integerSet integers = (integerSet) o;
        return Objects.equals(list, integers.list);
    }


//    public boolean equals(ArrayList<Integer> a, ArrayList<Integer> b){
//
//    }


}

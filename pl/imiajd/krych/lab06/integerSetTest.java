package pl.edu.uwm.gkrych.lab05;

import java.util.ArrayList;

class integerSetTest extends integerSet{

    public integerSetTest(ArrayList<Integer> list) {
        super(list);
    }

    public static void main(String[] args){
        // union
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        list3.add(1); list3.add(2); list3.add(3);
        list3.add(4); list3.add(5); list4.add(6);
        ArrayList<Integer> list5;
        list5 = union(list3, list4);
        System.out.println(list5);

        // intersection
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();
        list6.add(1); list6.add(2); list6.add(3);
        list7.add(3); list7.add(2); list7.add(6);
        ArrayList<Integer> list8;
        list8 = intersection(list6, list7);
        System.out.println(list8);

        //insertElement
        integerSet list1 = new integerSet(new ArrayList<>());
        list1.insertElement(1);
        list1.insertElement(2);
        list1.insertElement(3);
        integerSet list2 = new integerSet(new ArrayList<>());
        list2.insertElement(1);
        list2.insertElement(2);
        list2.insertElement(3);

        //deleteElement
        System.out.println("Before deleteElement method: " + list2);
        list2.deleteElement(1);
        System.out.println("After deleteElement method: " + list2);

        //equals
        System.out.println(list1.equals(list2));
    }
}

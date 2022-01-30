package pl.edu.uwm.gkrych.testowyegzamin.z3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Trzecie {
    public static void main(String[] args) {
        String[] strings = zwrocPliki("C://Users//Grzegorz//IdeaProjects//PO162441//pl");
        System.out.println(Arrays.toString(strings));
    }

    public static String[] zwrocPliki(String sciezka){
        File file = new File(sciezka);
        return file.list((dir, name) -> true);
    }
}

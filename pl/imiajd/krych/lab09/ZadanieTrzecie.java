package pl.imiajd.krych;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ZadanieTrzecie {
    public static void main(String[] args){

        ArrayList<String> tekst = new ArrayList<>();
        try{
            File file = new File("C:\\Users\\Grzegorz\\IdeaProjects\\lab08\\src\\pl\\imiajd\\krych\\tekst.txt");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                tekst.add(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje");
            e.printStackTrace();
        }

        tekst.sort(Comparator.naturalOrder());
        System.out.println(tekst);
    }
}

package pl.imiajd.krych;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZadanieTrzecie {
    public static void main(String[] args){

        try{
            File file = new File("C:\\Users\\Grzegorz\\IdeaProjects\\lab08\\src\\pl\\imiajd\\krych\\tekst.txt");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                String tekst = read.nextLine();
                System.out.println(tekst);
            }
            read.close();
        } catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje");
            e.printStackTrace();
        }

    }
}

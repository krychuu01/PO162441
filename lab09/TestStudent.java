package pl.imiajd.krych;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStudent {
    public static void main(String[] args){

        ArrayList<Student> studenci = new ArrayList<>(5);
        studenci.add(new Student("Grzegorz", LocalDate.of(2001, 11, 24), 4.5));
        studenci.add(new Student("Adam", LocalDate.of(2001, 11, 24), 5.0));
        studenci.add(new Student("Adam", LocalDate.of(2001, 11, 24), 3.0));
        studenci.add(new Student("Piotr", LocalDate.of(2001, 11, 24), 4.5));
        studenci.add(new Student("Andrzej", LocalDate.of(2001, 11, 24), 4.5));

        System.out.println("Przed sortowaniem:");
        for (Student student: studenci) {
            System.out.println(student);
        }

        // oba sposoby sortuja w ten sam sposob
        // Collections.sort(studenci);
        studenci.sort(Comparator.naturalOrder());

        System.out.println("Po sortowaniu:");
        for (Student student: studenci) {
            System.out.println(student);
        }

    }
}

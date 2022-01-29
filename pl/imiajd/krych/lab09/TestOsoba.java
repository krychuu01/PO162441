package pl.imiajd.krych;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Grzegorz", LocalDate.of(2001,11,24)));
        grupa.add(new Osoba("Adam", LocalDate.of(1410,1,4)));
        grupa.add(new Osoba("Adam", LocalDate.of(2001,10,14)));
        grupa.add(new Osoba("Piotr", LocalDate.of(2000,11,24)));
        grupa.add(new Osoba("Piotr", LocalDate.of(2000,11,24)));

        System.out.println("Przed sortowaniem:");
        for (Osoba osoba : grupa) {
            System.out.println(osoba);
        }

        // oba sposoby sortuja w ten sam sposob
        // Collections.sort(grupa);
        grupa.sort(Comparator.naturalOrder());
        System.out.println("Po sortowaniu:");

        for (Osoba osoba : grupa) {
            System.out.println(osoba);
        }

    }
}

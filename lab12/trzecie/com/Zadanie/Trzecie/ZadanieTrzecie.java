package com.Zadanie.Trzecie;

public class ZadanieTrzecie {

    public static void main(String... args) {
        StudentList lista = new StudentList();
        lista.dodajStudenta("Grzegorz", "Krych");
        lista.dodajStudenta("Grzegorz", "Krych");
        lista.dodajStudenta("Adam", "Kowalski");
        lista.dodajStudenta("Adi", "Nowak");
        lista.zmienOcene(1,"bdb");
        lista.zmienOcene(2, "bdb");
        lista.wyswietlListeStudentow();

    }

}

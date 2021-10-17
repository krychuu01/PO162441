package pl.edu.uwm.gkrych.lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class lab02 {

    public static int silnia(int x){
        int wynik_silni = 1;
        for(int i = 1; i <= x; i++){
            wynik_silni = wynik_silni * i;
        }
        return wynik_silni;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n :");
        int n = Integer.parseInt(scan.nextLine());

        // zadanie 1 a)

//        int suma = 0;
//        int liczba = 0;

//        for(int i = 0; i < n; i++){
//           System.out.println("Podaj liczbe ktora chcesz dodac: ");
//           liczba = Integer.parseInt(scan.nextLine());
//           suma = suma + liczba;
//        }

//        System.out.println("Suma tych liczb: " + suma);

//         zadanie 1 b)
//
//        int iloczyn = 1;
//        int liczba = 0;

//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            iloczyn = iloczyn * liczba;
//        }

//        System.out.println("Iloczyn tych liczb: " + iloczyn);


//        // zadanie 1 c)
//        int suma = 0;
//        int liczba = 0;
//
//        for (int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            suma = suma + Math.abs(liczba);
//        }

//        System.out.println("Suma tych liczb: " + suma);

        // zadanie 1 d)

//        double suma_bezwzgledna = 0;
//        double liczba = 0.0;
//
//        for (int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = scan.nextDouble();
//            suma_bezwzgledna = suma_bezwzgledna + Math.sqrt(Math.abs(liczba));
//        }

//        System.out.println("Suma bezwzględna tych liczb: " + suma_bezwzgledna);

        //zadanie 1 e)

//        int iloczyn = 1;
//        int liczba = 0;

//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            iloczyn = iloczyn * Math.abs(liczba);
//        }
//
//        System.out.println("Iloczyn tych liczb: " + iloczyn);

        // zadanie 1 f)

//        double suma = 0;
//        int liczba = 0;

//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            suma = suma + Math.pow(liczba, 2);
//        }

//        System.out.println("Suma tych liczb: " + suma);

        // zadanie 1 g)

//        int suma = 0;
//        int iloczyn = 1;
//        int liczba = 0;

//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            suma = suma + liczba;
//            iloczyn = iloczyn * liczba;
//        }

//        System.out.println("Suma tych liczb: " + suma);
//        System.out.println("Iloczyn tych liczb: " + iloczyn);

        // zadanie 1 h)

//        int wynik = 0;
//        int liczba = 0;
//
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            if (i % 2 == 0) {
//                wynik = wynik + liczba;
//            }
//            else {
//                wynik = wynik - liczba;
//            }
//        }
//
//        System.out.println("Wynik tych liczb: " + wynik);

        // zadanie 1 i)

//        double wynik = 0;
//        double liczba = 0;
//
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = scan.nextDouble();
//            if (i % 2 == 0) {
//                wynik = wynik - liczba/silnia(i);
//            }
//            else {
//                wynik = wynik + liczba/silnia(i);
//            }
//        }
//
//        System.out.println("Wynik tych liczb: " + wynik);

        // zadanie 1.2

//        int liczba = 0;
//        int na_koniec = 0;
//        List abc = new ArrayList(n+1);
//        for(int i = 0; i < n; i ++){
//            System.out.println("Podaj liczbe ktora chcesz dodac: ");
//            liczba = Integer.parseInt(scan.nextLine());
//            if(i == 0){
//                na_koniec = liczba;
//            }
//            if(i >= 1){
//                abc.add(liczba);
//            }
//        }
//        abc.add(na_koniec);
//
//        // wyswietlanie listy
//        for(int i = 0; i < n; i++){
//            System.out.print(abc.get(i));
//        }

        // Zadanie 2.2

//        double liczba = 0.0;
//        double wynik = 0.0;
//
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe: ");
//            liczba = scan.nextDouble();
//            if(liczba > 0){
//                wynik = wynik + liczba;
//            }
//        }
//        wynik = wynik * 2;
//        System.out.print("Wynik = " + wynik);

        // Zadanie 2.3
//        int dodatnie = 0;
//        int ujemne = 0;
//        int zera = 0;
//        double liczba = 0;
//
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe: ");
//            liczba = scan.nextDouble();
//            if (liczba < 0){
//                ujemne++;
//            }
//
//            if (liczba == 0){
//                zera++;
//            }
//
//            if (liczba > 0){
//                dodatnie++;
//            }
//
//        }
//        System.out.print("Liczb ujemnych jest: " + ujemne + "\n" +
//                        "Liczba zer: " + zera + "\n" + "Liczb dodatnich jest: " + dodatnie);

        // Zadanie 2.4

//        double najwieksza = 0.0;
//        double najmniejsza = 0.0;
//        ArrayList<Double> lista_wszystkich_liczb = new ArrayList<Double>(n);
//        double liczba = 0.0;
//
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe: ");
//            liczba = scan.nextDouble();
//            lista_wszystkich_liczb.add(liczba);
//        }
//
//        // znalezienie najmniejszej i najwiekszej liczby z tablicy
//        najmniejsza = lista_wszystkich_liczb.get(0);
//        najwieksza = lista_wszystkich_liczb.get(0);
//
//        for(int i = 0; i < n; i++){
//            if(lista_wszystkich_liczb.get(i) < najmniejsza){
//                najmniejsza = lista_wszystkich_liczb.get(i);
//            }
//            if(lista_wszystkich_liczb.get(i) > najwieksza){
//                najwieksza = lista_wszystkich_liczb.get(i);
//            }
//        }
//
//        System.out.print("Najmniejsza z wczytanych liczb: " + najmniejsza + "\n" +
//                         "Najwieksza z wczytanych liczb: " + najwieksza);

        // Zadanie 2.5

//        double liczba = 0.0;
//        ArrayList<Double> lista_wszystkich_liczb = new ArrayList<Double>(n);
//
//        // wczytanie wszystkich liczb do tablicy
//        for(int i = 0; i < n; i++){
//            System.out.println("Podaj liczbe: ");
//            liczba = scan.nextDouble();
//           lista_wszystkich_liczb.add(liczba);
//        }
//
//        // petla wyswietlajaca pary liczb wieksze niz 0
//        for(int j = 0; j < n-1; j++){
//            double a = lista_wszystkich_liczb.get(j);
//            double b = lista_wszystkich_liczb.get(j+1);
//            // jeśli obie liczby są wieksze od 0 to je wyswietl
//            // w przeciwnym wypadku idz dalej
//            if(a > 0 && b > 0){
//                System.out.print("(" + a + "," + b + ")");
//            }
//        }

    }
}

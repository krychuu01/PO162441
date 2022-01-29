package pl.edu.uwm.gkrych.pl.imiajd.krych.trzecilab;

import java.util.*;
import java.lang.Math;

public class labtrzeci {

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            temp =
            tab[i] = temp;
        }

    }

    public static int generate(){
        int temp = 0;
        int minWartosc = 1;
        int maxWartosc = 10;
        temp = minWartosc + (int)(Math.random() * ((maxWartosc - minWartosc) + 1));
        return temp;
    }

    public static void wyswietl(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }

    public static int ileNieparzystych(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] % 2 != 0){
                temp++;
            }
        }

        return temp;
    }

    public static int ileParzystych(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] % 2 == 0){
                temp++;
            }
        }
        return temp;
    }

    public static int ileDodatnich(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] > 0){
                temp++;
            }
        }
        return temp;
    }

    public static int ileUjemnych(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] < 0){
                temp++;
            }
        }
        return temp;
    }

    public static int ileZerowych(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] == 0){
                temp++;
            }
        }
        return temp;
    }

    public static int ileMaksymalnych(int[] tab){
        int temp = tab[0];
        int ilosc = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] > temp){
                temp = tab[i];
            }
        }

        for(int j = 0; j < tab.length; j++){
            if (tab[j] == temp){
                ilosc++;
            }
        }

        return ilosc;
    }

    public static int sumaDodatnich(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] > 0){
                temp+= tab[i];
            }
        }
        return temp;
    }

    public static int sumaUjemnych(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] < 0){
                temp+= tab[i];
            }
        }
        return temp;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int temp = 0;
        int najdluzszy = 0;

        for(int i = 0; i < tab.length; i++){

            if (tab[i] > 0){
                temp++;
            }

            if (najdluzszy < temp){
                najdluzszy = temp;
            }

            if (tab[i] < 0){
                temp = 0;
            }

        }
        return najdluzszy;
    }

    public static void singum(int[] tab){
        int temp = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] < 0){
                tab[i] = -1;
            }

            if (tab[i] > 0){
                tab[i] = 1;
            }

        }

        System.out.println("Tablica pl.edu.uwm.gkrych.pl.imiajd.krych.po zmianie: ");
        wyswietl(tab);
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy){

        int[] temp = new int[1+prawy-lewy];

        if(lewy < 1 || prawy < 1 || lewy > tab.length || prawy > tab.length){
            System.out.println("Podano bledny rozmiar");
            return;
        }

        int abc = 0;

        for(int i = lewy; i <= prawy; i++){
            temp[abc] = tab[i];
            abc += 1;
        }

        abc = 0;

        for(int i = prawy; i >= lewy; i--){
            tab[i] = temp[abc];
            abc += 1;
        }

    }

    public static void main(String[] args){

        // potrzebne do zadania 2 \/\/\/

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe z przedialu 1-100 :");
//        int n = Integer.parseInt(scan.nextLine());
//
//        if (n > 100 || n < 1){
//            System.out.println("Podano liczbe z poza przedzialu!");
//            System.exit(0);
//        }
//
//        int[] tablica = new int[n];
//        int min = -999;
//        int max = 999;
//        generuj(tablica, n, min, max);
//        wyswietl(tablica);
//        System.out.println("");

        // potrzebne do zadania 2 /\/\/\

        // 2a)

//        System.out.println("Nieparzystych: " + ileNieparzystych(tablica));
//        System.out.println("Parzystych: " + ileParzystych(tablica));
//
//        // 2b)
//
//        System.out.println("Dodatnich: " + ileDodatnich(tablica));
//        System.out.println("Ujemnych: " + ileUjemnych(tablica));
//        System.out.println("Zerowych: " + ileZerowych(tablica));
//
//        // 2c)
//
//        System.out.println("Maksymalnych: " + ileMaksymalnych(tablica));
//
//        // 2d)
//
//        System.out.println("Suma dodatnich: " + sumaDodatnich(tablica));
//        System.out.println("Suma ujemnych: " + sumaUjemnych(tablica));
//
//        // 2e)

//        System.out.println("Dlugosc maksymalnego ciagu dodatnich : " + dlugoscMaksymalnegoCiaguDodatnich(tablica));

          // 2f)

//        singum(tablica);

          //  2g)

//          System.out.println("Tablica pl.edu.uwm.gkrych.pl.imiajd.krych.po zmianie: ");
//          odwrocFragment(tablica, 1, 3);
//          wyswietl(tablica);

        // 3

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 cyfry z przedialu 1-10 :");

        int m = Integer.parseInt(scan.nextLine());

        if (m > 10 || m < 1){
            System.out.println("Podano liczbe z poza przedzialu! (m)");
            System.exit(0);
        }

        int n = Integer.parseInt(scan.nextLine());

        if (n > 10 || n < 1 ){
            System.out.println("Podano liczbe z poza przedzialu! (n)");
            System.exit(0);
        }

        int k = Integer.parseInt(scan.nextLine());

        if (k > 10 || k < 1){
            System.out.println("Podano liczbe z poza przedzialu! (k)");
            System.exit(0);
        }

        int[][] macierz_A = new int[m][n];
        int[][] macierz_B = new int[n][k];
        int[][] macierz_C = new int[m][k];
        int[] temp = new int[100];
        int i = 0;
        int j = 0;
        int x = 0;

        // wygenerowanie wartosci poszczegolnych elementow macierzy
        for(i = 0; i < m; i ++){
            for(j = 0; j < n; j++){
                macierz_A[i][j] = generate();
            }
        }

        for(i = 0; i < n; i ++){
            for(j = 0; j < k; j++){
                macierz_B[i][j] = generate();
            }
        }

        // wyswietlenie macierzy A
        System.out.println("Macierz_A: ");
        for(i = 0; i < m; i ++){
            for(j = 0; j < n; j++){
                System.out.print(macierz_A[i][j] + " ");
            }
            System.out.println("");
        }

        // wyswietlenie macierzy B
        System.out.println("Macierz_B: ");
        for(i = 0; i < n; i ++){
            for(j = 0; j < k; j++){
                System.out.print(macierz_B[i][j] + " ");
            }
            System.out.println("");
        }

        // obliczanie iloczynu macierzy A i B i wpisywanie wynikow do macierzy C
        for(i = 0; i < m; i++){
            for(j = 0; j < k; j++){
                for(int a = 0; a < n; a++){
                    macierz_C[i][j] += macierz_A[i][a] * macierz_B[a][j];
                }
            }
        }

        // wyswietlenie macierzy C
        System.out.println("Macierz_C: ");
        for(i = 0; i < m; i ++){
            for(j = 0; j < k; j++){
                System.out.print(macierz_C[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

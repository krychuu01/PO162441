import javax.swing.text.html.HTMLDocument;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

public class lab10 {

    public static void redukuj(LinkedList<String> pracownicy, int n){
        ArrayList<String> doUsuniecia = new ArrayList<>(pracownicy.size()/2);
        for(int i = 0; i < pracownicy.size(); i++){
            if ((i+1) % n == 0){
                doUsuniecia.add(pracownicy.get(i));
            }
        }

        for (String pasujacy : doUsuniecia){
            pracownicy.remove(pasujacy);
        }

    }

    public static <T> void redukujGene(LinkedList<T> lista, int n){
        ArrayList<T> doUsuniecia = new ArrayList<>(lista.size()/2);
        for(int i = 0; i < lista.size(); i++){
            if ((i+1) % n == 0){
                doUsuniecia.add(lista.get(i));
            }
        }

        for (T pasujacy : doUsuniecia){
            lista.remove(pasujacy);
        }
    }

    public static void odwroc(LinkedList<String> lista){
        LinkedList<String> kopia = new LinkedList<>(lista);
        for(int j = 0, i = lista.size()-1; i >= 0; i--, j++){
            lista.set(i, kopia.get(j));
        }

    }

    public static <T> void odwrocGen(LinkedList<T> lista){
        LinkedList<T> kopia = new LinkedList<>(lista);
        for(int j = 0, i = lista.size()-1; i >= 0; i--, j++){
            lista.set(i, kopia.get(j));
        }

    }

    public static String firstLetterUpperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String firstLetterLowerCase(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    // zad 5
    public static void odwrocSlowaWZdaniu(){
        Scanner input = new Scanner(System.in);
        StringBuffer strBuff = new StringBuffer();
        Stack<String> kolejka = new Stack<>();

        while(true){
            strBuff.append(input.nextLine());
            if (!(strBuff.charAt(strBuff.length()-1) == '.')){
                kolejka.add(String.valueOf(strBuff));
            }
            else{
                kolejka.add(String.valueOf(strBuff));
                break;
            }
            strBuff.delete(0, strBuff.length());
        }

        System.out.print(firstLetterUpperCase(kolejka.peek().substring(0,kolejka.pop().length()-1)) + ' ');
        int dlugosc = kolejka.size();

        for(int i = 0; i < dlugosc-1; i++){
            System.out.print(kolejka.pop() + ' ');
        }

        System.out.print(firstLetterLowerCase(kolejka.pop()) + '.');
    }

    // zad 6
    public static void podzielNaCyfry(Integer wczytanaLiczba){
        Stack<Integer> stos = new Stack<>();
        int ostatniaCyfra = wczytanaLiczba % 10;
        Double temp = wczytanaLiczba.doubleValue()/10;
        int length = wczytanaLiczba.toString().length();

        for(int i = 0; i < length; i++){
            stos.add(ostatniaCyfra);
            wczytanaLiczba = temp.intValue();
            temp = wczytanaLiczba.doubleValue()/10;
            ostatniaCyfra = wczytanaLiczba % 10;
        }

        while(length > 0){
            System.out.print(stos.pop() + " ");
            length--;
        }

    }

    public static void uzupelnijLiczbami(ArrayList<Integer> p, Integer sizeOfArray){
        for(int i = 2; i <= sizeOfArray; i++){
            p.add(i);
        }
    }

    // zad 7
    public static void sitoEratostenesa(Integer wczytanaLiczba){
        ArrayList<Integer> pierwsze = new ArrayList<>(wczytanaLiczba);

        uzupelnijLiczbami(pierwsze, wczytanaLiczba);

        for(int j = 2; j < Math.sqrt(wczytanaLiczba); j++){
            Integer finalJ = j;
            pierwsze.removeIf(n -> (n % finalJ == 0 && !n.equals(finalJ)));
        }

        System.out.println(pierwsze);

    }

    // zad 8
    public static <T extends Iterable<?>> void print(T t){
        Iterator<?> i = t.iterator();
        while(i.hasNext()){
            System.out.print(i.next());;
            if(i.hasNext()){
                System.out.print(", ");
            }
        }
    }

    public static void main(String... args){
        LinkedList<String> ekipa = new LinkedList<>();
        ekipa.add("Jacek");
        ekipa.add("Tomek");
        ekipa.add("Gacek");
        ekipa.add("Piotrek");
        ekipa.add("Adam");
        ekipa.add("Wieslaw");
        ekipa.add("Czeslaw");
        System.out.println(ekipa);
        redukuj(ekipa,2);
        System.out.println(ekipa);
        odwroc(ekipa);
        System.out.println(ekipa);
        odwrocSlowaWZdaniu();
        podzielNaCyfry(2015);
        sitoEratostenesa(60);
        print(ekipa);
    }
}

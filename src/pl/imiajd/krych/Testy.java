package pl.imiajd.krych;

public class Testy {

    public static void main(String[] args){

        Osoba janek = new Osoba("Kowalski",1999);
        Nauczyciel nauczyciel = new Nauczyciel("Nowak", 1975, 5000.00);
        Student grzegorz = new Student("Krych",2001, "Informatyka");

        System.out.println(janek.getNazwisko());
        System.out.println(janek.getRokUrodzenia());
        System.out.println(janek.getClass());
        System.out.println(janek);

        System.out.println("---------------------");

        System.out.println(nauczyciel.getNazwisko());
        System.out.println(nauczyciel.getRokUrodzenia());
        System.out.println(nauczyciel.getClass());
        System.out.println(nauczyciel.getPensja());
        System.out.println(nauczyciel);

        System.out.println("---------------------");

        System.out.println(grzegorz.getNazwisko());
        System.out.println(grzegorz.getRokUrodzenia());
        System.out.println(grzegorz.getKierunek());
        System.out.println(grzegorz.getClass());
        System.out.println(grzegorz);

    }
}

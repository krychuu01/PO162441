//package pl.imiajd.krych;
//
//import java.time.LocalDate;
//
//public class TestOsoba
//{
//    public static void main(String[] args)
//    {
//        Osoba[] ludzie = new Osoba[2];
//
//        ludzie[0] = new Pracownik("Kowalski", new String[]{"Bartek", "Maria"}, LocalDate.of(1965, 10, 15), true, 15000, LocalDate.of(2000, 10, 10));
//        ludzie[1] = new Student("Nowak", new String[]{"Albert", "Jan"}, LocalDate.of(1999, 8, 22), true, "Informatyka", 3.0);
////        ludzie[2] = new pl.imiajd.krych.Osoba("Sowizdrzal", new String[]{"Piotr"}, LocalDate.of(1989, 3, 16), true);
//        // nie mozna utworzyc obiektu klasy abstakrycjnej
//
//        for (Osoba p : ludzie) {
//            System.out.println(p.getNazwisko() + ": " + p.getOpis());
//        }
//    }
//}
//
//abstract class Osoba
//{
//    private String nazwisko;
//    private String[] imiona;
//    private LocalDate dataUrodzenia;
//    private boolean plec;
//
//    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec)
//    {
//        this.nazwisko = nazwisko;
//        this.imiona = imiona;
//        this.dataUrodzenia = dataUrodzenia;
//        this.plec = plec;
//    }
//
//    public String[] getImiona() {
//        return imiona;
//    }
//
//    public LocalDate getDataUrodzenia() {
//        return dataUrodzenia;
//    }
//
//    public boolean isPlec() {
//        return plec;
//    }
//
//    public abstract String getOpis();
//
//    public String getNazwisko()
//    {
//        return nazwisko;
//    }
//
//}
//
//
//
//
//

package pl.edu.uwm.gkrych.lab05;

public class pracownikLocalDateTest extends pracownikLocalDate{

    public pracownikLocalDateTest(String nazwisko, double pobory, int year, int month, int day) {
        super(nazwisko, pobory, year, month, day);
    }

    public static void main(String[] args){

        // stworzenie tabeli "personel" na obiekty, czyli pracownikow
        pracownikLocalDate[] personel = new pracownikLocalDate[3];

        // wypelnienie tabeli danymi pracownikow
        personel[0] = new pracownikLocalDate("Krych", 10000, 2001, 11, 24);
        personel[1] = new pracownikLocalDate("Maklowicz", 10000, 1989, 9, 10);
        personel[2] = new pracownikLocalDate("Vladimirowitch", 1000000, 1959, 1, 4);

        // zwieksz pobory kazdego pracownika o 20%
        for (pracownikLocalDate e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o kazdym pracowniku
        for(int i = 0; i < personel.length; i++){
            System.out.println(personel[i].getNazwisko()+" "+ personel[i].getPobory()+" "+personel[i].getDataZatrudnienia());
        }

        // Poniższy fragment pokazuje problem naruszenia hermetyzacji
        // wynikający z niepoprawnie zaprogramowanej metody dataZatrudnienia()
        // nie dziala rowniez dlatego, gdyz uzyta zostala zla forma odwolania sie do pola dataZatrudnienia,
        // jest to pole private, wiec mozna sie do niego odwolac tylko z tego samego pliku w ktorym
        // zadeklarowana jest klasa posiadajaca te pole. Ponad to, powinno sie odwolywac poprzez "getter"
        // czyli metode getDataZatrudnienia()
        // LocalDate d = personel[0].dataZatrudnienia();


        double tenYearsInMiliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
//        d.setTime(d.getTime() - (long) tenYearsInMiliSeconds);

        for (pracownikLocalDate e : personel) {
            System.out.print("Nazwisko = " + e.getNazwisko() + "\tPobory = " + e.getPobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.getDataZatrudnienia());
        }

    }
}

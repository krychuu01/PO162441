package pl.imiajd.krych;

public class Adres {

    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(Adres ad){
        System.out.println("Kod pocztowy: " + ad.kod_pocztowy + "  Miasto:" + ad.miasto + "\n" + "Ulica: " + ad.ulica + "  Numer domu:" + ad.numer_domu + "  Numer mieszkania:" + ad.numer_mieszkania);
    }

    public boolean przed(Adres ad){
        //  jezeli wartosc biezacego kodu pocztowego jest przed
        // zwracamy true
        // inaczej zwracamy false
        int firstVal = Integer.parseInt(this.kod_pocztowy);
        int valueToBeChecked = Integer.parseInt(ad.kod_pocztowy);
//        if(firstVal < valueToBeChecked){ return true;}
//        return false;
        return firstVal < valueToBeChecked;
        // takie samo dzialanie jak kod zakomentowany wyzej

    }

}

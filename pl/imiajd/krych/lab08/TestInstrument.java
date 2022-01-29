package pl.imiajd.krych;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument {

    public static void main(String[] args){

        ArrayList<Instrument> orkiestra = new ArrayList<>(5);
        Instrument flet = new Flet("Fletorro", LocalDate.of(2008, 1, 1));
        Instrument flet2 = new Flet("Fleciska", LocalDate.of(2009,2,2));
        Instrument skrzypce = new Skrzypce("SuperSkrzypce", LocalDate.of(2007,5,5));
        Instrument skrzypce2 = new Skrzypce("SuperSkrzypce", LocalDate.of(1226,6,6));
        Instrument fortepian = new Fortepian("ForFortepians", LocalDate.of(998,3,5));

        orkiestra.add(flet);
        orkiestra.add(flet2);
        orkiestra.add(skrzypce);
        orkiestra.add(skrzypce2);
        orkiestra.add(fortepian);

        for(Instrument instrument : orkiestra){
            System.out.println(instrument.dzwiek());
        }

        System.out.println(orkiestra);
    }


}

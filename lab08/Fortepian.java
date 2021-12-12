package pl.imiajd.krych;

import java.time.LocalDate;

public class Fortepian extends Instrument {

    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "dzwiek fortepianu";
    }

}

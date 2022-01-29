package pl.imiajd.krych;

import java.time.LocalDate;

public class Skrzypce extends Instrument {

    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "skrzyyp skrzyyp";
    }

}

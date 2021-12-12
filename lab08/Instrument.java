package pl.imiajd.krych;

import java.time.LocalDate;

public abstract class Instrument {

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    private String producent;
    private LocalDate rokProdukcji;

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString(){
        return "Producent: " + this.producent + " Rok produkcji: " + this.rokProdukcji;
    }

    public boolean equals(Instrument otherObject){
        return this == otherObject;
    }

    public abstract String dzwiek();
}

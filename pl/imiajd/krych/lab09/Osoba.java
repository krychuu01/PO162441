package pl.imiajd.krych;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable {

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Object otherObject) {
        Osoba objectWithOtherObjectValues = (Osoba) otherObject;
        // method compare from String class who compare two strings, and ignore big or small letters
        int result = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), objectWithOtherObjectValues.getNazwisko());
        if (result == 0) {
            result = this.getDataUrodzenia().compareTo(objectWithOtherObjectValues.getDataUrodzenia());
        }
        return result;
    }


    @Override
    public String toString() {
        return "Klasa: " + getClass() + " Nazwisko: " + getNazwisko() + " Data Urodzenia: " + getDataUrodzenia();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        // If two objects have the same field values, then the objects are the same.
        Osoba objectWithOtherObjectValues = (Osoba) otherObject;
        return this.getNazwisko().equals(objectWithOtherObjectValues.getNazwisko()) &&
                this.getDataUrodzenia().equals(objectWithOtherObjectValues.getDataUrodzenia());
    }

    @Override
    public Osoba clone() {
        try {
            return (Osoba) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}




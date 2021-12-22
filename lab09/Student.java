package pl.imiajd.krych;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Object otherObject){
        Student objectWithOtherObjectValues = (Student) otherObject;
        // method compare from String class who compare two strings, and ignore big or small letters
        int result = String.CASE_INSENSITIVE_ORDER.compare(this.getNazwisko(), objectWithOtherObjectValues.getNazwisko());
        if (result == 0) {
            result = Double.compare(this.getSredniaOcen(), objectWithOtherObjectValues.getSredniaOcen());
            if(result == 0){
                result = this.getDataUrodzenia().compareTo(objectWithOtherObjectValues.getDataUrodzenia());
            }
        }
        return result;
    }

    @Override
    public Student clone() {
        return (Student) super.clone();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        // If two objects have the same field values, then the objects are the same.
        Student objectWithOtherObjectValues = (Student) otherObject;
        return this.getNazwisko().equals(objectWithOtherObjectValues.getNazwisko()) &&
                this.getDataUrodzenia().equals(objectWithOtherObjectValues.getDataUrodzenia()) &&
                this.getSredniaOcen() == objectWithOtherObjectValues.getSredniaOcen();
    }

    @Override
    public String toString(){
        return super.toString() + " srednia ocen: " + getSredniaOcen();
    }
}

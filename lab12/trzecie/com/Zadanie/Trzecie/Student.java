package com.Zadanie.Trzecie;

public class Student implements Comparable<Student>{
    private String imie;
    private String nazwisko;
    private Integer id;
    private static int count = 0;

    public Student(String imie, String nazwisko) {
        count++;
        this.id = count;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        int result = this.nazwisko.compareTo(student.nazwisko);

        if (result == 0){
            result = this.imie.compareTo(student.imie);

            if(result == 0){
                result = this.id.compareTo(student.id);
            }

        }
        return result;
    }

    @Override
    public String toString() {
        return id + ": " + nazwisko + " " + imie;
    }

}
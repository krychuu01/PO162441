package com.Zadanie.Trzecie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class StudentList {

    public HashMap<Integer, Student> indeksStudent;
    public HashMap<Student, String> studentOcena;

    public StudentList() {
        this.indeksStudent = new HashMap<>();
        this.studentOcena = new HashMap<>();
    }

    public void dodajStudenta(String imie, String nazwisko){
        Student student = new Student(imie, nazwisko);
        this.indeksStudent.put(student.getId(), student);
        this.studentOcena.put(student, "");
    }

    public void usunStudenta(Integer id){
        indeksStudent.remove(id);
    }

    public Student studentById(Integer id){
        return indeksStudent.get(id);
    }

    public void zmienOcene(Integer id, String ocena){
        studentOcena.replace(studentById(id), ocena);
    }

    public void wyswietlListeStudentow(){
        TreeMap<Student ,String> sorted = new TreeMap<>(this.studentOcena);
        for (Student s : sorted.keySet()) {
            System.out.println(s + ": " + this.studentOcena.get(s));
        }
        System.out.println();
    }

}

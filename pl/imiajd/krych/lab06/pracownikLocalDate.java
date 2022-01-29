package pl.edu.uwm.gkrych.lab05;

import java.time.LocalDate;

public class pracownikLocalDate {

        private final String nazwisko;
        private double pobory;
        private LocalDate dataZatrudnienia;

        public pracownikLocalDate(String nazwisko, double pobory, int year, int month, int day) {
            this.nazwisko = nazwisko;
            this.pobory = pobory;
            this.dataZatrudnienia = LocalDate.of(year, month, day);
        }

        public double getPobory(){
            return pobory;
        }

        public String getNazwisko(){
            return nazwisko;
        }

        public LocalDate getDataZatrudnienia() {
            return dataZatrudnienia;

        }

        public void zwiekszPobory(double procent) {
            double podwyzka = pobory * procent / 100;
            pobory += podwyzka;
        }

}

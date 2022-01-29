package pl.edu.uwm.gkrych.lab05;


public class testrachunekbankowy extends rachunekBankowy{

    public testrachunekbankowy(double saldo) {
        super(saldo);
    }

    public static void main(String[] args){

        rachunekBankowy saver1 = new rachunekBankowy(2000.00);
        rachunekBankowy saver2 = new rachunekBankowy(3000.00);
        setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%.2f%n", saver1.getSaldo());
        System.out.printf("%.2f%n", saver2.getSaldo());

        setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%.2f%n", saver1.getSaldo());
        System.out.printf("%.2f%n", saver2.getSaldo());
    }
}

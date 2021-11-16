package pl.edu.uwm.gkrych.lab05;

class rachunekBankowy {

    public static double rocznaStopaProcentowa;
    private double saldo;

    public rachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double rsp) {
        rocznaStopaProcentowa = rsp;
    }

    public void obliczMiesieczneOdsetki(){
        saldo += (saldo * rocznaStopaProcentowa) / 12;
    }

}

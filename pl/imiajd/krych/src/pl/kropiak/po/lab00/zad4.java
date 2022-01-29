public class zad4 {
    public static void main(String[] args){
        double saldo = 1000.00;
        double oprocentowanie = 0.06;
        double saldoPoOprocentowaniu = saldo * oprocentowanie;
        for(int i = 1; i <= 3; i++){
            saldoPoOprocentowaniu = saldo * oprocentowanie;
            saldo = saldo + saldoPoOprocentowaniu;
            System.out.println("Rok: " + i + "    Saldo konta:" + saldo);

        }
    }
}

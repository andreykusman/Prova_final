package Questao4;

public class MainQ4 {
    public static void main(String[] args) {
        FraudCheck chain = new ValueCheck();
        chain.setNext(new GeoCheck())
             .setNext(new DeviceCheck());

        Transaction t = new Transaction(4000, "Brasil", "iPhone");
        chain.check(t);
    }
}

package Questao4;

public class GeoCheck extends FraudCheck {
    @Override
    protected boolean execute(Transaction t) {
        return !t.location.equals("Rússia");
    }
}

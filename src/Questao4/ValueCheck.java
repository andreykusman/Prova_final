package Questao4;

public class ValueCheck extends FraudCheck {
    @Override
    protected boolean execute(Transaction t) {
        return t.value <= 5000;
    }
}

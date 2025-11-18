package Questao4;

public class DeviceCheck extends FraudCheck {
    @Override
    protected boolean execute(Transaction t) {
        return !t.device.equals("Desconhecido");
    }
}

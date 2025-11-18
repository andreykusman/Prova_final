package Questao3;

public class AlertModule implements SensorObserver {
    @Override
    public void update(SensorData data) {
        if (data.pollution > 70) {
            System.out.println("ALERTA: Poluição alta!");
        }
    }
}

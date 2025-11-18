package Questao3;

public class HistoryModule implements SensorObserver {
    @Override
    public void update(SensorData data) {
        System.out.println("Registrando histórico...");
    }
}

package Questao3;

public class ControlPanel implements SensorObserver {
    @Override
    public void update(SensorData data) {
        System.out.println("Painel atualizado: " + data.temperature);
    }
}

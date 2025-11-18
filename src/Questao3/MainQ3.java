package Questao3;

public class MainQ3 {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.subscribe(new ControlPanel());
        s.subscribe(new AlertModule());
        s.subscribe(new HistoryModule());

        s.newData(25, 60, 80);
    }
}

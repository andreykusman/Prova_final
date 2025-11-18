package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<SensorObserver> observers = new ArrayList<>();

    public void subscribe(SensorObserver obs) {
        observers.add(obs);
    }

    public void notifyAllObservers(SensorData data) {
        for (SensorObserver o : observers) {
            o.update(data);
        }
    }

    public void newData(double t, double h, double p) {
        notifyAllObservers(new SensorData(t, h, p));
    }
}

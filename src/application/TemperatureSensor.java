package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on;
    private Random randomNumber;

    public TemperatureSensor() {
        this.on = false;
        this.randomNumber = new Random();
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (!on) {
            throw new IllegalStateException("Temperature sensor is off.");
        };
        return randomNumber.nextInt(61) - 30;
    }
}

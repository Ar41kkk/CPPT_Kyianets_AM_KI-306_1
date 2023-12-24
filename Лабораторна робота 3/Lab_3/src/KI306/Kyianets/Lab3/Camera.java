package KI306.Kyianets.Lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Camera {
    private String model;
    private Lens lens;
    private Sensor sensor;

    // Абстрактний конструктор
    public Camera(String model, Lens lens, Sensor sensor) {
        this.model = model;
        this.lens = lens;
        this.sensor = sensor;
    }

    // Абстрактний метод для отримання інформації про камеру
    public abstract String getInfo();

    // Геттер для отримання моделі камери
    public String getModel() {
        return model;
    }

    // Геттер для отримання об'єктиву
    public Lens getLens() {
        return lens;
    }

    // Геттер для отримання сенсора
    public Sensor getSensor() {
        return sensor;
    }

    // Метод для запису повідомлень в лог-файл
    public void writeToLog(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Абстрактний метод для коректного завершення роботи
    public abstract void close();
}

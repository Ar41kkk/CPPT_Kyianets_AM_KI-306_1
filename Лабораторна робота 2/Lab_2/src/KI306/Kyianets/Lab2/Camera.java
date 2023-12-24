package KI306.Kyianets.Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Camera {
    private String model;
    private Lens lens;
    private Sensor sensor;

    // Конструктор класу Camera
    public Camera(String model, Lens lens, Sensor sensor) {
        this.model = model;
        this.lens = lens;
        this.sensor = sensor;
    }

    // Конструктор за замовчуванням, що ініціалізує об'єкт без лінз
    public Camera(String model, Sensor sensor) {
        this.model = model;
        this.sensor = sensor;
        this.lens = null; // Додайте цей рядок
    }

    // Геттер для отримання моделі камери
    public String getModel() {
        return model;
    }

    // Метод для запису повідомлень в лог-файл
    public void writeToLog(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean hasLens() {
        return lens != null;
    }
    // Метод для закриття лог-файлу (потребує коректного завершення роботи)
    public void closeLogFile() {
        // Додайте код для коректного завершення роботи з файлом
    }
    public Lens getLens() {
        return lens;
    }

    public static int countCamerasWithoutLens(List<Camera> cameras) {
        int count = 0;
        for (Camera camera : cameras) {
            if (!camera.hasLens()) {
                count++;
            }
        }
        return count;
    }
}
package KI306.Kyianets.Lab2;

public class Sensor {
    private String type;
    private String resolution;

    // Конструктор класу Sensor
    public Sensor() {
        // Конструктор без параметрів
    }

    // Конструктор класу Sensor з параметрами
    public Sensor(String type, String resolution) {
        this.type = type;
        this.resolution = resolution;
    }

    // Геттер для отримання типу сенсора
    public String getType() {
        return type;
    }

    // Додайте інші методи та конструктори за необхідності.
}

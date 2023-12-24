package KI306.Kyianets.Lab3;

public class Sensor {
    private String type;
    private String resolution;

    public Sensor() {
        // Конструктор без параметрів
    }

    public Sensor(String type, String resolution) {
        this.type = type;
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    // Новий метод для отримання значення роздільної здатності
    public String getResolution() {
        return resolution;
    }

    // Додайте інші методи та конструктори за необхідності.
}

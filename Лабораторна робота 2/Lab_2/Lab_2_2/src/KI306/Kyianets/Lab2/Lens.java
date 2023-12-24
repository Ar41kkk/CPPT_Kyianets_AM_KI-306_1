package KI306.Kyianets.Lab2;

public class Lens {
    private String focalLength;
    private String aperture;

    // Конструктор класу Lens
    public Lens(String focalLength, String aperture) {
        this.focalLength = focalLength;
        this.aperture = aperture;
    }

    // Геттер для отримання фокусної відстані
    public String getFocalLength() {
        return focalLength;
    }

    // Додайте інші методи та конструктори за необхідності.
}

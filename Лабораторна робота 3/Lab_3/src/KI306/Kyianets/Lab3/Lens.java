package KI306.Kyianets.Lab3;

public class Lens {
    private String focalLength;
    private String aperture;

    public Lens(String focalLength, String aperture) {
        this.focalLength = focalLength;
        this.aperture = aperture;
    }

    public String getFocalLength() {
        return focalLength;
    }

    // Новий метод для отримання значення апертури
    public String getAperture() {
        return aperture;
    }

    // Додайте інші методи та конструктори за необхідності.
}

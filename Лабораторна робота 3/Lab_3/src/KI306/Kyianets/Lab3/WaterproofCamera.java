package KI306.Kyianets.Lab3;

// Інтерфейс
interface WaterProof {
    void makeWaterProof();
}

interface BulletProof {
    void makeBullerProof();
}
// Підклас, що реалізує суперклас та інтерфейс
public class WaterproofCamera extends Camera implements WaterProof ,BulletProof{
    private boolean isWaterproof;

    private boolean isBulletproof;
    public WaterproofCamera(String model, Lens lens, Sensor sensor, boolean isWaterproof) {
        super(model, lens, sensor);
        this.isWaterproof = isWaterproof;
    }

    // Реалізація абстрактного методу
    @Override
    public String getInfo() {
        String waterproofInfo = isWaterproof ? "Waterproof" : "Not Waterproof";
        return getModel() + " | " + getLensInfo() + " | " + getSensorInfo() + " | " + waterproofInfo+ " | " +"Bulletproof="+isBulletproof;
    }

    // Реалізація інтерфейсу
    @Override
    public void makeWaterProof() {
        isWaterproof = true;
        writeToLog("Camera made waterproof.");
    }

    // Реалізація абстрактного методу
    @Override
    public void close() {
        // Додайте код для коректного завершення роботи
        writeToLog("Camera closed.");
    }

    // Додатковий метод для отримання інформації про об'єктив
    private String getLensInfo() {
        return "Lens: " + getLens().getFocalLength() + " | " + getLens().getAperture();
    }

    // Додатковий метод для отримання інформації про сенсор
    private String getSensorInfo() {
        return "Sensor: " + getSensor().getType() + " | " + getSensor().getResolution();
    }

    @Override
    public void makeBullerProof() {
        isBulletproof = true;
        writeToLog("Camera made bulletproof.");
    }
}
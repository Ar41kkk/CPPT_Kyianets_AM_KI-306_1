package KI306.Kyianets.Lab3;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт WaterproofCamera
        Lens lens = new Lens("50mm", "f/1.8");
        Sensor sensor = new Sensor("Full Frame", "20MP");
        WaterproofCamera waterproofCamera = new WaterproofCamera("Canon EOS", lens, sensor, false);

        // Тестуємо методи
        waterproofCamera.writeToLog("WaterproofCamera initialized.");
        System.out.println(waterproofCamera.getInfo()); // Метод getInfo з абстрактного класу
        waterproofCamera.makeWaterProof(); // Метод з інтерфейсу WaterProof
        System.out.println(waterproofCamera.getInfo());
        waterproofCamera.makeBullerProof();
        System.out.println(waterproofCamera.getInfo());
        waterproofCamera.close(); // Метод з абстрактного класу
    }
}
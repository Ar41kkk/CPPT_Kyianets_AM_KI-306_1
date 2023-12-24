package KI306.Kyianets.Lab2;

import java.util.ArrayList;
import java.util.List;

public class CameraDriver {
    public static void main(String[] args) {
        Lens lens1 = new Lens("50mm", "f/1.8");
        Sensor sensor1 = new Sensor("Full Frame", "20MP");
        Camera camera1 = new Camera("Canon EOS", lens1, sensor1);

        Lens lens2 = new Lens("35mm", "f/2.0");
        Sensor sensor2 = new Sensor("APS-C", "24MP");
        Camera camera2 = new Camera("Nikon D3500", lens2, sensor2);

        // Вивід інформації у консоль
        System.out.println("Camera model: " + camera1.getModel());
        System.out.println("Lens focal length: " + lens1.getFocalLength());
        System.out.println("Sensor type: " + sensor1.getType());
        camera1.closeLogFile();
        System.out.println();
    }

}

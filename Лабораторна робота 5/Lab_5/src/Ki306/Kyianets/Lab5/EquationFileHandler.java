package Ki306.Kyianets.Lab5;
import java.io.*;

public class EquationFileHandler {
    private static final String CHARSET_NAME = "UTF-8";

    public static void writeResultToFile(String fileName, double result) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(dos, CHARSET_NAME))) {
            writer.write(Double.toString(result));
        } catch (IOException e) {
            throw new EquationFileHandlerException("Exception reason: " + e.getMessage());
        }
    }

    public static double readResultFromFile(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
             BufferedReader reader = new BufferedReader(new InputStreamReader(dis, CHARSET_NAME))) {
            String line = reader.readLine();
            if (line != null && !line.isEmpty()) {
                return Double.parseDouble(line);
            } else {
                throw new EquationFileHandlerException("File is empty");
            }
        } catch (IOException | NumberFormatException e) {
            throw new EquationFileHandlerException("Exception reason: " + e.getMessage());
        }
    }

    static class EquationFileHandlerException extends RuntimeException {
        public EquationFileHandlerException(String message) {
            super(message);
        }
    }
}

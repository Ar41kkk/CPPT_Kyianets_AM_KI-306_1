package Ki306.Kyianets.Lab5;

public class EquationCalculator {
    public static double calculate(double x) {
        double y;
        try {
            y = Math.sin(x) / Math.sin(2 * x - 4);
        } catch (ArithmeticException ex) {
            // Обробити помилки обчислень
            throw new ArithmeticException("Exception reason: " + ex.getMessage());
        }
        return y;
    }
}

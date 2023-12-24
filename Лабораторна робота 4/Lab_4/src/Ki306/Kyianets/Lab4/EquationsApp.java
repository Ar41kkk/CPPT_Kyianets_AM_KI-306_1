package Ki306.Kyianets.Lab4;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.*;

public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine() + ".txt";
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                out.print("Enter X: ");
                double x = in.nextDouble();
                double result = EquationCalculator.calculate(x);
                fout.print(result);
            } catch (CalcException ex) {
                out.print(ex.getMessage());
            } finally {
                fout.flush();
                fout.close();
            }
        } catch (FileNotFoundException ex) {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
    class CalcException extends ArithmeticException {
        public CalcException() {}

        public CalcException(String message) {
            super(message);
        }
    }

}

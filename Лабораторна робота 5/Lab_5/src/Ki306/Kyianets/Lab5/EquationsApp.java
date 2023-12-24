package Ki306.Kyianets.Lab5;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine() + ".txt";

            out.print("Enter X: ");
            double x = in.nextDouble();
            double result = EquationCalculator.calculate(x);

            EquationFileHandler.writeResultToFile(fName, result);
            double readResult = EquationFileHandler.readResultFromFile(fName);

            out.println("Result written to file: " + readResult);
        } catch (EquationFileHandlerException ex) {
            out.print(ex.getMessage());
        }
    }

    static class EquationFileHandlerException extends RuntimeException {
        public EquationFileHandlerException(String message) {
            super(message);
        }
    }
}

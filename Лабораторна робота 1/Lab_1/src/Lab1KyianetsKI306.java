import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab1KyianetsKI306 {
    public static void main(String[] args) {
        try {
            // Введення розміру матриці та символу-заповнювача
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть розмір квадратної матриці: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Зчитати залишок рядка після введення числа

            System.out.print("Введіть символ-заповнювач: ");
            String fillChar = scanner.nextLine();

            System.out.print("Введіть символ для непарних стовпчиків: ");
            char oddColumnChar = scanner.nextLine().charAt(0);

            // Генеруємо зубчатий масив
            char[][] toothedArray = generateToothedArray(size, fillChar, oddColumnChar);

            // Повертаємо результат на 90 градусів проти годинникової стрілки
            toothedArray = rotateArray90(toothedArray);
            toothedArray = flipArrayHorizontal(toothedArray);

            // Виводимо зубчатий масив на екран
            printArray(toothedArray);

            // Вивід у файл
            writeArrayToFile(toothedArray, "output.txt");

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    // Метод для генерації зубчатого масиву з різними символами для непарних стовпчиків
    private static char[][] generateToothedArray(int size, String fillChar, char oddColumnChar) {
        char[][] toothedArray = new char[size][];

        // Генеруємо зубчатий масив
        for (int i = 0; i < size; i++) {
            toothedArray[i] = new char[size];
            for (int j = 0; j < size; j++) {
                // Визначаємо символ в залежності від умови
                if (j >= i && j < size - i) {
                    toothedArray[i][j] = (j % 2 == 0) ? fillChar.charAt(0) : oddColumnChar;
                } else {
                    toothedArray[i][j] = ' ';
                }
            }
        }
        return toothedArray;
    }




    // Метод для повороту масиву на 90 градусів
    private static char[][] rotateArray90(char[][] array) {
        char[][] rotatedArray = new char[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Поворот елементів масиву на 90 градусів проти годинникової стрілки
                rotatedArray[i][j] = array[j][array.length - 1 - i];
            }
        }
        return rotatedArray;
    }

    // Метод для перевертання масиву по горизонталі
    private static char[][] flipArrayHorizontal(char[][] array) {
        char[][] flippedArray = new char[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Перевертання елементів масиву по горизонталі
                flippedArray[i][j] = array[i][array[i].length - 1 - j];
            }
        }
        return flippedArray;
    }

    // Метод для виведення масиву на екран
    private static void printArray(char[][] array) {
        for (char[] row : array) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Метод для запису масиву у файл
    private static void writeArrayToFile(char[][] array, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (char[] row : array) {
                for (char element : row) {
                    writer.print(element + " ");
                }
                writer.println();
            }
            System.out.println("Результат також записано у файл " + fileName);
        } catch (Exception e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}

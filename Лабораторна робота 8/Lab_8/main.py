# main.py

import pickle
from calculator import Calculator

def main():
    try:
        with open('input.txt', 'r') as file:
            x = int(file.read().strip())
    except FileNotFoundError:
        print("Файл 'input.txt' не знайдено.")
        return
    except ValueError:
        print("Некоректний формат даних у файлі 'input.txt'. Введіть коректне числове значення x.")
        return

    calculator = Calculator()
    result = calculator.calculate_expression(x)
    print(f"При x={x}, значення y={result}")

    try:
        with open('output.txt', 'w', encoding='utf-8') as file:
            file.write(f"При x={x}, значення y={result}")
        print("Результати обчислень збережено у файлі 'output.txt'.")
    except Exception as e:
        print(f"Виникла помилка при збереженні результатів: {e}")

    try:
        with open('output.bin', 'wb') as file:
            pickle.dump(x, file)
        print("Результати обчислень збережено у двійковий файл 'output.bin'.")
    except Exception as e:
        print(f"Виникла помилка при збереженні результатів у двійковий файл: {e}")

if __name__ == "__main__":
    main()

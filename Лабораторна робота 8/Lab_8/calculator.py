import numpy as np

class Calculator:
    def calculate_expression(self, x):
        try:
            # Обчислюємо значення y за допомогою виразу sin(x)/sin(2x-4)
            numerator = np.sin(x)
            denominator = np.sin(2*x - 4)

            if denominator == 0:
                raise ValueError("Знаменник не може дорівнювати нулю.")

            result = numerator / denominator
            return result
        except Exception as e:
            print(f"Виникла помилка при обчисленні виразу: {e}")
            return None
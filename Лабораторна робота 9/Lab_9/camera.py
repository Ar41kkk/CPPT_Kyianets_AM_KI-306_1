class Camera:
    def __init__(self, model, resolution):
        """
        Базовий клас для представлення фотоапарата.

        Параметри:
        - model (str): Модель фотоапарата.
        - resolution (tuple): Роздільна здатність фотоапарата у форматі (ширина, висота).
        """
        self.model = model
        self.resolution = resolution

    def take_photo(self):
        """
        Метод для зйомки фотографії.
        """
        print(f"{self.model} зробив фотографію.")

    def __str__(self):
        return f"{self.model} ({self.resolution[0]}x{self.resolution[1]})"

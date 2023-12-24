from camera import Camera
from lens import Lens

class DigitalCamera(Camera, Lens):
    def __init__(self, model, resolution, video_quality, focal_length):
        """
        Похідний клас для представлення цифрової відеокамери.

        Параметри:
        - model (str): Модель відеокамери.
        - resolution (tuple): Роздільна здатність відеокамери у форматі (ширина, висота).
        - video_quality (str): Якість відеозапису.
        """
        Camera.__init__(self, model=model, resolution=resolution)
        Lens.__init__(self, focal_length=focal_length)
        self.video_quality = video_quality

    def record_video(self):
        """
        Метод для запису відео.
        """
        print(f"{self.model} почав запис відео якості {self.video_quality}.")

    def aperture(self, aperture):
        """
        Метод для зміни діафрагми.
        """
        print(f"{self.model} встановив діафрагму {aperture}.")

    def __str__(self):
        return f"{super().__str__()}, Video Quality: {self.video_quality}"

from camera import Camera
from digital_camera import DigitalCamera

def main():
    # Створення об'єктів
    photo_camera = Camera("Canon EOS", (5184, 3456))
    video_camera = DigitalCamera(model="Sony Handycam", resolution=(1920, 1080), video_quality="Full HD", focal_length=50)

    # Використання методів
    photo_camera.take_photo()

    video_camera.aperture(1.8)  # Метод успадкований від базового класу
    video_camera.zoom(2)  # Метод успадкований від базового класу
    video_camera.focus(1.8)  # Метод успадкований від базового класу
    
    video_camera.take_photo()  # Метод успадкований від базового класу
    video_camera.record_video()

    # Виведення інформації
    print("Фотоапарат:", photo_camera)
    print("Цифрова відеокамера:", video_camera)

if __name__ == "__main__":
    main()

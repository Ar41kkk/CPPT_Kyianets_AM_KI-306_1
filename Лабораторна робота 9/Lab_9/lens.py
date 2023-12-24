class Lens:
    def __init__(self, focal_length):
        """
        Creates a new lens with the given focal length.
        """
        self.focal_length = focal_length

    def zoom(self, zoom_factor):
        """
        Zooms the lens by the given factor.
        """
        self.focal_length *= zoom_factor
    
    def focus(self, distance):
        """
        Focuses on an object at the given distance.
        """
        print("Фокусування на об'єкті на відстані {} метрів.".format(distance))

    def aperture(self, aperture):
        """
        Sets the aperture to the given value.
        """
        print("Aperture is {}".format(aperture))

    def __str__(self):
        return "Lens with focal length {}".format(self.focal_length)
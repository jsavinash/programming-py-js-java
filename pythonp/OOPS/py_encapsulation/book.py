#access modifier


class Car:
    def __init__(self):
        self.__softwareUpdate()

    def drive(self):
        print("Drive car")

    def __softwareUpdate(self):
        print("Software Updates")


# c1 = Car()
# c1.drive()
# c1.softwareUpdate()


class Shape:
    _length = 10


class Circle(Shape):
    def __init__(self):
        print(self._length)


cr = Circle()
print(cr.length)

from abc import ABC


#Strong coupling
class Book:
    def __init__(self, name):
        self.name = name

    def showName(self):
        print(self.name)


class Blue(Book):
    pass


print("Strong coupling")
b1 = Blue("Book")
b1.showName()

#Weak coupling


class Person(ABC):
    def showName(self):
        pass


class Teacher(Person):
    def showName(self):
        print("Teacher Person")


print("Weak coupling")
t1 = Teacher()
t1.showName()
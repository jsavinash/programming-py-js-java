from abc import ABC


class Polygon(ABC):
    # abstract method
    def noofsides(self):
        pass


class Triangle(Polygon):

    # overriding abstract method
    def noofsides(self):
        print("I have 3 sides")


t1 = Triangle()
print("t1", t1.noofsides())
class Book:
    def add(self, num):
        return num + 2

    def substract(self, num):
        return num - 2

    def multiple(self, num):
        return num * 2

    def divide(self, num):
        return num / 2

    def weaklyCohesive(self, num):
        return self.divide(self.multiple(self.substract(self.add(num))))

    def highlyCohesive(self, num):
        return ((num + 2 - 2) * 2) / 2


b1 = Book()
print("highlyCohesive", b1.highlyCohesive(2))
print("weaklyCohesive", b1.weaklyCohesive(2))

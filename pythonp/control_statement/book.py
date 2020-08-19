class Book:
    data = True

    def method(self):
        if self.data == False:
            print("Control Condtion executed on true")
        else:
            print("Control Condtion executed on false")


b1 = Book()
b1.method()
b1.data = False
b1.method()

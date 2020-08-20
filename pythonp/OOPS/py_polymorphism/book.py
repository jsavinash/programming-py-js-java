class Book:
    def bookName(self):
        print("Book Class")


class Blue(Book):
    def bookName(self):
        print("Blue Class")


b1 = Blue()
b1.bookName()
#Bibirectional relationship
class Book:
    def __init__(self, name):
        self.name = name


class Library:
    def __init__(self, name):
        self.name = name

    def addBooks(self, books):
        self.books = books

    def showBooks(self):
        for x in self.books:
            print(x.name)


b1 = Book("Blue")
b2 = Book("Red")
b3 = Book("Pink")

list = []
list.append(b1)
list.append(b2)
list.append(b3)

l1 = Library("Blue library")
l1.addBooks(list)
print(l1.showBooks())
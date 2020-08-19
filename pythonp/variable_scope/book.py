class Book:
    name = "Avinash Nishad"     # instance / static variable

    def method(self):
        localData = 1           # local variable
        return localData


b1 = Book()
print("Static variable ", Book.name)
print("Instance variable ", b1.name)
print("Local variable ", b1.method())

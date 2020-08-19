class Book:
    caseHandling = 0

    def loop(self):
        for x in range(10):
            print("Loop::", x)
        print("Fixed::Loop::Completed")

    def whileLoop(self):
        i = 0
        while i < 10:
            i += 1
            print("*********************")
        print("While::Loop::Completed")


b1 = Book()
b1.loop()
b1.whileLoop()
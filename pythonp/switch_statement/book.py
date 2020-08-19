class Book:
    caseHandling = 0

    def str(self):
        return 'String'

    def method(self):
        switcher = {
            0: self.str(),
            1: "one",
            2: "two",
        }
        return switcher.get(self.caseHandling, "nothing")


b1 = Book()
print(b1.method())

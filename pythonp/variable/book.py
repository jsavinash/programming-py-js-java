class Book:
    name = "Avinash"
    listEl = ["Avinash", "Nishad"]
    trupleEl = ("Nishad", "Work")
    setEl = {"Avinash", "Nishad", "Avinash"}
    dictEl = {"name": "Avinash", "age": "29"}


b1 = Book()
print("Dynamic variable resolution", b1.name)
print("Dynamic variable resolution", b1.listEl)
print("Dynamic variable resolution", b1.trupleEl)
print("Dynamic variable resolution", b1.setEl)
print("Dynamic variable resolution", b1.dictEl)

dictElement = ("1", "2", "3", "4")
itrator = iter(dictElement)
print(next(itrator))
print(next(itrator))
print(next(itrator))

x = lambda a, b: b + a
print(x(3, 2))

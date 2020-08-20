class Area:
    def square_area(self, num):
        return num * num


class Square:
    a1 = Area()

    def area(self, num):
        return self.a1.square_area(num)


s1 = Square()
print(s1.area(2))
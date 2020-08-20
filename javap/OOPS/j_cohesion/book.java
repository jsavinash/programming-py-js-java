package javap.OOPS.j_cohesion;

class Book {
    int add(int num) {
        return num + 2;
    }

    int substract(int num) {
        return num - 2;
    }

    int multiple(int num) {
        return num * 2;
    }

    int divide(int num) {
        return num / 2;
    }

    int weaklyCohesive(int num) {
        return divide(multiple(substract(add(num))));
    }

    int highlyCohesive(int num) {
        return ((((num + 2) - 2) * 2) / 2);
    }

    public static void main(String args[]) {
        Book w1 = new Book();
        System.out.println("weaklyCohesive" + " " + w1.weaklyCohesive(2));
        System.out.println("highlyCohesive" + " " + w1.highlyCohesive(2));
    }
}

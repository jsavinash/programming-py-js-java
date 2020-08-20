package javap.OOPS.j_abstraction;

//Partial abstraction.
abstract class Book {
    abstract void showName();

    void genericMethod() {
        System.out.println("Accessable to all");
    }
}

// 100% abstraction.
// Coupling example
// Week Coupling
interface IBook {
    void showName();
}

class Wisdom extends Book {

    void showName() {
        System.out.println("Wisdom book");
    }

    public static void main(String args[]) {
        Wisdom s1 = new Wisdom();
        s1.showName();
        s1.genericMethod();
    }
}

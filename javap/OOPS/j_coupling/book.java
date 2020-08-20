package javap.OOPS.j_coupling;

// Week Coupling
interface IBook {
    void showName();
}

// Strong Coupling
class Book {
    public String name = "Book";
    // private String name = "Book";
}

class Wisdom extends Book {
    public static void main(String args[]) {
        Wisdom w1 = new Wisdom();
        System.out.println(w1.name);
    }
}

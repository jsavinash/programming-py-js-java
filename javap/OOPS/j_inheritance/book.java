package javap.OOPS.j_inheritance;

class Book {
    String name = "";
    int cost = 0;
    String author = "";

    Book(String name, int cost, String author) {
        this.name = name;
        this.cost = cost;
        this.author = author;
    }
}

class Wisdom extends Book {
    Wisdom(String name, int cost, String author) {
        super(name, cost, author);
    }

    void bookName() {
        System.out.println("Book Name" + " " + name);
    }

    public static void main(String args[]) {
        Wisdom s1 = new Wisdom("Wisdom", 20, "Avinash Nishad");
        s1.bookName();
    }
}

class Knowledge extends Book {
    Knowledge(String name, int cost, String author) {
        super(name, cost, author);
    }

    void bookName() {
        System.out.println("Book Name" + " " + name);
    }

    public static void main(String args[]) {
        Knowledge s1 = new Knowledge("Knowledge", 20, "Avinash Nishad");
        s1.bookName();
    }
}

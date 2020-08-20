package javap.OOPS.j_polymorphism;

class Book {
    String name = "";

    void bookName() {
        System.out.println("Generic Book Name" + " " + name);
    }
}

class Wisdom extends Book {
    Wisdom(String name) {
        this.name = name;
    }

    void bookName() {
        System.out.println("Wisdom Book Name" + " " + name);
    }

    public static void main(String args[]) {
        Wisdom s1 = new Wisdom("Wisdom");
        s1.bookName();
    }
}

package javap.OOPS.j_composition;

import java.util.List;
import java.util.ArrayList;

//Bidirectional relationship.
class Book {
    String name;

    Book(String name) {
        this.name = name;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
    }

    String getLibrary() {
        return this.name;
    }

    void setBooks(List<Book> books) {
        this.books = books;
    }

    List<Book> getBooks() {
        return this.books;
    }
}

class Operations {
    public static void main(String args[]) {
        Library l1 = new Library("Bell Library");
        Book b1 = new Book("New 1");
        Book b2 = new Book("New 2");
        Book b3 = new Book("New 3");
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        l1.setBooks(books);
        System.out.println("Library :: " + l1.getLibrary());
        System.out.println("Books :: " + l1.getBooks().get(1).name);
    }
}
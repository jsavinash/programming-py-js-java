package javap.switch_statement;

class Book {
    public char data = 'a';

    void method() {
        switch (data) {
            case 'a':
                System.out.println("Case rendered");
                break;
            default:
                System.out.println("Default rendered");
        }
    }

    public static void main(String args[]) {
        Book b1 = new Book();
        b1.method();
        b1.data = 'b';
        b1.method();
    }
}
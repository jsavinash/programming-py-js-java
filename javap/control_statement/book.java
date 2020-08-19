package javap.control_statement;

class Book {
    public Boolean data = false;

    void method() {
        if (data) {
            System.out.println("Control Condtion executed on true");
        } else {
            System.out.println("Control Condtion executed on false");
        }
    }

    public static void main(String args[]) {
        Book b1 = new Book();
        b1.method();
        b1.data = true;
        b1.method();
    }
}
package javap.variable_scope;

class Book {
    int data = 50;// instance variable
    static int m = 100;// static variable

    int method() {
        int n = 90;// local variable
        return n;
    }

    public static void main(String args[]) {
        Book b1 = new Book();
        System.out.println("Static variable" + " " + Book.m);
        System.out.println("Instance variable" + " " + b1.data);
        System.out.println("Local variable" + " " + b1.method());
    }
}
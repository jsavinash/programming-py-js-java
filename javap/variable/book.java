package javap.variable;

class Book {
    int data = 50;
    boolean bool = true;
    char character = 'a';
    byte charbyte = 'b';
    float loagInt = 0.0f;

    public static void main(String args[]) {
        Book b1 = new Book();
        System.out.println("Integer variable" + " " + b1.data);
        System.out.println("Boolean variable" + " " + b1.bool);
        System.out.println("Character variable" + " " + b1.character);
        System.out.println("Byte variable" + " " + b1.charbyte);
        System.out.println("Float variable" + " " + b1.loagInt);
    }
}
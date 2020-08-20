package javap.loops;

class Book {
    void loop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop::" + " " + i);
        }
    }

    void whileLoop() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("*********************");
        }
        System.out.println("While Loop complete");
    }

    void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("*********************");
            i++;
        } while (i < 10 && i > 0);
        System.out.println("Do while Loop complete");
    }

    public static void main(String args[]) {
        Book b1 = new Book();
        b1.loop();
        b1.whileLoop();
        b1.doWhileLoop();
    }
}
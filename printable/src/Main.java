public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1");
        Book book2 = new Book("book2");
        Magazine magazine1 = new Magazine("magazine1");
        Magazine magazine2 = new Magazine("magazine2");

        Printable[] printables = {book1,book2,magazine1,magazine2};
        for (Printable printable:printables) {
            printable.print();
        }
    }
}

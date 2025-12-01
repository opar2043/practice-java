package src.Liabrary;

public class TestLiabrary {
    public static void main(String[] args) {
        ReadingList book = new ReadingList();
        book.addBook("Journal");
        book.addBook("Magazine");
        book.addBook("Story Book");
        book.addBook("Story");

        System.out.println("After adding Books:");
        book.display();
        book.removeBook("Story Books");

                // iv. Display the list again
        System.out.println("After removing :");
        book.display();
    }
}

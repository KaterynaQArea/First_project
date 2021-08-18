package HW_lesson9.BookStore;

import HW_lesson9.BookStore.Book;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<>(10);
        bookCollection.add(0, new Book(487.6, "In Search of Lost Time", "hard", 789));
        bookCollection.add(1, new Book(258.3, "One Hundred Years of Solitude", "soft", 211));
        bookCollection.add(2, new Book(632.1, "War and Peace", "hard", 1100));
        bookCollection.add(3, new Book(456, "Invisible Man", "soft", 210));
        bookCollection.add(4, new Book(321.7, "Beloved", "hard", 700));
        bookCollection.add(5, new Book(654.8, "The Stories of Anton Chekhov", "soft", 687));
        bookCollection.add(6, new Book(475.5, "Jane Eyre", "hard", 592));
        bookCollection.add(7, new Book(454.4, "The Color Purple", "soft", 300));
        bookCollection.add(8, new Book(325.5, "Safe House", "soft", 654));
        bookCollection.add(9, new Book(220.2, "The Adventures of Huckleberry Finn", "hard", 612));

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();

        for (Book book : bookCollection) {
            if (book.getCoverType().equals("soft")) {
                booksWithSoftCover.add(book);
            } else {
                booksWithHardCover.add(book);
            }
        }
        System.out.println("There are the following books with a soft cover in the store: ");
        for (Book book : booksWithSoftCover) {
            System.out.println(book.getTitle());
        }
        System.out.println();
        System.out.println("There are the following books with a hard cover in the store: ");
        for (Book book : booksWithHardCover) {
            System.out.println(book.getTitle());
        }
        System.out.println();
        System.out.println("The list of all book in the store: ");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle());
        }
    }
}

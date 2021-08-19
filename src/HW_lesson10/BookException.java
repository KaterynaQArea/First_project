package HW_lesson10;

import HW_lesson9.BookStore.Book;

import java.util.ArrayList;

public class BookException {
    public static void main(String[] args) {
        try {
            ArrayList<Book> bookCollection = new ArrayList<>(5);
            bookCollection.add(0, new Book(487.6, "In Search of Lost Time", "hard", 789));
            bookCollection.add(1, new Book(258.3, "One Hundred Years of Solitude", "soft", 211));
            bookCollection.add(2, new Book(632.1, "War and Peace", "hard", 1100));
            bookCollection.add(3, new Book(456, "Invisible Man", "soft", 210));
            bookCollection.add(4, new Book(321.7, "Beloved", "hard", 700));
            bookCollection.set(5, new Book(654.8, "Jane Eyre", "soft", 687));
        } catch (Exception ex) {
            System.out.println("You are trying to get an item that is out of the list!");
        }
    }
}

package BookOrder.Model;

import BookOrder.Book;

import java.util.Set;

public interface Model {
    Set<Book> getBooks();
    void addBooks(Book b);
    void removeBooks(Book b);
    void sortBooksWithTitle();
    void sortBooksWithPages();
}

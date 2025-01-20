package BookOrder.Controller;

import BookOrder.Book;

public interface Controller {
    void displayBooks();
    boolean addBooks(Book b);
    boolean removeBook(Book b);
    void sortBooksWithTitle();
    void sortBooksWithPages();
}

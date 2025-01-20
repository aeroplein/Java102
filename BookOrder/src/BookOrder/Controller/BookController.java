package BookOrder.Controller;

import BookOrder.Book;
import BookOrder.Model.Model;
import BookOrder.View.View;

import java.util.Set;

public class BookController implements Controller {

    private Model model;
    private View view;

    private static BookController instance;

    public static synchronized BookController getInstance(Model model, View view){
        if (instance==null){
            instance = new BookController(model, view);
        }
        return instance;
    }

    private BookController(Model model, View view){
        this.view = view;
        this.model = model;
    }



    @Override
    public void displayBooks() {
        Set<Book> books = model.getBooks();
        view.showBooks(books);
    }

    @Override
    public boolean addBooks(Book b) {
        Set<Book> books = model.getBooks();
        if (!books.contains(b)){
            books.add(b);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeBook(Book b) {
        Set<Book> books = model.getBooks();
        if (books.contains(b)){
            books.remove(b);
            return true;
        }
        return false;
    }

    @Override
    public void sortBooksWithTitle() {
        model.sortBooksWithTitle();
    }

    @Override
    public void sortBooksWithPages() {
        model.sortBooksWithPages();
    }
}

package BookOrder.Model;

import BookOrder.Book;
import BookOrder.PageComparator;

import java.util.*;

public class BookRepo implements Model{
    private Book book;
    private Set<Book> books;
    Comparator<Book> comparator;

    private static BookRepo instance;

    private BookRepo(){
        books = new LinkedHashSet<>();
        comparator = new PageComparator();
    }
    public static synchronized BookRepo getInstance(){
        if (instance==null){
            instance = new BookRepo();
        }
        return instance;
    }


    @Override
    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public void addBooks(Book b) {
        if (!books.contains(b)){
            books.add(b);
        }else{
            System.out.println("Kitap zaten ekli.");
        }
    }

    @Override
    public void removeBooks(Book b) {
        if (books.contains(b)){
            books.remove(b);
        }else{
            System.out.println("Kitap " + b + " bulunamadı.");
        }
    }

    @Override
    public void sortBooksWithTitle() {
        ArrayList<Book> bookList = new ArrayList<>(books);
        Collections.sort(bookList);
        books.clear();
        books.addAll(bookList);
    }




    @Override
    public void sortBooksWithPages() {
        ArrayList<Book> bookList = new ArrayList<>(books);
        bookList.sort(comparator);
        books.clear();
        books.addAll(bookList);

    }


}

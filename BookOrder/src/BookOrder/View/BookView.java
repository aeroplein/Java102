package BookOrder.View;

import BookOrder.Book;

import java.util.Iterator;
import java.util.Set;

public class BookView implements View{

    private static BookView instance;

    private BookView(){

    }
    public static synchronized BookView getInstance(){
        if (instance==null){
            instance = new BookView();
        }
        return instance;
    }


    @Override
    public void showBooks(Set<Book> books) {
        System.out.println("Kitaplar gösteriliyor.");
        Iterator<Book> itr = books.iterator();
        while(itr.hasNext()){
            Book b = itr.next();
            System.out.println(b);
        }
    }
}

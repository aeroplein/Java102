import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepo {
   private static ArrayList<Book> bookList = new ArrayList<>();
    static{
        bookList.add(new Book("1984", 294, "George Orwell", 1945));
        bookList.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960));
        bookList.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 1925));
        bookList.add(new Book("Brave New World", 311, "Aldous Huxley", 1932));
        bookList.add(new Book("Moby Dick", 635, "Herman Melville", 1851));
        bookList.add(new Book("Pride and Prejudice", 279, "Jane Austen", 1813));
        bookList.add(new Book("The Catcher in the Rye", 277, "J.D. Salinger", 1951));
        bookList.add(new Book("The Hobbit", 310, "J.R.R. Tolkien", 1937));
        bookList.add(new Book("Fahrenheit 451", 249, "Ray Bradbury", 1953));
        bookList.add(new Book("Crime and Punishment", 671, "Fyodor Dostoevsky", 1866));

    }


    public Map<String, String> getAuthorAndBookMap(){
        return bookList.stream().collect(Collectors.toMap(Book::getAuthor, Book::getTitle));
    }

    public List<Book> filterBooksWithPagesMoreThan100(){
        return bookList.stream().filter(book -> book.getPage()>100).toList();
    }
}

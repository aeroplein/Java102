package BookOrder;

import BookOrder.Controller.BookController;
import BookOrder.Controller.Controller;
import BookOrder.Model.BookRepo;
import BookOrder.Model.Model;
import BookOrder.View.BookView;
import BookOrder.View.View;

public class Test {
    public static void main(String[] args) {
        Model model = BookRepo.getInstance();
        View view = BookView.getInstance();
        Controller controller = BookController.getInstance(model, view);

        controller.displayBooks();
        controller.addBooks(new Book("Hayvan Çiftliği", "George Orwell", 152, 1945));
        controller.addBooks(new Book("Dönüşüm", "Franz Kafka" , 100, 1915));
        controller.addBooks(new Book("Suç ve Ceza", "Dostoyevski", 705,1866));
        controller.addBooks(new Book("Gurur ve Önyargı", "Jane Austen", 392, 1813));
        controller.addBooks(new Book("Huzur", "Ahmet Hamdi Tanpınar", 419, 1948));
        controller.sortBooksWithTitle();
        controller.displayBooks();
        System.out.println("----------------------");
        controller.sortBooksWithPages();
        controller.displayBooks();
    }
}

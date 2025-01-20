package BookOrder;

import java.util.Comparator;

public class PageComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getNumOfPage(), o2.getNumOfPage());
    }
}

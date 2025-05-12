import java.util.Date;

public class Book {


    private String title;
    private int page;
    private String author;
    private int publishDate;

    public Book(String title, int page, String author, int publishDate){
        this.title = title;
        this.page = page;
        this.author = author;
        this.publishDate = publishDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}

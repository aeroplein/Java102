package BookOrder;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {
    private String title;
    private int numOfPage;
    private String author;
    private int publishingDate;



    public Book(String title, String author, int numOfPage, int publishingDate){
        this.title = title;
        this.numOfPage = numOfPage;
        this.author = author;
        this.publishingDate = publishingDate;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public int compareTo(@NotNull Book b) {
        return this.title.compareTo(b.title);
    }


    @Override
    public String toString(){
        return "Kitap adı: " + title + ", Yazarı: " + author + ", Sayfa Sayısı: " + numOfPage +", Basım Tarihi: " + publishingDate;
    }
}

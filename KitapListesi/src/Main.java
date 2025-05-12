public class Main {
    public static void main(String[] args) {
        BookRepo br = new BookRepo();
        System.out.println(br.filterBooksWithPagesMoreThan100());
        System.out.println(br.getAuthorAndBookMap());
    }
}

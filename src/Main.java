public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Anton", "Chekhov");
        Book book1 = new Book("The Cherry Orchard", author1, 1904);
        System.out.printf("Book: %s%nAuthor: %s%nPublished: %d%n%n", book1.getBookName(), book1.getAuthor(), book1.getPublishedYear());

        Author author2 = new Author("Alexandr", "Pushkin");
        Book book2 = new Book("The Gold Fish", author2, 1833);
        book2.setPublishedYear(1835);
        System.out.printf("Book: %s%nAuthor: %s%nPublished: %d%n%n", book2.getBookName(), book2.getAuthor(), book2.getPublishedYear());
    }
}
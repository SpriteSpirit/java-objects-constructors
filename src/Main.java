public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Anton", "Chehov");
        Book book1 = new Book("The Cherry Orchard", String.format("%s %s", author1.getAuthorName(), author1.getAuthorSurname()), 1904);

        System.out.printf("Book: %s%nAuthor: %s%nPublished: %d%n%n", book1.getBookName(), book1.getAuthor(), book1.getPublishedYear());

        Author author2 = new Author("Alexandr", "Pushkin");
        Book book2 = new Book("The Gold Fish", String.format("%s %s", author2.getAuthorName(), author2.getAuthorSurname()), 1833);
        book2.setPublishedYear(1835);
        System.out.printf("Book: %s%nAuthor: %s%nPublished: %d%n%n", book2.getBookName(), book2.getAuthor(), book2.getPublishedYear());
    }
}
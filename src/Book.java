public class Book {
    private String bookName;
    private Author author;
    private int publishedYear;

    public Book(String bookName, Author author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author.fullName();
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}

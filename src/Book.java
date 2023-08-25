public class Book {
    private String bookName;
    private String author;
    private int publishedYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthorName(String authorName) {
        this.author= authorName;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public Book(String bookName, String authorName, int publishedYear) {
        this.bookName = bookName;
        this.author = authorName;
        this.publishedYear = publishedYear;
    }
}

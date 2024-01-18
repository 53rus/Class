public class Book {
    private int publishingYear;
     Author author;

    public Book(int publishingYear, Author author) {
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

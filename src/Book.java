import java.util.Objects;

public class Book {
    private String nameBook;
    private int publishingYear;

    private Author author;

    public Book(String nameBook, int publishingYear, Author author) {
        this.publishingYear = publishingYear;
        this.nameBook = nameBook;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

    public String toString() {
        return "Название книги: " + this.nameBook + " Год издания: " + this.publishingYear + " Автор: " + this.author;

    }
}

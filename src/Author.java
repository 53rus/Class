import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
           return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String toString() {
        return "Имя - " + this.firstName + " Фамилия - " + this.lastName;
    }

}

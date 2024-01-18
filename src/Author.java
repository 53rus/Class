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

}

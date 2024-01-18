public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Толстой","Лев");
        Book warAndPeace = new Book(1863, tolstoy);
        Author pushkin = new Author("Пушкин", "Александр");
        Book ruslanAndLudmila = new Book(1820, pushkin);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        System.out.println("warAndPeace.author = " + warAndPeace.author);
        System.out.println("ruslanAndLudmila.getPublishingYear() = " + ruslanAndLudmila.getPublishingYear());
        System.out.println("ruslanAndLudmila.author = " + ruslanAndLudmila.author);
        ruslanAndLudmila.setPublishingYear(1818);
        System.out.println("ruslanAndLudmila.getPublishingYear() = " + ruslanAndLudmila.getPublishingYear());
    }
}
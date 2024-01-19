public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Толстой","Лев");
        Author pushkin = new Author("Пушкин", "Александр");
        Author dostoevskiy = new Author("Федор", "Достоевский");
        Book book1 = new Book("Война и мир", 1863, tolstoy);
        Book book2 = new Book("Руслан и Людмила", 1820, pushkin);
        Book book3 = new Book("Преступление и наказание", 1866, dostoevskiy);
        Book book4 = new Book("Медный всадник", 1833, pushkin);
        Book book5 = new Book("Медный всадник", 1823, pushkin);
        System.out.println(book1);
        book1.setPublishingYear(1000);
        System.out.println(book1);
        System.out.println(dostoevskiy.equals(pushkin));
        System.out.println(book4.equals(book5));
    }
}
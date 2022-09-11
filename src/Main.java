public class Main {
    public static void main(String[] args) {
        Autor autor=new Autor("Иванов", "Иван");
        Book book=new Book("Книга",autor,2022);
        System.out.println(book);

    }
}
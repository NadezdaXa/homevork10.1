import java.util.Objects;

public class Book {

private final String title;
private final Autor autor;
private int yaer;

    public Book(String title, Autor autor, int yaer) {
        this.title = title;
        this.autor = autor;
        this.yaer = yaer;
    }
    public String getTitle(){
        return title;
    }
    public Autor getAutor(){
        return autor;
    }
    public int getYaer(){
        return yaer;
    }
    public void setYaer(int yaer){
        this.yaer=yaer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yaer == book.yaer && title.equals(book.title) && autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, yaer);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor=" + autor +
                ", yaer=" + yaer +
                '}';
    }
}


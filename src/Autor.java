import java.util.Objects;

public class Autor {
    private final String firstNane;
    private final String lastName;

    public Autor(String firstNane, String lastName) {
        this.firstNane = firstNane;
        this.lastName = lastName;
    }
    public String getFirstNane(){
        return firstNane;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return firstNane.equals(autor.firstNane) && lastName.equals(autor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNane, lastName);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "firstNane='" + firstNane + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

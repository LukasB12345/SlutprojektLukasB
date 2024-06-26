import java.util.ArrayList;

public class Book { //This is a SUPER-class. Contains the information that every book that is created needs.
    //Attributes:
    protected String name;
    protected int number;
    protected String genre;

    ArrayList<Book> loanedBook = new ArrayList<>();

    //Constructors:
    //Default constructor:
    public Book() {
    }

    //Constructor:
    public Book(String name, int number, String genre) { //every book has a name, number and genre
        this.name = name;
        this.number = number;
        this.genre = genre;
    }

}

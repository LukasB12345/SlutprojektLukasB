import java.util.ArrayList;

public class ComicBook extends Book { //This is a SUB-class, a ComicBook is a sort of book. (inherits).
    //Attributes:
    protected String name;
    protected int number;
    protected String genre;

    ArrayList<ComicBook> loanedComicBook = new ArrayList<>();

    //Constructors:
    //Default constructor
    public ComicBook() {
        super("test", -1, "test");
    }

    //Constructor
    public ComicBook(String name, int number, String genre) { //A comic book is a sort of book and every comic book has a name, number and genre
        super(name, number, genre);
        this.name = name;
        this.number = number;
        this.genre = genre;
    }

}

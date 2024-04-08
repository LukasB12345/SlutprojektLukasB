import java.util.ArrayList;

public class ComicBook extends Book { //This is a SUB-class
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
    public ComicBook(String name, int number, String genre) {
        super(name, number, genre);
        this.name = name;
        this.number = number;
        this.genre = genre;
    }

}

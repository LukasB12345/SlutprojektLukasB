import java.util.ArrayList;


public class AudioBook extends Book { //This is a SUB-class, an audiobook is a sort of book. (inherits). Contains the information that every audiobook that is created needs.
    //Attributes:
    protected String name;
    protected int number;
    protected String genre;

    ArrayList<ComicBook> loanedAudioBook = new ArrayList<>();

    //Constructors:
    //Default constructor
    public AudioBook() {
        super("test", -1, "test");
    }

    //Constructor
    public AudioBook(String name, int number, String genre) { //An audiobook is a sort of book and every audio book has a name, number and genre
        super(name, number, genre);
        this.name = name;
        this.number = number;
        this.genre = genre;
    }

}


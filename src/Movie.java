import java.util.ArrayList;

public class Movie { //Contains the information that every movie that is created needs.
    //Attributes:
    protected String name;
    protected int number;
    protected String genre;

    ArrayList<Movie> loanedMovie = new ArrayList<>();

    //Constructors:
    //Default constructor:
    public Movie() {
    }

    //Constructor:
    public Movie(String name, int number, String genre) { //every movie has a name, number and genre
        this.name = name;
        this.number = number;
        this.genre = genre;
    }


}



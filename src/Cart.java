import java.util.ArrayList;

public class Cart {
    //Attributes:
    int cartNumber;


    //Constructor:
    public Cart() { //A cart contains books, comic books and movies that the user have loaned. It is empty when the program starts running
        ArrayList<Book> loanedBook = new ArrayList<>();
        ArrayList<ComicBook> loanedComicBook = new ArrayList<>();
        ArrayList<Movie> loanedMovie = new ArrayList<>();
    }
}

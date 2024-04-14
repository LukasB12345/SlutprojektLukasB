import java.util.ArrayList;

public class Cart {
    //Attributes:
    int cartNumber;
    ArrayList<Book> loanedBook;
    ArrayList<ComicBook> loanedComicBook;
    ArrayList<Movie> loanedMovie;


    //Constructor:
    public Cart() { //A cart contains books, comic books and movies that the user have loaned. It is empty when the program starts running
        this.loanedBook = new ArrayList<>();
        this.loanedComicBook = new ArrayList<>();
        this.loanedMovie = new ArrayList<>();
    }

    public void seeMyLoans() { //Prints out all loaned books/comicbooks/movies. Void = only prints, no returns.
        System.out.println("Your loaned books:");
        for (Book book : this.loanedBook) {
            System.out.println("Name: " + book.name + ", Book number: " + book.number);
        }
        System.out.println("Your loaned comic books:");
        for (ComicBook comicbook : this.loanedComicBook) {
            System.out.println("Name: " + comicbook.name + ", Comic book number: " + comicbook.number);
        }
        System.out.println("Your loaned movies:");
        for (Movie movie : this.loanedMovie) {
            System.out.println("Name: " + movie.name + ", Movie number: " + movie.number);
        }
    }

    public void seeLoanedBooks() {
        System.out.println("Your loaned books:");
        for (Book book : this.loanedBook) {
            System.out.println("Name: " + book.name + ", Book number: " + book.number);
        }
    }

    public void seeLoanedComicBooks() {
        System.out.println("Your loaned comic books:");
        for (ComicBook comicbook : this.loanedComicBook) {
            System.out.println("Name: " + comicbook.name + ", Comic book number: " + comicbook.number);
        }
    }

    public void seeLoanedMovies() {
        System.out.println("Your loaned movies:");
        for (Movie movie : this.loanedMovie) {
            System.out.println("Name: " + movie.name + ", Movie number: " + movie.number);
        }
    }
}

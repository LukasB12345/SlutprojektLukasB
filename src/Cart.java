import java.util.ArrayList;

public class Cart {
    //Attributes:
    int cartNumber;
    ArrayList<Book> loanedBook;
    ArrayList<ComicBook> loanedComicBook;
    ArrayList<Movie> loanedMovie;
    ArrayList<AudioBook> loanedAudioBook;


    //Constructor:
    public Cart() { //A cart contains books, comic books, audiobooks and movies that the user have loaned which are available in arraylists that contains objets in a class. It is empty when the program starts running.
        this.loanedBook = new ArrayList<>();
        this.loanedComicBook = new ArrayList<>();
        this.loanedMovie = new ArrayList<>();
        this.loanedAudioBook = new ArrayList<>();
    }

    public void seeMyLoans() { //Prints out all loaned books/comicbooks/movies/audiobooks. Void = only prints out information, no returning of information.
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
        System.out.println("Your loaned audiobooks:");
        for (AudioBook audiobook : this.loanedAudioBook) {
            System.out.println("Name: " + audiobook.name + ", Audiobook number: " + audiobook.number);
        }
        System.out.println("");
    }

    public void seeLoanedBooks() { //Prints out all loaned books. Void = only prints out information, no returning of information.
        System.out.println("Your loaned books:");
        for (Book book : this.loanedBook) {
            System.out.println("Name: " + book.name + ", Book number: " + book.number);
        }
    }

    public void seeLoanedComicBooks() { //Prints out all loaned comicbooks. Void = only prints out information, no returning of information.
        System.out.println("Your loaned comic books:");
        for (ComicBook comicbook : this.loanedComicBook) {
            System.out.println("Name: " + comicbook.name + ", Comic book number: " + comicbook.number);
        }
    }

    public void seeLoanedMovies() { //Prints out all loaned movies. Void = only prints out information, no returning of information.
        System.out.println("Your loaned movies:");
        for (Movie movie : this.loanedMovie) {
            System.out.println("Name: " + movie.name + ", Movie number: " + movie.number);
        }
    }

    public void seeLoanedAudioBooks() { //Prints out all loaned audiobooks. Void = only prints out information, no returning of information.
        System.out.println("Your loaned audiobooks:");
        for (AudioBook audiobook : this.loanedAudioBook) {
            System.out.println("Name: " + audiobook.name + ", Audiobook number: " + audiobook.number);
        }
    }
}

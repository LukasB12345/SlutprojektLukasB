import java.util.ArrayList;

public class Cart {
    //Attributes:
    private ArrayList<Book> loanedBook;
    private ArrayList<ComicBook> loanedComicBook;
    private ArrayList<Movie> loanedMovie;
    private ArrayList<AudioBook> loanedAudioBook;

    //Constructor:
    public Cart() { //A cart contains books, comic books, audiobooks and movies that the user have loaned which are available in arraylists that contains objets in a class. It is empty when the program starts running.
        this.loanedBook = new ArrayList<>();
        this.loanedComicBook = new ArrayList<>();
        this.loanedMovie = new ArrayList<>();
        this.loanedAudioBook = new ArrayList<>();
    }

    public void seeMyLoans() { //Prints out all loaned books/comicbooks/movies/audiobooks. Void = only prints out information, no returning of information.
        System.out.println("Your loaned books:");
        for (Book book : this.loanedBook) { //for each loaned book that exists, it's attributes are printed
            System.out.println("Name: " + book.name + ", Book number: " + book.number);
        }
        System.out.println("Your loaned comic books:");
        for (ComicBook comicbook : this.loanedComicBook) { //for each loaned comicbook that exists, it's attributes are printed
            System.out.println("Name: " + comicbook.name + ", Comic book number: " + comicbook.number);
        }
        System.out.println("Your loaned movies:");
        for (Movie movie : this.loanedMovie) { //for each loaned movie that exists, it's attributes are printed
            System.out.println("Name: " + movie.name + ", Movie number: " + movie.number);
        }
        System.out.println("Your loaned audiobooks:");
        for (AudioBook audiobook : this.loanedAudioBook) { //for each loaned audiobook that exists, it's attributes are printed
            System.out.println("Name: " + audiobook.name + ", Audiobook number: " + audiobook.number);
        }
        System.out.println(""); //Blank row
    }

    public void seeLoanedBooks() { //Prints out all loaned books. Void = only prints out information, no returning of information.
        System.out.println("Your loaned books:");
        for (Book book : this.loanedBook) { //for each loaned book that exists, it's attributes are printed
            System.out.println("Name: " + book.name + ", Book number: " + book.number);
        }
    }

    public void seeLoanedComicBooks() { //Prints out all loaned comicbooks. Void = only prints out information, no returning of information.
        System.out.println("Your loaned comic books:");
        for (ComicBook comicbook : this.loanedComicBook) { //for each loaned comicbook that exists, it's attributes are printed
            System.out.println("Name: " + comicbook.name + ", Comic book number: " + comicbook.number);
        }
    }

    public void seeLoanedMovies() { //Prints out all loaned movies. Void = only prints out information, no returning of information.
        System.out.println("Your loaned movies:");
        for (Movie movie : this.loanedMovie) { //for each loaned movie that exists, it's attributes are printed
            System.out.println("Name: " + movie.name + ", Movie number: " + movie.number);
        }
    }

    public void seeLoanedAudioBooks() { //Prints out all loaned audiobooks. Void = only prints out information, no returning of information.
        System.out.println("Your loaned audiobooks:");
        for (AudioBook audiobook : this.loanedAudioBook) { //for each loaned audiobook that exists, it's attributes are printed
            System.out.println("Name: " + audiobook.name + ", Audiobook number: " + audiobook.number);
        }
    }

    //Comics:
    public void loanComic(ComicBook comicbook) {
        this.loanedComicBook.add(comicbook);
    } //adds the selected comicbook to the cart

    public boolean checkNoComic() { //looks if any comicbooks exists in the cart and returns a true/false value
        return loanedComicBook.isEmpty();
    }

    public ArrayList<ComicBook> getComics() { //looks through and retrieves all comics in the cart
        return loanedComicBook;
    }

    public void removeComic(ComicBook comicbook) {
        loanedComicBook.remove(comicbook);
    } //removes the selected comicbook from the cart

    //Books:
    public void loanBook(Book book) {
        this.loanedBook.add(book);
    } //adds the selected book to the cart

    public boolean checkNoBook() {
        return loanedBook.isEmpty();
    } //looks if any books exists in the cart and returns a true/false value

    public ArrayList<Book> getBooks() {
        return loanedBook;
    } //looks through and retrieves all books in the cart

    public void removeBook(Book book) {
        loanedBook.remove(book);
    } //removes the selected book from the cart

    //Movies:
    public void loanMovie(Movie movie) {
        this.loanedMovie.add(movie);
    } //adds the selected movie to the cart

    public boolean checkNoMovie() {
        return loanedMovie.isEmpty();
    } //looks if any movies exists in the cart and returns a true/false value

    public ArrayList<Movie> getMovies() {
        return loanedMovie;
    } //looks through and retrieves all movies in the cart

    public void removeMovie(Movie movie) {
        loanedMovie.remove(movie);
    } //removes the selected movie from the cart

    //Audiobooks:
    public void loanAudioBook(AudioBook audiobook) {
        this.loanedAudioBook.add(audiobook);
    } //adds the selected audiobook to the cart

    public boolean checkNoAudioBook() {
        return loanedAudioBook.isEmpty();
    } //looks if any audiobooks exists in the cart and returns a true/false value

    public ArrayList<AudioBook> getAudioBooks() {
        return loanedAudioBook;
    } //looks through and retrieves all comics in the cart

    public void removeAudioBook(AudioBook audiobook) {
        loanedAudioBook.remove(audiobook);
    } //removes the selected audiobook from the cart

}

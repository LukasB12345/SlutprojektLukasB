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

    //Comics:
    public void loanComic(ComicBook comicbook) {
        this.loanedComicBook.add(comicbook);
    }

    public boolean checkNoComic() {
        return loanedComicBook.isEmpty();
    }

    public ArrayList<ComicBook> getComics() {
        return loanedComicBook;
    }

    public void removeComic(ComicBook comicbook) {
        loanedComicBook.remove(comicbook);
    }

    //Books:
    public void loanBook(Book book) {
        this.loanedBook.add(book);
    }

    public boolean checkNoBook() {
        return loanedBook.isEmpty();
    }

    public ArrayList<Book> getBooks() {
        return loanedBook;
    }

    public void removeBook(Book book) {
        loanedBook.remove(book);
    }

    //Movies:
    public void loanMovie(Movie movie) {
        this.loanedMovie.add(movie);
    }

    public boolean checkNoMovie() {
        return loanedMovie.isEmpty();
    }

    public ArrayList<Movie> getMovies() {
        return loanedMovie;
    }

    public void removeMovie(Movie movie) {
        loanedMovie.remove(movie);
    }

    //Audiobooks:
    public void loanAudioBook(AudioBook audiobook) {
        this.loanedAudioBook.add(audiobook);
    }

    public boolean checkNoAudioBook() {
        return loanedAudioBook.isEmpty();
    }

    public ArrayList<AudioBook> getAudioBooks() {
        return loanedAudioBook;
    }

    public void removeAudioBook(AudioBook audiobook) {
        loanedAudioBook.remove(audiobook);
    }

}

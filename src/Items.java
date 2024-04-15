import java.util.ArrayList;

public class Items { //All available books, comic books, movies and audiobooks are created here.

    //Books are created here: The values are static and final because they are not supposed to change
    public static final Book Book1 = new Book("Harry Potter", 1, "Fantasy");
    public static final Book Book2 = new Book("1984", 2, "Dystopian Fiction");
    public static final Book Book3 = new Book("Da Vinci Code", 3, "Thriller");

    //Comic books are created here:
    public static final ComicBook ComicBook1 = new ComicBook("Spider man", 1, "Adventure");
    public static final ComicBook ComicBook2 = new ComicBook("The hulk", 2, "Action");
    public static final ComicBook ComicBook3 = new ComicBook("Batman", 3, "Action");

    //Movies are created here:
    public static final Movie Movie1 = new Movie("Hunger Games", 1, "Dystopian fiction");
    public static final Movie Movie2 = new Movie("Spirited Away", 2, "Fantasy");
    public static final Movie Movie3 = new Movie("Jurassic Park", 3, "Action");

    //Audiobooks are created here:
    public static final AudioBook AudioBook1 = new AudioBook("War and Peace", 1, "Historical novel");
    public static final AudioBook AudioBook2 = new AudioBook("The Lost Symbol", 2, "Fiction");
    public static final AudioBook AudioBook3 = new AudioBook("The Godfather", 3, "Crime novel");

    //Lists of available "items"(= books, movies, comic books and audiobooks) to show the user what is available.
    public static final Book[] ListOfBooks = {Book1, Book2, Book3};
    public static final ComicBook[] ListOfComicBooks = {ComicBook1, ComicBook2, ComicBook3};
    public static final Movie[] ListOfMovies = {Movie1, Movie2, Movie3};
    public static final AudioBook[] ListOfAudioBooks = {AudioBook1, AudioBook2, AudioBook3};

    public static void ShowAvailableItems() { //Method to show all available items. Books, comic books and movies. Prints out the attributes of available books, comic books and movies.
        System.out.println("Available books:");
        System.out.println("");
        for (Book book : ListOfBooks) {
            System.out.println("Name: " + book.name + ", Genre: " + book.genre + ", Number: " + book.number);
        }
        System.out.println("");
        System.out.println("Available Comic books:");
        System.out.println("");
        for (ComicBook comicbook : ListOfComicBooks) {
            System.out.println("Name: " + comicbook.name + ", Genre: " + comicbook.genre + ", Number: " + comicbook.number);
        }
        System.out.println("");
        System.out.println("Available Movies");
        System.out.println("");
        for (Movie movie : ListOfMovies) {
            System.out.println("Name: " + movie.name + ", Genre: " + movie.genre + ", Number: " + movie.number);
        }
        System.out.println("");
        System.out.println("Available Audiobooks:");
        System.out.println("");
        for (AudioBook audiobook : ListOfAudioBooks) {
            System.out.println("Name: " + audiobook.name + ", Genre: " + audiobook.genre + ", Number: " + audiobook.number);
        }
    }

    public static void ShowAvailableBooks() { //Method to show all available books. Prints out the attributes of the available books.
        for (Book book : ListOfBooks) {
            System.out.println("Name: " + book.name + ", Genre: " + book.genre + ", Number: " + book.number);
        }
    }

    public static void ShowAvailableComicBooks() { //Method to show all available comic books. Prints out the attributes of the available comic books.
        for (ComicBook comicbook : ListOfComicBooks) {
            System.out.println("Name: " + comicbook.name + ", Genre: " + comicbook.genre + ", Number: " + comicbook.number);
        }
    }

    public static void ShowAvailableMovies() { //Method to show all available movies. Prints out the attributes of the available movies.
        for (Movie movie : ListOfMovies) {
            System.out.println("Name: " + movie.name + ", Genre: " + movie.genre + ", Number: " + movie.number);
        }
    }

    public static void ShowAvailableAudioBooks() { //Method to show all available audiobooks. Prints out the attributes of the available audiobooks.
        for (AudioBook audiobook : ListOfAudioBooks) {
            System.out.println("Name: " + audiobook.name + ", Genre: " + audiobook.genre + ", Number: " + audiobook.number);
        }
    }

}

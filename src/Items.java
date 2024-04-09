import java.util.ArrayList;

public class Items { //All available books, comic books and movies are created here.

    //Books are created here: The values are static and final because they are not supposed to change
    public static final Book Book1 = new Book("Harry Potter", 1, "Fantasy");
    public static final Book Book2 = new Book("", 2, "");
    public static final Book Book3 = new Book("", 3, "");

    //Comic books are created here:
    public static final ComicBook ComicBook1 = new ComicBook("Spider man", 1, "Adventure");
    public static final ComicBook ComicBook2 = new ComicBook("", 2, "");
    public static final ComicBook ComicBook3 = new ComicBook("", 3, "");

    //Movies are created here:
    public static final Movie Movie1 = new Movie("Hunger Games", 1, "Dystopian fiction");
    public static final Movie Movie2 = new Movie("", 2, "");
    public static final Movie Movie3 = new Movie("", 3, "");

    //Lists of available "items"(= books, movies and comic books) to show the user what is available.
    public static final Book[] ListOfBooks = {Book1, Book2, Book3};
    public static final ComicBook[] ListOfComicBooks = {ComicBook1, ComicBook2, ComicBook3};
    public static final Movie[] ListOfMovies = {Movie1, Movie2, Movie3};

    public static void ShowAvailableItems() { //Method to show all available items. Books, comic books and movies.
        for (Book book : ListOfBooks) {
            System.out.println("Name: " + book.name + " Genre: " + book.genre + "Number: " + book.number);
        }
        for (ComicBook comicbook : ListOfComicBooks) {
            System.out.println("Name: " + comicbook.name + " Genre: " + comicbook.genre + "Number: " + comicbook.number);
        }
        for (Movie movie : ListOfMovies) {
            System.out.println("Name: " + movie.name + " Genre: " + movie.genre + "Number: " + movie.number);
        }
    }

}

public class Items { //All available books, comic books, movies and audiobooks are created here.

    //Books are created here: The values are static and final because they are not supposed to change
    public static final Book book1 = new Book("Harry Potter", 1, "Fantasy");
    public static final Book book2 = new Book("1984", 2, "Dystopian Fiction");
    public static final Book book3 = new Book("Da Vinci Code", 3, "Thriller");

    //Comic books are created here: The values are static and final because they are not supposed to change
    public static final ComicBook comicBook1 = new ComicBook("Spider man", 1, "Adventure");
    public static final ComicBook comicBook2 = new ComicBook("The hulk", 2, "Action");
    public static final ComicBook comicBook3 = new ComicBook("Batman", 3, "Action");

    //Movies are created here: The values are static and final because they are not supposed to change
    public static final Movie movie1 = new Movie("Hunger Games", 1, "Dystopian fiction");
    public static final Movie movie2 = new Movie("Spirited Away", 2, "Fantasy");
    public static final Movie movie3 = new Movie("Jurassic Park", 3, "Action");

    //Audiobooks are created here: The values are static and final because they are not supposed to change
    public static final AudioBook audioBook1 = new AudioBook("War and Peace", 1, "Historical novel");
    public static final AudioBook audioBook2 = new AudioBook("The Lost Symbol", 2, "Fiction");
    public static final AudioBook audioBook3 = new AudioBook("The Godfather", 3, "Crime novel");

    //Lists of available "items"(= books, movies, comic books and audiobooks) to show the user what is available.
    public static final Book[] listOfBooks = {book1, book2, book3};
    public static final ComicBook[] listOfComicBooks = {comicBook1, comicBook2, comicBook3};
    public static final Movie[] listOfMovies = {movie1, movie2, movie3};
    public static final AudioBook[] listOfAudioBooks = {audioBook1, audioBook2, audioBook3};

    public static void showAvailableItems() { //Method to show all available items. Books, comic books and movies. Prints out the attributes of available books, comic books and movies.
        System.out.println("Available books:");
        System.out.println("");
        for (Book book : listOfBooks) { //for each book in the list of books, it's attributes are printed
            System.out.println("Name: " + book.name + ", Genre: " + book.genre + ", Number: " + book.number);
        }
        System.out.println("");
        System.out.println("Available Comic books:");
        System.out.println("");
        for (ComicBook comicbook : listOfComicBooks) { //for each comicbook in the list of comicbooks, it's attributes are printed
            System.out.println("Name: " + comicbook.name + ", Genre: " + comicbook.genre + ", Number: " + comicbook.number);
        }
        System.out.println("");
        System.out.println("Available Movies");
        System.out.println("");
        for (Movie movie : listOfMovies) { //for each movie in the list of movies, it's attributes are printed
            System.out.println("Name: " + movie.name + ", Genre: " + movie.genre + ", Number: " + movie.number);
        }
        System.out.println("");
        System.out.println("Available Audiobooks:");
        System.out.println("");
        for (AudioBook audiobook : listOfAudioBooks) { //for each audiobook in the list of audiobooks, it's attributes are printed
            System.out.println("Name: " + audiobook.name + ", Genre: " + audiobook.genre + ", Number: " + audiobook.number);
        }
    }

    public static void showAvailableBooks() { //Method to show all available books. Prints out the attributes of the available books.
        for (Book book : listOfBooks) { //for each book in the list of books, it's attributes are printed
            System.out.println("Name: " + book.name + ", Genre: " + book.genre + ", Number: " + book.number);
        }
    }

    public static void showAvailableComicBooks() { //Method to show all available comic books. Prints out the attributes of the available comic books.
        for (ComicBook comicbook : listOfComicBooks) { //for each comicbook in the list of comicbooks, it's attributes are printed
            System.out.println("Name: " + comicbook.name + ", Genre: " + comicbook.genre + ", Number: " + comicbook.number);
        }
    }

    public static void showAvailableMovies() { //Method to show all available movies. Prints out the attributes of the available movies.
        for (Movie movie : listOfMovies) { //for each movie in the list of movies, it's attributes are printed
            System.out.println("Name: " + movie.name + ", Genre: " + movie.genre + ", Number: " + movie.number);
        }
    }

    public static void showAvailableAudioBooks() { //Method to show all available audiobooks. Prints out the attributes of the available audiobooks.
        for (AudioBook audiobook : listOfAudioBooks) { //for each audiobook in the list of audiobooks, it's attributes are printed
            System.out.println("Name: " + audiobook.name + ", Genre: " + audiobook.genre + ", Number: " + audiobook.number);
        }
    }

}

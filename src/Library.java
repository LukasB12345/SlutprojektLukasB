import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static final Scanner scanner = new Scanner(System.in); //Scanner to read the users choices
    static Cart cart = new Cart(); //A cart is another class, but is created here.

    ArrayList<Client> allClients = new ArrayList<>();

    public Library() {
        Main();
    }


    public void Main() {

        boolean running = true; //The program is running until the user chooses 5 (5 triggers a case that makes the boolean running false) with a while-loop

        int choice;
        while (running) { //The program is running until the user chooses 5 (5 triggers a case that makes the boolean running false) with a while-loop
            System.out.println("Welcome to my shop! Choose 1-5 in the menu below:\nChoice 1 = Add product to cart\nChoice 2 = Remove product from cart\nChoice 3 = List all items in cart\nChoice 4 = Register new client \nChoice 5 = Exit library");
            if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > 5 || choice < 1) {
                    System.out.println("You need to choose an integer between 1-5!!!"); //tells the user that their input is not allowed and lets the user try again.
                }
                switch (choice) {
                    case 1 -> addItem();//Called if the user chooses 1
                    case 2 -> removeItem();//Called if the user chooses 2
                    case 3 -> listAllLoanedItems(); //Called if the user chooses 3
                    case 4 -> registerClient(); //Called if the user chooses 4
                    case 5 -> { //If the user chooses 5, the two rows below are run, exiting the program.
                        System.out.println("Bye! Welcome back soon!");
                        running = false; //running is false if the user wants to exit the program, the while-loop is stopped.
                    }
                }
            } else { //if you don't choose an integer between 1-5
                System.out.println("You need to choose an integer between 1-5!!!"); //tells the user that their input is not allowed and lets the user try again.
                scanner.next(); //reads in the users input with a scanner
            }
        }
    }

    private void registerClient() { //Creates a client, however a client can not do anything as of now.
        System.out.println("Enter the name of the client");
        String ClientName = scanner.next();

        Client client = new Client(ClientName);
        allClients.add(client);
        System.out.println("Client added");
    }

    private void listAllLoanedItems() { //Prints out everything in the cart, using a method defined as seeMyLoans.
        cart.seeMyLoans();
    }

    private void addItem() {
        int choice;
        Items.showAvailableItems();
        System.out.println("");
        System.out.println("Please enter what kind of item you want to loan by entering a number from 1-4: 1.Book, 2.Comic book, 3.Movie, 4.Audio book");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 4 || choice < 1) {
                System.out.println("You need to choose an integer between 1-4!!!"); //tells the user that their input is not allowed and lets them back to the menu
            }
            switch (choice) {
                case 1 -> loanBook();//Called if the user chooses 1
                case 2 -> loanComicBook();//Called if the user chooses 2
                case 3 -> loanMovie(); //Called if the user chooses 3
                case 4 -> loanAudioBook(); //Called if the user chooses 4
            }
        } else { //if the user doesn't choose an integer between 1-4
            System.out.println("You need to choose an integer between 1-4!!!"); //tells the user that their input is not allowed and lets them back to the menu
            scanner.nextLine();
        }
    }

    private void loanBook() { //Loan a book by entering the number of the book
        Items.showAvailableBooks();
        System.out.println("Please enter the number of the book you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int bookNumber = scanner.nextInt();

            if (bookNumber > 3 || bookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                loanBook();
            } else {
                for (Book book : Items.listOfBooks) {
                    if (bookNumber == book.number) {
                        //cart.loanedBook.add(book);
                        cart.loanBook(book);
                        System.out.println("Book added to cart");
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!!"); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void loanComicBook() { //Loan a comic book by entering the number of the comic book
        Items.showAvailableComicBooks();
        System.out.println("Please enter the number of the comic book you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int comicBookNumber = scanner.nextInt();

            if (comicBookNumber > 3 || comicBookNumber < 1) {
                System.out.println("This comic book does not exist, please enter a valid number!");
                loanComicBook();
            } else {
                for (ComicBook comicbook : Items.listOfComicBooks) {
                    if (comicBookNumber == comicbook.number) {
                        //cart.loanedComicBook.add(comicbook);
                        cart.loanComic(comicbook);
                        System.out.println("Comic book added to cart");
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!!"); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void loanMovie() { //Loan a movie by entering the number of the movie
        Items.showAvailableMovies();
        System.out.println("Please enter the number of the movie you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int movieNumber = scanner.nextInt();

            if (movieNumber > 3 || movieNumber < 1) {
                System.out.println("This movie does not exist, please enter a valid number!");
                loanMovie();
            } else {
                for (Movie movie : Items.listOfMovies) {
                    if (movieNumber == movie.number) {
                        //  cart.loanedMovie.add(movie);
                        cart.loanMovie(movie);
                        System.out.println("Movie added to cart");
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!!"); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }

    }

    private void loanAudioBook() { //Loan an audiobook by entering the number of the audiobook
        Items.showAvailableAudioBooks();
        System.out.println("Please enter the number of the audiobook you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int audioBookNumber = scanner.nextInt();

            if (audioBookNumber > 3 || audioBookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                loanBook();
            } else {
                for (AudioBook audiobook : Items.listOfAudioBooks) {
                    if (audioBookNumber == audiobook.number) {
                        // cart.loanedAudioBook.add(audiobook);
                        cart.loanAudioBook(audiobook);
                        System.out.println("Audiobook added to cart");
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!!"); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void removeItem() {
        int choice;
        listAllLoanedItems();
        System.out.println("Please enter what kind of item you want to remove by entering a number from 1-4: 1.Book, 2.Comic book, 3.Movie, 4.Audiobook");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            choice = scanner.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("You need to choose an integer between 1-4!!!"); //tells the user that their input is not allowed and lets the user try again.
            }
            switch (choice) {
                case 1 -> removeBook();//Called if the user chooses 1
                case 2 -> removeComicBook();///Called if the user chooses 2
                case 3 -> removeMovie(); //Called if the user chooses 3
                case 4 -> removeAudioBook(); //Called if the user chooses 4
            }
        } else { //if the user doesn't choose an integer between 1-4
            System.out.println("You need to choose an integer between 1-4!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void removeBook() { //Remove a book by entering the number of the book
        if (cart.checkNoBook()) {
            System.out.println("You don't have any books in your cart!");
            return;
        }
        cart.seeLoanedBooks();
        System.out.println("Please enter the number of the book you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int bookNumber = scanner.nextInt();

            for (Book book : cart.getBooks()) {
                if (book.number == bookNumber) {
                    cart.removeBook(book);
                    System.out.println("Removed book");
                    return;
                } else {
                    System.out.println("This book does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!!"); //tells the user that their input is not allowed and the user returns to the menu
            scanner.nextLine();
        }
    }

    private void removeComicBook() { //Loan a comic book by entering the number of the comic book
        if (cart.checkNoComic()) {
            System.out.println("You don't have any comic books in your cart!");
            return;
        }
        cart.seeLoanedComicBooks();
        System.out.println("Please enter the number of the comic book you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int comicBookNumber = scanner.nextInt();

            for (ComicBook comicbook : cart.getComics()) {
                if (comicbook.number == comicBookNumber) {
                    cart.removeComic(comicbook);
                    System.out.println("Removed comic book");
                    return;
                } else {
                    System.out.println("This comic book does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!!"); //tells the user that their input is not allowed and lets them back to the menu
            scanner.nextLine();
        }
    }

    private void removeMovie() { //Loan a movie by entering the number of the movie
        if (cart.checkNoMovie()) {
            System.out.println("You don't have any movies in your cart!");
            return;
        }

        cart.seeLoanedMovies();
        System.out.println("Please enter the number of the movie you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int movieNumber = scanner.nextInt();

            for (Movie movie : cart.getMovies()) {
                if (movie.number == movieNumber) {
                    //cart.loanedMovie.remove(movie);
                    cart.removeMovie(movie);
                    System.out.println("Removed movie");
                    return;
                } else {
                    System.out.println("This movie does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!!"); //tells the user that their input is not allowed and lets them back to the menu
            scanner.nextLine();
        }
    }

    private void removeAudioBook() { //Loan an audiobook by entering the number of the audiobook
        if (cart.checkNoAudioBook()) {
            System.out.println("You don't have any audiobooks in your cart!");
            return;
        }
        cart.seeLoanedAudioBooks();
        System.out.println("Please enter the number of the audiobook you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int audioBookNumber = scanner.nextInt();
            for (AudioBook audiobook : cart.getAudioBooks()) {
                if (audiobook.number == audioBookNumber) {
                    //   cart.loanedAudioBook.remove(audiobook);
                    cart.removeAudioBook(audiobook);
                    System.out.println("Removed audiobook");
                    return;
                } else {
                    System.out.println("This audiobook does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!!"); //tells the user that their input is not allowed and lets them back to the menu
            scanner.nextLine();
        }
    }
}



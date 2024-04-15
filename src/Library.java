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
                    System.out.println("You need to choose an integer between 1-5!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
                }
                switch (choice) {
                    case 1 -> AddItem();//Called if the user chooses 1
                    case 2 -> RemoveItem();//Called if the user chooses 2
                    case 3 -> ListAllLoanedItems(); //Called if the user chooses 3
                    case 4 -> RegisterClient(); //Called if the user chooses 4
                    case 5 -> { //If the user chooses 5, the two rows below are run, exiting the program.
                        System.out.println("Bye! Welcome back soon!");
                        running = false; //running is false if the user wants to exit the program, the while-loop is stopped.
                    }
                }
            } else { //if you don't choose an intger between 1-5
                System.out.println("You need to choose an integer between 1-5!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
                scanner.next(); //reads in the users input with a scanner
            }
        }
    }

    private void RegisterClient() { //Creates a client
        System.out.println("Enter the name of the client");
        String ClientName = scanner.next();

        Client client = new Client(ClientName);
        allClients.add(client);
    }

    private void ListAllLoanedItems() { //Prints out everything in the cart, using a method defined as seeMyLoans.
        cart.seeMyLoans();
    }

    private void AddItem() {
        int choice;
        Items.ShowAvailableItems();
        System.out.println("");
        System.out.println("Please enter what kind of item you want to loan, 1.Book, 2.Comic book, 3.Movie, 4.Audio book");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 4 || choice < 1) {
                System.out.println("You need to choose an integer between 1-4!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            }
            switch (choice) {
                case 1 -> LoanBook();//Called if the user chooses 1
                case 2 -> LoanComicBook();//Called if the user chooses 2
                case 3 -> LoanMovie(); //Called if the user chooses 3
                case 4 -> LoanAudioBook(); //Called if the user chooses 4
            }
        } else { //if the user doesn't choose an integer between 1-4
            System.out.println("You need to choose an integer between 1-4!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void LoanBook() { //Loan a book by entering the number of the book
        Items.ShowAvailableBooks();
        System.out.println("Please enter the number of the book you want to loan");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int BookNumber = scanner.nextInt();

            if (BookNumber > 3 || BookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                LoanBook();
            } else {
                for (Book book : Items.ListOfBooks) {
                    if (BookNumber == book.number) {
                        cart.loanedBook.add(book);
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void LoanComicBook() { //Loan a comic book by entering the number of the comic book
        Items.ShowAvailableComicBooks();
        System.out.println("Please enter the number of the comic book you want to loan");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int ComicBookNumber = scanner.nextInt();

            if (ComicBookNumber > 3 || ComicBookNumber < 1) {
                System.out.println("This comic book does not exist, please enter a valid number!");
                LoanComicBook();
            } else {
                for (ComicBook comicbook : Items.ListOfComicBooks) {
                    if (ComicBookNumber == comicbook.number) {
                        cart.loanedComicBook.add(comicbook);
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void LoanMovie() { //Loan a movie by entering the number of the movie
        Items.ShowAvailableMovies();
        System.out.println("Please enter the number of the movie you want to loan");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int MovieNumber = scanner.nextInt();

            if (MovieNumber > 3 || MovieNumber < 1) {
                System.out.println("This movie does not exist, please enter a valid number!");
                LoanMovie();
            } else {
                for (Movie movie : Items.ListOfMovies) {
                    if (MovieNumber == movie.number) {
                        cart.loanedMovie.add(movie);
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }

    }

    private void LoanAudioBook() { //Loan an audiobook by entering the number of the audiobook
        Items.ShowAvailableAudioBooks();
        System.out.println("Please enter the number of the audiobook you want to loan");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int AudioBookNumber = scanner.nextInt();

            if (AudioBookNumber > 3 || AudioBookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                LoanBook();
            } else {
                for (AudioBook audiobook : Items.ListOfAudioBooks) {
                    if (AudioBookNumber == audiobook.number) {
                        cart.loanedAudioBook.add(audiobook);
                    }
                }
            }
        } else { //if the user doesn't choose an integer between 1-3
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void RemoveItem() {
        int choice;
        Items.ShowAvailableItems();
        System.out.println("Please enter what kind of item you want to remove, 1.Book, 2.Comic book, 3.Movie, 4.Audiobook");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            choice = scanner.nextInt();
            if (choice > 5 || choice < 1) {
                System.out.println("You need to choose an integer between 1-5!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            }
            switch (choice) {
                case 1 -> RemoveBook();//Called if the user chooses 1
                case 2 -> RemoveComicBook();///Called if the user chooses 2
                case 3 -> RemoveMovie(); //Called if the user chooses 3
                case 4 -> RemoveAudioBook(); //Called if the user chooses 4
            }
        } else { //if the user doesn't choose an integer between 1-4
            System.out.println("You need to choose an integer between 1-4!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void RemoveBook() { //Remove a book by entering the number of the book
        if (cart.loanedBook.isEmpty()) {
            System.out.println("You don't have any books in your cart!");
            return;
        }
        cart.seeLoanedBooks();
        System.out.println("Please enter the number of the book you want to remove from your loans");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int BookNumber = scanner.nextInt();

            for (Book book : cart.loanedBook) {
                if (book.number == BookNumber) {
                    cart.loanedBook.remove(book);
                    System.out.println("Removed book");
                    return;
                } else {
                    System.out.println("This book does not exist, please enter a valid number!");
                    RemoveBook();
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void RemoveComicBook() { //Loan a comic book by entering the number of the comic book
        if (cart.loanedComicBook.isEmpty()) {
            System.out.println("You don't have any comic books in your cart!");
            return;
        }
        cart.seeLoanedComicBooks();
        System.out.println("Please enter the number of the comic book you want to remove from your loans");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int ComicBookNumber = scanner.nextInt();

            for (ComicBook comicbook : cart.loanedComicBook) {
                if (comicbook.number == ComicBookNumber) {
                    cart.loanedComicBook.remove(comicbook);
                    System.out.println("Removed comic book");
                    return;
                } else {
                    System.out.println("This comic book does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void RemoveMovie() { //Loan a movie by entering the number of the movie
        if (cart.loanedMovie.isEmpty()) {
            System.out.println("You don't have any movies in your cart!");
            return;
        }

        cart.seeLoanedMovies();
        System.out.println("Please enter the number of the movie you want to remove from your loans");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int MovieNumber = scanner.nextInt();

            for (Movie movie : cart.loanedMovie) {
                if (movie.number == MovieNumber) {
                    cart.loanedMovie.remove(movie);
                    System.out.println("Removed movie");
                    return;
                } else {
                    System.out.println("This movie does not exist, please enter a valid number!");
                    RemoveMovie();
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }

    private void RemoveAudioBook() { //Loan an audiobook by entering the number of the audiobook
        if (cart.loanedAudioBook.isEmpty()) {
            System.out.println("You don't have any audiobooks in your cart!");
            return;
        }
        cart.seeLoanedAudioBooks();
        System.out.println("Please enter the number of the audiobook you want to remove from your loans");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int AudioBookNumber = scanner.nextInt();

            for (AudioBook audiobook : cart.loanedAudioBook) {
                if (audiobook.number == AudioBookNumber) {
                    cart.loanedAudioBook.remove(audiobook);
                    System.out.println("Removed audiobook");
                    return;
                } else {
                    System.out.println("This audiobook does not exist, please enter a valid number!");
                }
            }
        } else { //if you don't choose an existing integer
            System.out.println("You need to choose an integer that exists!!! Try again: "); //tells the user that their input is not allowed and lets the user try again.
            scanner.nextLine();
        }
    }
}



import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static final Scanner scanner = new Scanner(System.in); //Scanner to read the users choices
    static Cart cart = new Cart(); //A cart is another class, but is created here.

    ArrayList<Client> allClients = new ArrayList<>();

    public Library() {
        Main(); //Calls the main method, that contains the menu, where the user can choose what they want to do (which decides which method is then called)
    }


    public void Main() { //menu where the user chooses what to do

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

        Client client = new Client(ClientName); //creates a new client with the name that the user inputs
        allClients.add(client); //adds a client to the arraylist with clients
        System.out.println("Client added");
    }

    private void listAllLoanedItems() { //Prints out everything in the cart, using a method defined as seeMyLoans.
        cart.seeMyLoans();
    }

    private void addItem() {
        int choice;
        Items.showAvailableItems();//prints out all available items so the user  can see what is available to borrow
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
        Items.showAvailableBooks(); //prints out all available books so the user can see what is available to borrow
        System.out.println("Please enter the number of the book you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int bookNumber = scanner.nextInt();

            if (bookNumber > 3 || bookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                loanBook();
            } else {
                for (Book book : Items.listOfBooks) { //For each book that exists in the listOfBooks the if/else-statement is run
                    if (bookNumber == book.number) { //Makes sure that the correct book is added to the cart (1-3, depending on the users input=bookNumber)
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
        Items.showAvailableComicBooks(); //prints out all available comicbooks so the user  can see what is available to borrow
        System.out.println("Please enter the number of the comic book you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int comicBookNumber = scanner.nextInt();

            if (comicBookNumber > 3 || comicBookNumber < 1) {
                System.out.println("This comic book does not exist, please enter a valid number!");
                loanComicBook();
            } else {
                for (ComicBook comicbook : Items.listOfComicBooks) { //For each comicbook that exists in the listOfComicBooks the if/else-statement is run
                    if (comicBookNumber == comicbook.number) { //Makes sure that the correct comicbook is added to the cart (1-3, depending on the users input=comicBookNumber)
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
        Items.showAvailableMovies(); //prints out all available movies so the user  can see what is available to borrow
        System.out.println("Please enter the number of the movie you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int movieNumber = scanner.nextInt();

            if (movieNumber > 3 || movieNumber < 1) {
                System.out.println("This movie does not exist, please enter a valid number!");
                loanMovie();
            } else {
                for (Movie movie : Items.listOfMovies) { //For each movie that exists in the listOfMovies the if/else-statement is run
                    if (movieNumber == movie.number) { //Makes sure that the correct movie is added to the cart (1-3, depending on the users input=movieNumber)
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
        Items.showAvailableAudioBooks(); //prints out all available audiobooks so the user  can see what is available to borrow
        System.out.println("Please enter the number of the audiobook you want to loan (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int audioBookNumber = scanner.nextInt();

            if (audioBookNumber > 3 || audioBookNumber < 1) {
                System.out.println("This book does not exist, please enter a valid number!");
                loanBook();
            } else {
                for (AudioBook audiobook : Items.listOfAudioBooks) { //For each audiobook that exists in the listOfAudioBooks the if/else-statement is run
                    if (audioBookNumber == audiobook.number) { //Makes sure that the correct audiobook is added to the cart (1-3, depending on the users input=audioBookNumber)
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
        listAllLoanedItems(); //prints out all loaned items so that the user can see what they are able to remove
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
        if (cart.checkNoBook()) { //if there is no books in cart
            System.out.println("You don't have any books in your cart!");
            return;
        }
        cart.seeLoanedBooks(); //prints out the currently loaned books
        System.out.println("Please enter the number of the book you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int bookNumber = scanner.nextInt();

            for (Book book : cart.getBooks()) { //Looks through all books in the cart, if the number that the user inputs exists as a book, it is removed
                if (book.number == bookNumber) { //if the book exists
                    cart.removeBook(book); //the book is removed
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

    private void removeComicBook() { //remove a comic book by entering the number of the comic book
        if (cart.checkNoComic()) { //if there is no comicbooks in cart
            System.out.println("You don't have any comic books in your cart!");
            return;
        }
        cart.seeLoanedComicBooks(); //prints out the currently loaned comicbooks
        System.out.println("Please enter the number of the comic book you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int comicBookNumber = scanner.nextInt();

            for (ComicBook comicbook : cart.getComics()) { //Looks through all comicbooks in the cart, if the number that the user inputs exists as a comicbook, it is removed
                if (comicbook.number == comicBookNumber) { //if the book exists
                    cart.removeComic(comicbook); //the comicbook is removed
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

    private void removeMovie() { //remove a movie by entering the number of the movie
        if (cart.checkNoMovie()) { //if there is no movies in cart
            System.out.println("You don't have any movies in your cart!");
            return;
        }

        cart.seeLoanedMovies(); //prints out the currently loaned movies
        System.out.println("Please enter the number of the movie you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int movieNumber = scanner.nextInt();

            for (Movie movie : cart.getMovies()) { //Looks through all movies in the cart, if the number that the user inputs exists as a movie, it is removed
                if (movie.number == movieNumber) { //if the movie exists
                    cart.removeMovie(movie); //The movie is removed
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

    private void removeAudioBook() { //remove an audiobook by entering the number of the audiobook
        if (cart.checkNoAudioBook()) { //if there is no audiobooks in cart
            System.out.println("You don't have any audiobooks in your cart!");
            return;
        }
        cart.seeLoanedAudioBooks(); //prints out the currently loaned audiobooks
        System.out.println("Please enter the number of the audiobook you want to remove from your loans (1-3)");
        if (scanner.hasNextInt()) { //makes sure that the user inputs an int, and not a value that is not allowed, ex. a double or a String/characters.
            int audioBookNumber = scanner.nextInt();
            for (AudioBook audiobook : cart.getAudioBooks()) { //Looks through all audiobooks in the cart, if the number that the user inputs exists as an audiobook, it is removed
                if (audiobook.number == audioBookNumber) { //if the audiobook exists
                    cart.removeAudioBook(audiobook); //it is removed
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



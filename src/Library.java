import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static final Scanner scanner = new Scanner(System.in); //Scanner för att läsa in användarens val
    static Cart cart = new Cart(); //Varukorg som är en egen klass skapas här som sedan används för att lägga varor i varukorgen

    ArrayList<Client> allClients = new ArrayList<>();

    public Library() {
        Main();
    }


    public void Main() {

        boolean running = true; //Programmet körs så länge användaren inte väljer 6 (Avsluta programmet genom att göra running till false) genom en while-loop

        int choice;
        while (running) { //Programmet körs så länge användaren inte väljer 4 (Avsluta programmet) genom en while-loop
            System.out.println("Welcome to my shop! Choose 1-5 in the menu below:\nChoice 1 = Add product to cart\nChoice 2 = Remove product from cart\nChoice 3 = List all items in cart\nChoice 4 = Register new client \nChoice 5 = Exit library");
            if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > 5 || choice < 1) {
                    System.out.println("You need to choose an integer between 1-5!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
                }
                switch (choice) {
                    case 1 -> AddItem();//Ifall användaren väljer 1 anropas metoden
                    case 2 -> RemoveItem();//Ifall användaren väljer 2 anropas metoden
                    case 3 -> ListAllLoanedItems(); //Ifall användaren väljer 3 anropas metoden
                    case 4 -> RegisterClient(); //Ifall användaren väljer 4 anropas metoden
                    case 5 -> { //Ifall användaren väljer 5 körs koden på den nedre raden:
                        System.out.println("Bye! Welcome back soon!");
                        running = false; //Vill man avsluta programmet blir värdet falskt och koden slutar köras/programmet avslutas
                    }
                }
            } else { //om man inte väljer/skriver 1-5:
                System.out.println("You need to choose an integer between 1-5!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
                scanner.next(); //läser in användarens val med en scanner
            }
        }
    }

    private void RegisterClient() { //Creates a client
        System.out.println("Enter the name of the client");
        String ClientName = scanner.next();

        Client client = new Client(ClientName);
        allClients.add(client);
    }

    private void ListAllLoanedItems() { //Prints out everything in the cart
        cart.seeMyLoans();
    }

    private void AddItem() {
        int choice;
        Items.ShowAvailableItems();
        System.out.println("Please enter what kind of item you want to loan, 1.Book, 2.Comic book, 3.Movie");
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> LoanBook();//Ifall användaren väljer 1 anropas metoden
                case 2 -> LoanComicBook();//Ifall användaren väljer 2 anropas metoden
                case 3 -> LoanMovie(); //Ifall användaren väljer 3 anropas metoden
            }
        } else { //om man inte väljer/skriver 1-3:
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
            scanner.nextLine();
        }
    }

    private void LoanBook() { //Loan a book by entering the number of the book
        Items.ShowAvailableBooks();
        System.out.println("Please enter the number of the book you want to loan");
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
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
        } else { //om man inte väljer/skriver 1-3:
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
            scanner.nextLine();
        }
    }

    private void LoanComicBook() { //Loan a comic book by entering the number of the comic book
        Items.ShowAvailableComicBooks();
        System.out.println("Please enter the number of the comic book you want to loan");
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
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
        } else { //om man inte väljer/skriver 1-3:
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
            scanner.nextLine();
        }
    }

    private void LoanMovie() { //Loan a movie by entering the number of the movie
        Items.ShowAvailableMovies();
        System.out.println("Please enter the number of the movie you want to loan");
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
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
        } else { //om man inte väljer/skriver 1-3:
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
            scanner.nextLine();
        }

    }

    private void RemoveItem() {
        int choice;
        Items.ShowAvailableItems();
        System.out.println("Please enter what kind of item you want to remove, 1.Book, 2.Comic book, 3.Movie");
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> RemoveBook();//Ifall användaren väljer 1 anropas metoden
                case 2 -> RemoveComicBook();//Ifall användaren väljer 2 anropas metoden
                case 3 -> RemoveMovie(); //Ifall användaren väljer 3 anropas metoden
            }
        } else { //om man inte väljer/skriver 1-3:
            System.out.println("You need to choose an integer between 1-3!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
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
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
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
        } else { //om man inte väljer/skriver en existerande siffra:
            System.out.println("You need to choose an integer that exists!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
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
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
            int ComicBookNumber = scanner.nextInt();

            for (ComicBook comicbook : cart.loanedComicBook) {
                if (comicbook.number == ComicBookNumber) {
                    cart.loanedComicBook.remove(comicbook);
                    System.out.println("Removed comic book");
                    return;
                } else {
                    System.out.println("This comic book does not exist, please enter a valid number!");
                    RemoveComicBook();
                }
            }
        } else { //om man inte väljer/skriver en existerande siffra:
            System.out.println("You need to choose an integer that exists!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
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
        if (scanner.hasNextInt()) { //ser till att användaren skriver en int och inte ett otillåtet värde
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
        } else { //om man inte väljer/skriver en existerande siffra:
            System.out.println("You need to choose an integer that exists!!! Try again: "); //säger till ifall användaren skriver ett otillåtet tal och låter användaren försöka igen tills det blir rätt
            scanner.nextLine();
        }
    }
}



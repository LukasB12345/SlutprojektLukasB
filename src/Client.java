import java.util.ArrayList;

public class Client extends Cart { //a client has a cart
    //Attributes:
    public String name;
    private Cart ClientCart = new Cart();

    //Constructors:

    //Default constructor:
    public Client() {
    }

    //Constructor:
    public Client(String name) {
        this.name = name;
    }

}






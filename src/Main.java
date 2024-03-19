import java.util.*;

public class Main {
    public static void main(String[] args) {
        ItemDB db = new ItemDB();
        Cart cart = new Cart();

        new Load(db);
        
        db.display();

        new Menu(cart, db);
        cart.displayCart();
    }
}

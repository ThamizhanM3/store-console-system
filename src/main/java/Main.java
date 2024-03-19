// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    ItemDB db = new ItemDB();
    Cart cart = new Cart();

    Load l = new Load(db);
    
    Product product = new Product("Product1", 10, "Category1");
    product.display();
    db.display();

    Menu menu = new Menu(cart, db);
    cart.displayCart();
      
  }

  /* M E N U....... M A I N  ILLA */
 /* poyeru
  athu ila
  irritate akuthu
  no
  bye
  https://replit.com/@THAMIZHANM3/StoreConsole#src/main/java/Menu.java
    // @Test
    eii
    
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }*/
}
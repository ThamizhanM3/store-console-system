import java.util.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Menu(Cart cart, ItemDB db){  

        int choice=openMenu();

        switch(choice){
            case 1:
                addToCart(cart, db);
                break;
        }
    }
    
    int openMenu(){
        System.out.println("Welcome to the Store");
        System.out.println("Please Select the Option");
        System.out.println("1.Add Product to cart");
        System.out.println("2.Remove Product from cart");
        System.out.println("3.Display Cart");
        System.out.println("4.Billing");
        System.out.println("Enter Your Choice");
        return sc.nextInt();
    }
    
    void addToCart(Cart cart, ItemDB db){
        System.out.println("Enter the name of the item you want to add");
        String name=sc.next();
        if (!db.checkItem(name)){
            System.err.println("No Such Product");
            return;
        }
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        cart.addToCart(db.getProduct(name),quantity);

    }
}
import java.util.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Menu(Cart cart, ItemDB db){
        int choice = openMenu();
        while(choice != 4){
            switch(choice){
                case 1:
                    addToCart(cart, db);
                    break;
                case 2:
                    removeFromCart(cart, db);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                default:
                    System.err.println("No Such option");
                    break;
            }
            choice = openMenu();
        }
        if(choice == 4){
            cart.calculateBill();
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
        sc.nextLine();
        String name=sc.nextLine();
        if (!db.checkItem(name)){
            System.err.println("No Such Product in Store");
            return;
        }
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        cart.addToCart(db.getProduct(name),quantity);
    }
    
    void removeFromCart(Cart cart, ItemDB db){
        System.out.println("Enter the name of the item you want to remove");
        sc.nextLine();
        String name=sc.nextLine();
        if (!cart.checkItem(name)){
            System.err.println("No Such Product in Cart");
            return;
        }
        System.out.println("Product: " + name + " Removed");
    }
}
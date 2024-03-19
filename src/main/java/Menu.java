import java.util.*;

class Menu{
  Scanner sc = new Scanner(System.in);
  Menu(Cart cart, ItemDB db){  
    System.out.println("Welcome to the Store");
    System.out.println("Please Select the Option");
    System.out.println("1.Add Product to cart");
    System.out.println("2.Remove Product from cart");
    System.out.println("3.Display Cart");
    System.out.println("4.Billing");
    System.out.println("Enter Your Choice");

    int choice=sc.nextInt();
    switch(choice){
      case 1:
        System.out.println("Enter the name of the item you want to add");
        String name=sc.next();
       
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        
        cart.addToCart(db.getProduct(name),quantity);
    }
  }
}
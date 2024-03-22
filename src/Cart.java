import java.util.*;

class Data {
    Product product;
    int quantity;
    Data(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}

public class Cart {
    public List<Data> cart = new ArrayList<>();
    public int totalPrice;
    
    public void addToCart(Product product, int quantity){
        Data data = new Data(product, quantity);
        cart.add(data);
    }
    public void removeFromCart(Product product){
        for(Data data:cart){
            if(data.product.getName().equals(product.getName())){
                cart.remove(data);
            }
        }
    }
    public void displayCart(){
        for(Data data:cart){
        System.out.println(data.product.getName()+" "+data.product.getPrice()+" "+data.product.getCategory()+" "+"Quantity: "+data.quantity);
        }
    }
    public boolean checkItem(String name){
        for(Data product:cart){
            if(product.product.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void calculateBill(){
        int total = 0;
        for(Data product:cart){
            total += product.quantity * product.product.getPrice();
        }
        System.out.println(total);
    }
}

import java.util.*;

public class ItemDB {
    List<Product> productList=new ArrayList<>();
    public void addProduct(Product product){
        productList.add(product);
    }
    
    public Product getProduct(String name){
        for(Product product:productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    
    public boolean checkItem(String name){
        for(Product product:productList){
            if(product.getName().equals(name)){
                return true;
            }
        }
        return false;

    }
    
    public void display(){
        for(Product i:productList){
            System.out.print(i.getName()+" "+i.getPrice()+" "+i.getCategory());
            i.display();
        }
    }
}

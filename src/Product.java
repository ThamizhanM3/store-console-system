public class Product {
    public String Name;
    public int Price;
    public String Category;
    
    Product(String Name,int Price,String Category){
        this.Name=Name;
        this.Price=Price;
        this.Category=Category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    
    public String getCategory() {
        return  Category;
    }

    public void setCategory(String category) {
        Category =  category;
    }

    void display(){
        System.out.println("Your Product Name is "+Name+"Price of the product is "+Price+" and the type is "+Category);
    }
}

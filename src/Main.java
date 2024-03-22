public class Main {
    public static void main(String[] args) {
        ItemDB db = new ItemDB();
        Cart cart = new Cart();
        new Load(db);
        new Menu(cart, db);
    }
}


// import java.util.List;

// interface CartItem {
//     int getPrice();

//     void display();
// }

// class Product implements CartItem {
//     private String name;
//     private int price;

//     Product(String _name, int _price) {
//         this.name = _name;
//         this.price = _price;
//     }

//     public int getPrice() {
//         return this.price;
//     }

//     public void display() {
//         System.out.println("Product Name: " + this.name + ", Price: " + this.price);
//     }
// }

// class ProductBundle implements CartItem {
//     private List<CartItem> list;
//     private String name;

//     ProductBundle(String _name) {
//         this.name = _name;
//         list = new ArrayList<>();
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void addProduct(CartItem p) {
//         this.list.add(p);
//     }

//     public int getPrice() {
//         int ans = 0;
//         for (CartItem p : this.list) {
//             ans += p.getPrice();
//         }
//         return ans;
//     }

//     public void display() {
//         for (CartItem x : this.list) {
//             System.out.println("Bundle Name: " + this.name + ", Price: " + x.getPrice());
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         CartItem p1 = new Product("Iphone 10", 100000);
//         CartItem p2 = new Product("Iphone 11", 120000);
//         CartItem p3 = new Product("Iphone 12", 140000);
//         ProductBundle bundle = new ProductBundle("Iphone Bundle");
//         bundle.addProduct(p1);
//         bundle.addProduct(p2);
//         bundle.addProduct(p3);

//         ProductBundle bundle2 = new ProductBundle("Samsung Bundle");
//         bundle2.addProduct(new Product("Samsung S10", 80000));
//         bundle2.addProduct(new Product("Samsung S20", 90000));
//         bundle2.addProduct(new Product("Samsung S21", 90000));
//         bundle2.addProduct(new Product("Samsung S222", 90000));

//         List<CartItem> list = new ArrayList<>();
//         list.add(bundle);
//         list.add(bundle2);
//         list.add(p1);
//         list.add(p2);

//         for (CartItem item : list) {
//             item.display();
//             System.out.println("Price: " + item.getPrice());
//         }
//         /*
//          now if you notice above for loop, we are not checking the type of object
//             * because we have used interface CartItem, which is implemented by both
//             * Product and ProductBundle classes.
//             * This is the essence of the composition pattern, where we can treat
//             * different types of objects uniformly through a common interface.
//             * This allows us to add new types of items in the future without changing
//             * the existing code that uses the CartItem interface.
//             * This is a good practice as it promotes code reusability and maintainability.
//             * We can add new types of items in the future without changing the existing code.

//             never use Object type to store different types of objects.
//          */
//     }
// }
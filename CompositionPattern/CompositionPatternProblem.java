
// import java.util.ArrayList;
// import java.util.List;

// class Product{
//     private String name;
//     private int price;

//     Product(String _name,int _price){
//         this.name=_name;
//         this.price=_price;
//     }
//     public int getPrice(){
//         return this.price;
//     }
// }
// class ProductBundle{
//     private List<Product> list;
//     private String name;
    
//     ProductBundle(String _name){
//         this.name=_name;
//         list=new ArrayList<>(); 
//     }
//     public String getName(){
//         return this.name;
//     }
//     public void addProduct(Product p){
//         this.list.add(p);
//     }
//     public int getPrice(){
//         int ans=0;
//         for(Product p:this.list){
//             ans+=p.getPrice();
//         }
//         return ans;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Product p1 = new Product("Iphone 10", 100000);
//         Product p2 = new Product("Iphone 11", 120000);
//         Product p3 = new Product("Iphone 12", 140000);
//         ProductBundle bundle = new ProductBundle("Iphone Bundle");
//         bundle.addProduct(p1);
//         bundle.addProduct(p2);
//         bundle.addProduct(p3);

//         ProductBundle bundle2 = new ProductBundle("samsung Bundle");
//         bundle2.addProduct(new Product("Samsung S10", 80000));
//         bundle2.addProduct(new Product("Samsung S20", 90000));
//         bundle2.addProduct(new Product("Samsung S21", 90000));
//         bundle2.addProduct(new Product("Samsung S222", 90000));

//         List<Object> list = new ArrayList<>();
//         list.add(bundle);
//         list.add(bundle2);
//         list.add(p1);
//         list.add(p2);

//         for(Object o : list){
//             if(o instanceof ProductBundle){
//                 ProductBundle pb = (ProductBundle) o;
//                 System.out.println(pb.getName() + " Price: " + pb.getPrice());
//             } else if(o instanceof Product){
//                 Product p = (Product) o;
//                 System.out.println("Product Price: " + p.getPrice());
//             }
//         }

//     }
// }

// /*
//  in above code problem is that we are using Object type to store both Product and ProductBundle.
//  we dont know which type of object is stored in the list.
//  and this is not a good practice. you should know the type of object you are storing in the list always.
//  so this problem can solve by using composition pattern.
// The Composite Pattern allows you to treat individual objects and compositions of objects uniformly.
// This pattern is particularly useful when you want to represent part-whole hierarchies, where both individual objects and groups of objects can be treated the same way.

//  */
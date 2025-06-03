// interface ItemVisitor {
//     void visit(PhysicalProduct physicalProduct);
//     void visit(DigitalProduct digitalProduct);
//     void visit(GiftCardProduct giftCardProduct);
// }

// interface Product {
//     void accept(ItemVisitor visitor);
// }

// class CalculateTotalTax implements ItemVisitor{
//     public void visit(PhysicalProduct physicalProduct){
//         System.out.println("Calculating tax for Physical Product: " + physicalProduct);
//     }
//     public void visit(DigitalProduct digitalProduct){
//         System.out.println("Calculating tax for Digital Product: " + digitalProduct);
//     }
//     public void visit(GiftCardProduct giftCardProduct){
//         System.out.println("Calculating tax for Gift Card Product: " + giftCardProduct);
//     }
// }
// class CalculateShippingCost implements ItemVisitor{
//     public void visit(PhysicalProduct physicalProduct){
//         System.out.println("Calculating shipping cost for Physical Product: " + physicalProduct);
//     }
//     public void visit(DigitalProduct digitalProduct){
//         System.out.println("Digital Product does not require shipping: " + digitalProduct);
//     }
//     public void visit(GiftCardProduct giftCardProduct){
//         System.out.println("Calculating shipping cost for Gift Card Product: " + giftCardProduct);
//     }
// }
// class GenateCode implements ItemVisitor{
//     public void visit(PhysicalProduct physicalProduct){
//         System.out.println("Generating code for Physical Product: " + physicalProduct);
//     }
//     public void visit(DigitalProduct digitalProduct){
//         System.out.println("Generating code for Digital Product: " + digitalProduct);
//     }
//     public void visit(GiftCardProduct giftCardProduct){
//         System.out.println("Generating code for Gift Card Product: " + giftCardProduct);
//     }
// }

// class PhysicalProduct implements Product {
//     private String name;
//     private int price;
//     PhysicalProduct(String _name,int _price){
//         this.name=_name;
//         this.price=_price;
//     }
//     public void accept(ItemVisitor visitor) {
//         visitor.visit(this);
//     }
//     public String getName() {
//         return name;
//     }
//     public int getPrice() {
//         return price;
//     }
// }

// class DigitalProduct implements Product {
//     private String name;
//     private String DOE;
//     DigitalProduct(String _name,String _DOE){
//         this.name=_name;
//         this.DOE=_DOE;
//     }
//     public void accept(ItemVisitor visitor) {
//         visitor.visit(this);
//     }
//     public String getName() {
//         return name;
//     }
//     public String getDOE() {
//         return DOE;
//     }
// }

// class GiftCardProduct implements Product {
//     private String name;
//     private String code;

//     GiftCardProduct(String _name,String _code){
//         this.name=_name;
//         this.code=_code;
//     }
//     public void accept(ItemVisitor visitor) {
//         visitor.visit(this);
//     }
//     public String getName() {
//         return name;
//     }
//     public String getCode() {
//         return code;
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         GiftCardProduct giftCard = new GiftCardProduct("Amazon Gift Card", "GC12345");
//         PhysicalProduct physicalProduct = new PhysicalProduct("Laptop", 1500);
//         DigitalProduct digitalProduct = new DigitalProduct("E-book", "2024-12-31");

//         ItemVisitor taxCalculator = new CalculateTotalTax();
//         ItemVisitor shippingCalculator = new CalculateShippingCost();
//         ItemVisitor codeGenerator = new GenateCode();


//         giftCard.accept(taxCalculator);
//         giftCard.accept(shippingCalculator);
//         giftCard.accept(codeGenerator);
//         physicalProduct.accept(taxCalculator);
//         physicalProduct.accept(shippingCalculator);
//         physicalProduct.accept(codeGenerator);
//         digitalProduct.accept(taxCalculator);
//         digitalProduct.accept(shippingCalculator);
//         digitalProduct.accept(codeGenerator);
//         System.out.println("All operations completed successfully.");
//     }
// }

// /*
//  in above code we solve the problem of calculating tax, shipping cost, and generating codes for different types of products using the Visitor Design Pattern. using visitor design pattern we can add new operations without modifying the existing product classes, adhering to the Open/Closed Principle (OCP) of SOLID principles.
// // This allows for better scalability and maintainability of the codebase, as new operations can be added by simply creating new visitor classes without changing the existing product classes.
//  */
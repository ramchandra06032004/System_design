// class PhysicalProduct{
//     void productInvoice(){

//     }
//     void calculateProductShippingCost(){
        
//     }
// }
// class DigitalProduct{
//     void productInvoice(){

//     }
    
// }
// class GiftCards{
//     void productInvoice(){

//     }
//     void generateCode (){

//     }
// }
// public class Main {

//     public static void main(String[] args) {
        
//     }
// }

// /*
//  now in above code problem is that suppose we have to add new method in PhysicalProduct class like calculateProductTax
//  so out client need  to know about this method and they need to change their code accordingly
//  so which makes client code tightly coupled with the implementation of PhysicalProduct class
//  and not scalable
// This is a violation of the Open/Closed Principle (OCP) of SOLID principles.
// to address this issue we have visitor design pattern
// The Visitor Design Pattern allows you to add new operations to existing object structures without modifying the structures themselves.
// when you have a set of classes that you want to perform operations on, and you want to add new operations without changing the classes themselves, you can use the Visitor pattern.
//  */
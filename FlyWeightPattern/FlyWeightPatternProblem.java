// import java.util.ArrayList;

// class Tree{
//     private int x;
//     private int y;
//     private String name;
//     private String color;
//     private String texture;

//     Tree(int _x, int _y, String _name, String _color, String _texture){
//         this.x=_x;
//         this.y=_y;
//         this.name=_name;
//         this.color=_color;
//         this.texture=_texture;
//     }

//     public void drawTree(){
//         System.out.println("Drawing tree at (" + x + ", " + y + ") with name: " + name + ", color: " + color + ", texture: " + texture);
//     }
// }

// class Forest{
//     private ArrayList<Tree> forest;
//     Forest(){
//         forest=new ArrayList<>();
//     }

//     public void addTree(Tree tree){
//         forest.add(tree);
//     }
//     public void getForest(){
//         for(Tree tree : forest){
//             tree.drawTree();
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Tree tree1 = new Tree(10, 20, "Oak", "Green", "Rough");
//         Tree tree2 = new Tree(30, 40, "Oak", "Green", "Rough");
//         Tree tree3 = new Tree(50, 60, "Oak", "Green" , "Rough");
//         Tree tree4 = new Tree(70, 80, "Oak", "Green", "Rough");
//         Tree tree5 = new Tree(90, 100, "Oak", "Green", "Rough");
//         Forest forest = new Forest();
//         forest.addTree(tree1);
//         forest.addTree(tree2);
//         forest.addTree(tree3);
//         forest.addTree(tree4);
//         forest.addTree(tree5);
//         forest.getForest();

//     }
// }

// /*
//  in above code we have created a Tree class with properties like x, y, name, color, and texture.
//  but problem is that we have to create a new object for each tree and in each object the name is same, color is same and texture is same.
//  so this increases the memory usage and makes the code less efficient.
// To solve this problem, we can use the Flyweight Design Pattern.
// The Flyweight Design Pattern allows us to share common data among multiple objects, reducing memory usage and improving performance.
// In this example, we can create a single Tree object with the common properties and then reuse it for multiple trees in the forest.
//  */
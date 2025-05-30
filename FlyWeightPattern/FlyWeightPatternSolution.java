// import java.util.ArrayList;
// import java.util.HashMap;

// class TreeType{
//     private String name;
//     private String color;
//     private String texture;

//     TreeType(String _name, String _color, String _texture){
//         this.name=_name;
//         this.color=_color;
//         this.texture=_texture;
//     }
//     public void getTree(){
//         System.out.println("Tree Type: " + name + ", Color: " + color + ", Texture: " + texture);
//     }
// }

// class TreeFactory{
//     private static HashMap<String,TreeType> map=new HashMap<>();
//     public static TreeType getTreeType(String _name, String _color, String _texture){
//         String key=_name+" "+_color+" "+_texture;
//         if (map.containsKey(key)) {
//             System.out.println("HIT");
//             return map.get(key);
//         }else{
//             System.out.println("MISS");
//             TreeType temp=new TreeType(_name, _color, _texture);
//             map.put(key,temp);
//             return temp;
//         }
//     }
// }

// class Tree{
//     private int x;
//     private int y;
//     private TreeType treeType;

//     Tree(int _x, int _y, String _name, String _color, String _texture){
//         this.x=_x;
//         this.y=_y;
//         this.treeType=TreeFactory.getTreeType(_name, _color, _texture);
//     }
//     public void drawTree(){
//         System.out.println("Drawing tree at (" + x + ", " + y + ") with name: " );
//         treeType.getTree();
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
//  in above code we have created a TreeType class with properties like name, color, and texture.
//  but as we made treeFactory class which is responsible for creating TreeType objects.
//     if the TreeType object with same name, color, and texture already exists in the map then it will return the existing object.
//     if not then it will create a new object and put it in the map.
//     This way we are reusing the same object for same type of trees and reducing memory usage.
// This is an example of the Flyweight Design Pattern.
//  */
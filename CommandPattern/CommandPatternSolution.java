// import java.util.Stack;

// interface Appliances {
//     void on();

//     void of();
// }

// interface Command {
//     void execute();

//     void undo();
// }

// class TV implements Appliances {
//     public void on() {
//         System.out.println("TV on");
//     }

//     public void of() {
//         System.out.println("TV of");
//     }
// }

// class AC implements Appliances {
//     public void on() {
//         System.out.println("AC on");
//     }

//     public void of() {
//         System.out.println("AC of");
//     }
// }

// class Light implements Appliances {
//     public void on() {
//         System.out.println("Light on");
//     }

//     public void of() {
//         System.out.println("Light of");
//     }
// }

// class TurnOnAC implements Command {
//     private Appliances ac;

//     TurnOnAC(Appliances _ac) {
//         this.ac = _ac;
//     }

//     public void execute() {
//         ac.on();
//     }

//     public void undo() {
//         ac.of();
//     }
// }

// class TurnOfAC implements Command {
//     private Appliances ac;

//     TurnOfAC(Appliances _ac) {
//         this.ac = _ac;
//     }

//     public void execute() {
//         ac.of();
//     }

//     public void undo() {
//         ac.on();
//     }
// }

// class TurnOnTV implements Command {
//     private Appliances tv;

//     TurnOnTV(Appliances _tv) {
//         this.tv = _tv;
//     }

//     public void execute() {
//         tv.on();
//     }

//     public void undo() {
//         tv.of();
//     }
// }

// class TurnOfTv implements Command {
//     private Appliances tv;

//     TurnOfTv(Appliances _tv) {
//         this.tv = _tv;
//     }

//     public void execute() {
//         tv.of();
//     }

//     public void undo() {
//         tv.on();
//     }
// }

// class TurnOnLight implements Command {
//     private Appliances light;

//     TurnOnLight(Appliances _light) {
//         this.light = _light;
//     }

//     public void execute() {
//         light.on();
//     }

//     public void undo() {
//         light.of();
//     }
// }

// class TurnOfLight implements Command {
//     private Appliances light;

//     TurnOfLight(Appliances _light) {
//         this.light = _light;
//     }

//     public void execute() {
//         light.of();
//     }

//     public void undo() {
//         light.on();
//     }
// }

// class Remote {
//     private Command[] remote;
//     Stack<Command> st;

//     Remote(int size) {
//         remote = new Command[size];
//         st=new Stack<>();
//     }
//     public void setAction(int keyNumber, Command command) {
//         if (keyNumber > remote.length) {
//             System.out.println("Key not found");
//         }
//         remote[keyNumber] = command;
//     }

//     public void pressButton(int key) {
//         if (remote[key] != null) {
//             st.add(remote[key]);
//             remote[key].execute();
//         }
//     }
//     public void pressUndo(){
//         if (st.isEmpty()) {
//             System.out.println("No command for undo");
//         }else{
//             st.pop().undo();
//         }
//     }
    
// }

// public class Main {

//     public static void main(String[] args) {
//         Appliances ac = new AC();
//         Appliances tv = new TV();
//         Appliances light = new Light();
//         Remote r = new Remote(6);
//         r.setAction(0, new TurnOfAC(ac));
//         r.setAction(1, new TurnOnAC(ac));
//         r.setAction(2, new TurnOnLight(light));
//         r.setAction(3, new TurnOfLight(light));
//         r.setAction(4, new TurnOnTV(tv));
//         r.setAction(5, new TurnOfTv(tv));
        
//         r.pressButton(0);
//         r.pressButton(1);
//         r.pressButton(2);
//         r.pressButton(3);
//         r.pressButton(4);
//         r.pressButton(5);

//         r.pressUndo();
//         r.pressUndo();
//         r.pressUndo();
//         r.pressUndo();
//         r.pressUndo();
//     }
// }

// /*
//  now in above code there is loose coupling between Remote and Appliances
// the client talks to the remote and remote talks to the appliances
// the client does not know about the appliances
// also we can add batch commands like TurnOnAll and TurnOffAll night mode etc

//  */

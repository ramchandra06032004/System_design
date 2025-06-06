// import java.util.ArrayList;
// import java.util.Stack;

// class ResumeBuilder {
//     private String name;
//     private String collegeName;
//     private float cgpa;
//     private String currentCompony;
//     private String role;

//     public void setName(String _name) {
//         this.name = _name;
//     }
//     public void setCollegeName(String _collegeName) {
//         this.collegeName = _collegeName;
//     }

//     public void setCgpa(float _cgpa) {
//         this.cgpa = _cgpa;
//     }

//     public void setcurrentCompony(String _currentCompony) {
//         this.currentCompony = _currentCompony;
//     }

//     public void setRole(String _role) {
//         this.role = _role;
//     }

//     public void printResume() {
//         System.out.println(this.name);
//         System.out.println(this.collegeName);
//         System.out.println(this.cgpa);
//         System.out.println(this.currentCompony);
//         System.out.println(this.role);
//     }
//     public Memento saveResume(){
//         return new Memento(name, collegeName, cgpa, currentCompony, role);
//     }
//     public void restore(Memento resume){
//         this.name=resume.getName();
//         this.collegeName=resume.getCollegeName();
//         this.cgpa=resume.getCgpa();
//         this.currentCompony=resume.getCurrentCompony();
//         this.role=resume.getRole();
//     }

//     public static class Memento {
//         private final String name;
//         private final String collegeName;
//         private final float cgpa;
//         private final String currentCompony;
//         private final String role;

//         private Memento(String _name,String _collegeName,float _cgpa,String _currentCompony,String _role){
//             this.name=_name;
//             this.collegeName=_collegeName;
//             this.cgpa=_cgpa;
//             this.currentCompony=_currentCompony;
//             this.role=_role;
//         }

//         private String getName(){
//             return this.name;
//         }
//         private String getCollegeName(){
//             return this.collegeName;
//         }

//         private String getCurrentCompony(){
//             return this.currentCompony;
//         }
//         private float getCgpa(){
//             return this.cgpa;
//         }
//         private String getRole(){
//             return this.role;
//         }
//     }
// }

// class ResumeHistory{
//     private Stack<ResumeBuilder.Memento> st=new Stack<>();

//     public void save(ResumeBuilder editor){
//         st.push(editor.saveResume());
//     }
//     public void undo(ResumeBuilder editor){
//         if (!st.isEmpty()) {
//             editor.restore(st.pop());
//         }
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         ResumeBuilder resume=new ResumeBuilder();
//         resume.setName("Bob Smith");
//         resume.setCollegeName("MIT");
//         resume.setCgpa(3.8f);
//         resume.setcurrentCompony("Google");
//         resume.setRole("Software Engineer");
//         resume.printResume();
//         System.out.println("---------------------------");

//         ResumeHistory history=new ResumeHistory();
//         history.save(resume);
//         resume.setName("Alice Johnson");
//         resume.setCollegeName("Stanford");
//         history.save(resume);
//         resume.printResume();
//         System.out.println("---------------------------");

//         history.undo(resume);
//         history.undo(resume);
//         resume.printResume();
//     }
// }
// /*
//  now in this code we have implemented memento pattern to save the state of resume builder
//     and restore it to a previous state
//     this is done by creating a memento class which holds the state of the resume builder
//     and a history class which holds the stack of mementos
//     we can save the state of the resume builder by calling the save method of the history class
//     and restore it by calling the undo method of the history class
//     this is a simple implementation of memento pattern
//  */
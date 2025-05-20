// class JudgeAnalysis{
//     private int runCount;
//     private int submitCount;

//     JudgeAnalysis(){
//         runCount=0;
//         submitCount=0;
//     }

//     public void runCode(){
//         runCount++;
//     }
//     public void submitCode(){
//         submitCount++;
//     }

//     public void getRunCount() {
//         System.out.println(runCount);
//     }
//     public void getSubmitCount() {
//         System.out.println(submitCount);
//     }

// }
// public class SingletonPatternProblemStatement {

//     public static void main(String[] args) {
//            JudgeAnalysis j1=new JudgeAnalysis();
//            JudgeAnalysis j2=new JudgeAnalysis();

//            j1.runCode();
//            j2.runCode();
//            j1.getRunCount();
//            j2.getRunCount();

//            System.out.println(j1);
//            System.out.println(j2);

//     }
// }

// /*
//  problem in above code is that both j1 and j2 are different instances
//  and they maintain their own state. If we want to have a single instance
//  of JudgeAnalysis that is shared across the application, we need to implement
//  the Singleton pattern.
//  */
// //lazy loading of object

// class JudgeAnalysis {
//     private int runCount;
//     private int submitCount;
//     private static JudgeAnalysis judge;

//     private JudgeAnalysis() {
//         runCount = 0;
//         submitCount = 0;
//     }

//     public static JudgeAnalysis getJudge() {
//         if (judge == null) {
//             judge = new JudgeAnalysis();
//             return judge;
//         }
//         return judge;
//     }

//     public void runCode() {
//         runCount++;
//     }

//     public void submitCode() {
//         submitCount++;
//     }

//     public void getRunCount() {
//         System.out.println(runCount);
//     }

//     public void getSubmitCount() {
//         System.out.println(submitCount);
//     }
// }

// public class SingletonPatternSolution2 {
//     public static void main(String[] args) {
//         JudgeAnalysis j1 = JudgeAnalysis.getJudge();
//         JudgeAnalysis j2 = JudgeAnalysis.getJudge();

//         j1.runCode();
//         j2.runCode();
//         j1.getRunCount();
//         j2.getRunCount();

//         System.out.println(j1);
//         System.out.println(j2);
//     }
// }


// /*
//  in above code problem is this is not thread safe multiple threads can
//      create multiple instances of JudgeAnalysis class.
//      So we need to make this thread safe.
//      So we will use synchronized block to make this thread safe.
//      But this will create a performance issue as every time we call getJudge()
//      method, it will create a synchronized block and it will take time to
//      create the object.


//      so we will use double checked locking to make this thread safe.
//  */
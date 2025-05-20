// //lazy loading of object with double check locking

// class JudgeAnalysis {
//     private int runCount;
//     private int submitCount;
//     private static volatile JudgeAnalysis judge;

//     private JudgeAnalysis() {
//         runCount = 0;
//         submitCount = 0;
//     }

//     public static JudgeAnalysis getJudge() {
//         if (judge == null) {
//             synchronized (JudgeAnalysis.class){
//                 if (judge==null) {
//                     judge=new JudgeAnalysis();
//                 }
//             }
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

// public class SingletonPatternFinalSolution {
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


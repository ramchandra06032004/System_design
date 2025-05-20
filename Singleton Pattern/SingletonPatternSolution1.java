//eager Loading of object
class JudgeAnalysis {
    private int runCount;
    private int submitCount;

    private static final JudgeAnalysis judge = new JudgeAnalysis();
    private JudgeAnalysis() {
        runCount = 0;
        submitCount = 0;
    }


    public static JudgeAnalysis getJudge() {
        return judge;
    }

    public void runCode() {
        runCount++;
    }

    public void submitCode() {
        submitCount++;
    }

    public void getRunCount() {
        System.out.println(runCount);
    }

    public void getSubmitCount() {
        System.out.println(submitCount);
    }
}

public class SingletonPatternSolution1 {
    public static void main(String[] args) {
        JudgeAnalysis j1 = JudgeAnalysis.getJudge();
        JudgeAnalysis j2 = JudgeAnalysis.getJudge();

        j1.runCode();
        j2.runCode();
        j1.getRunCount();
        j2.getRunCount();

        System.out.println(j1);
        System.out.println(j2);

    }
}


/*
 in above code we have created a single instance of JudgeAnalysis class
    and we are using that instance to maintain the state of the class.
    So both j1 and j2 are pointing to the same instance of JudgeAnalysis class.
    So if we call runCode() method on j1, it will increment the runCount
    of the same instance and if we call runCode() method on j2, it will
    increment the runCount of the same instance.


    ////////////////////////////////////////
    but problem with this is it unnecessarily creates the object 
    at the time of class loading even if it is not used in the application.
    This is not a good practice as it increases the memory footprint of the application.
    So we need to implement the lazy loading of object.
 */
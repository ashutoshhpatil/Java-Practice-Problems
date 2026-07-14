package Abstraction;

abstract  class ProgrammingLanguage{
    float executionTime;
    int memoryUsed;

    abstract  String getLanguageName();
    abstract  String getExtension();
    abstract String getCompilerName();
    abstract  void compileCode();
    abstract void executeProgram();

    void runProgram(){
        System.out.println("Language Name: "+ getLanguageName());
        System.out.println("CompilerName: "+getCompilerName());
        System.out.println("File Extension: "+ getExtension());
        compileCode();
        executeProgram();
        System.out.println("Execution Time: "+executionTime+" sec");
        System.out.println("Memory Used: "+memoryUsed+ " MB");
    }
}

class JAVA extends ProgrammingLanguage{
    {
        executionTime = 2;
        memoryUsed = 120;
    }
    @Override
    String getLanguageName() {
        return "Java";
    }

    @Override
    String getExtension() {
        return ".java";
    }

    @Override
    String getCompilerName() {
        return "javac";
    }

    @Override
    void compileCode() {
        System.out.println("Compiling Java source code...\n" +
                "Bytecode generated successfully.");
    }

    @Override
    void executeProgram() {
        System.out.println("Running JVM...\n" +
                "Program executed successfully.");
    }
}

class C extends ProgrammingLanguage{
    {
        executionTime = 1;
        memoryUsed = 40;
    }
    @Override
    String getLanguageName() {
        return "C";
    }

    @Override
    String getCompilerName() {
        return "GCC";
    }

    @Override
    String getExtension() {
        return ".c";
    }

    @Override
    void compileCode() {
        System.out.println("Compiling C Program \n" +
                ".a.out file generated " );
    }

    @Override
    void executeProgram() {
        System.out.println("Running C Program \n " +
                "Program Executed Successfully");
    }
}

class Python extends ProgrammingLanguage{
    {
        executionTime = 3;
        memoryUsed = 80;
    }

    @Override
    String getLanguageName() {
        return "Python";
    }

    @Override
    String getCompilerName() {
        return "Python Interpreter";
    }

    @Override
    String getExtension() {
        return ".py";
    }

    @Override
    void compileCode() {
        System.out.println("No separate compilation required.");
    }

    @Override
    void executeProgram() {
        System.out.println("Running Python Interpreter \n " +
                "Python Program Executed Successfully");
    }
}

public class CompilerEngine {
    public static void main(String[] args) {
        ProgrammingLanguage obj;
        obj=new JAVA();
        obj.runProgram();
        System.out.println("---------------------------");

        obj = new C();
        obj.runProgram();
        System.out.println("---------------------------");

        obj = new Python();
        obj.runProgram();

    }
}

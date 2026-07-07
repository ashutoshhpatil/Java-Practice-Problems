package Inheritance.HybridInheritance;

class OnlineLearning{
    String platformName = "Core2Web";
    String founderName = "Shashi Bagal";

    void disp(){
        System.out.println("Platform Name: "+platformName);
        System.out.println("Founder Name: "+founderName);
    }
}

class Course extends OnlineLearning{
    String courseName = "DSA USING JAVA";
    int duration= 100;

    void dispCourse(){
        super.disp();
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+duration+ " hrs");
    }
}

class ProgCourse extends Course{
    String programmingLang  = "Java";
    int projectCount = 25;

    void dispProg(){
        super.dispCourse();
        System.out.println("Programming language: "+programmingLang);
        System.out.println("Projects Included: "+projectCount);
    }
}

class DesignCourse extends Course{
    String softwareUsed = "AutoCAD";
    int portfolioProjects = 6;

    void dispDesign(){
        courseName = "AutoCAD Designing";
        duration = 85;
        super.dispCourse();
        System.out.println("Software Used: "+softwareUsed);
        System.out.println("Portfolio Projects: "+portfolioProjects);
    }
}


public class LearningPlatform {
    public static void main(String[] args) {
        ProgCourse pc =new ProgCourse();
        pc.dispProg();

        System.out.println("=======================");

        DesignCourse dc = new DesignCourse();
        dc.dispDesign();

    }
}

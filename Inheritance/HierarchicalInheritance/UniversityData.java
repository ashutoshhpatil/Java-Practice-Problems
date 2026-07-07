package Inheritance.HierarchicalInheritance;

class University{
    String universityName = "SPPPU";
    String location = "Pune";

    void disp(){
        System.out.println("University Name: "+universityName);
        System.out.println("University Location: "+location);
    }
}

class underGrad extends University{
    String studentName;
    float totalMarks = 465;
    float percentage;
    int attendance = 85;

    void getInfo(){
        percentage = ((totalMarks/500)*100);

        if(percentage>=75 && attendance>=60){
            System.out.println("Eligible for Scholarship");
        }else {
            System.out.println("Not Eligible for Scholarship ");
        }
    }

    void dispUnderGrad(){
       super.disp();
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Attendance: "+attendance);
        System.out.println("Percentage: "+percentage);
    }
}

class postGrad extends University{
    String studentName = "Avinash";
    float CGPA= 9.56f;
    boolean researchPaper = true;

    void getData(){
        if(CGPA>=7.5 && researchPaper){
            System.out.println("Eligible for Placements");
        }else {
            System.out.println("Not Eligible");
        }
    }

    void dispPost(){
        super.disp();
        System.out.println("Student Name: "+studentName);
        System.out.println("Total CGPA: "+CGPA);
        System.out.println("Is Research Paper Published: "+researchPaper);
    }
}

public class UniversityData {
    public static void main(String[] args) {
        underGrad underGrad = new underGrad();
        underGrad.getInfo();
        underGrad.dispUnderGrad();
        System.out.println();
        postGrad postGrad = new postGrad();
        postGrad.getData();
        postGrad.dispPost();

    }
}

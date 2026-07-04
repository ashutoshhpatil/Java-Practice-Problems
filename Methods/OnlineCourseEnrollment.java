package Methods.Assignment1;

public class OnlineCourseEnrollment {
    String studentName;
    String courseName;
    int courseFee;
    int numberofCourse;

    void displayCourse(){
        System.out.println("Different Courses are as follws");
        System.out.println("Java Development " + "Python Development "+ " Web Development "+ "Flutter Development");
    }

    void enrollCourse(String studentName, String courseName, int numberofCourse){
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseFee = courseFee;

        System.out.println("Student Name: "+studentName);
        System.out.println("Course Name "+courseName);
        System.out.println("No of Courses "+ numberofCourse);
    }

    int getCourseFee(){
        if(courseName.equalsIgnoreCase("Java Development")){
            courseFee = 25000;
        }
        else if(courseName.equalsIgnoreCase("Python Development")){
            courseFee = 30000;
        }
        else if(courseName.equalsIgnoreCase("Web Development")){
            courseFee = 20000;
        }
        else if(courseName.equalsIgnoreCase("Flutter Development")){
            courseFee = 20000;
        }else {
            System.out.println("Course Not Available");
        }
        return courseFee;
    }
    int calculateTotalFee(int numberofCourse){
        this.courseFee = courseFee;
        this.numberofCourse = numberofCourse;
        return courseFee;
    }

    public static void main(String[] args) {
        OnlineCourseEnrollment onlineCourseEnrollment = new OnlineCourseEnrollment();
        onlineCourseEnrollment.displayCourse();
        onlineCourseEnrollment.enrollCourse("Ashutosh","Java Development",3);
        onlineCourseEnrollment.getCourseFee();
        onlineCourseEnrollment.calculateTotalFee(1);
        int totalFee = onlineCourseEnrollment.getCourseFee();
        System.out.println("Total Fee: "+totalFee);
    }
}

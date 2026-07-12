package Constructor;

class Student1{
    String studentName;
    int rollNo;

    Student1(String studentName,int rollNo){
        this.studentName=studentName;
        this.rollNo=rollNo;
    }
}

public class StudentConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Ashutosh", 101);
        Student1 s2 = new Student1("Aditya ", 102);
        Student1 s3 = new Student1("Sanyukta ", 103);


        System.out.println(s1.studentName + "--> " + s1.rollNo);
        System.out.println(s2.studentName + "--> " + s2.rollNo);
        System.out.println(s3.studentName + "--> " + s3.rollNo);
    }
}

//
//String nameList[] = {"Ashutosh","Aditya","Sanyukta"};
//
//        for(int i=0;i<nameList.length;i++){
//            String name =nameList[i];
//            int rollNo = 100+i+1;
//
//            System.out.println(name+ "-->"+rollNo);
//        }
package ConditionalStatements;

import java.util.Scanner;

public class UniversitySyllabus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year:(FE/BE/TE/BE)");
        String year = sc.nextLine();
        String sem;


        switch (year){
            case "FE":
                System.out.println("Enter Semester");
                System.out.println("Sem 1/ Sem 2");
                sem = sc.nextLine();
                if(sem.equalsIgnoreCase("Sem 1")){
                    System.out.println("1. Engineering Mathematics I\n" +
                            "2. Engineering Physics\n" +
                            "3. Basic Electrical Engineering\n" +
                            "4. Programming in C\n" +
                            "5. Engineering Graphics");
                }else if (sem.equalsIgnoreCase("Sem 2")){
                    System.out.println("1. Engineering Mathematics II\n" +
                            "2. Engineering Chemistry\n" +
                            "3. Basic Electronics Engineering\n" +
                            "4. Data Structures\n" +
                            "5. Environmental Studies");
                }else {
                    System.out.println("Invalid Semester");
                }
                break;

            case "SE":
                System.out.println("Enter Semester");
                System.out.println("Sem 1/ Sem 2");
                sem = sc.nextLine();
                if(sem.equalsIgnoreCase("Sem 1")){
                    System.out.println("1. Discrete Mathematics\n" +
                            "2. Object-Oriented Programming using Java\n" +
                            "3. Data Structures and Algorithms\n" +
                            "4. Digital Logic Design\n" +
                            "5. Computer Organization");
                }else if (sem.equalsIgnoreCase("Sem 2")){
                    System.out.println("1. Database Management Systems\n" +
                            "2. Operating Systems\n" +
                            "3. Computer Networks\n" +
                            "4. Software Engineering\n" +
                            "5. Theory of Computation");
                }else {
                    System.out.println("Invalid Semester");
                }
                break;

            case "TE":
                System.out.println("Enter Semester");
                System.out.println("Sem 1/ Sem 2");
                sem = sc.nextLine();
                if(sem.equalsIgnoreCase("Sem 1")){
                    System.out.println("1. Design and Analysis of Algorithms\n" +
                            "2. Web Technologies\n" +
                            "3. Artificial Intelligence\n" +
                            "4. Machine Learning\n" +
                            "5. Information Security");
                }else if (sem.equalsIgnoreCase("Sem 2")){
                    System.out.println("1. Compiler Design\n" +
                            "2. Cloud Computing\n" +
                            "3. Internet of Things\n" +
                            "4. Mobile Application Development\n" +
                            "5. Software Testing and Quality Assurance");
                }else {
                    System.out.println("Invalid Semester");
                }
                break;

            case "BE":
                System.out.println("Enter Semester");
                System.out.println("Sem 1/ Sem 2");
                sem = sc.nextLine();
                if(sem.equalsIgnoreCase("Sem 1")){
                    System.out.println(" 1. Big Data Analytics\n" +
                            "2. Blockchain Technology\n" +
                            "3. DevOps\n" +
                            "4. Elective I\n" +
                            "5. Project Phase I");
                }else if (sem.equalsIgnoreCase("Sem 2")){
                    System.out.println(" 1. Artificial Intelligence Applications\n" +
                            "2. Cyber Security\n" +
                            "3. Elective II\n" +
                            "4. Internship\n" +
                            "5. Project Phase II");
                }else {
                    System.out.println("Invalid Semester");
                }
                break;

            default:
                System.out.println("Invalid");
        }
    }
}

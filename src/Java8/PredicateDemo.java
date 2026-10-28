package Java8;
import java.util.ArrayList;
import java.util.function.*;

class Student{
    String name;
    float percentage;

    Student(String name ,float percentage){
        this.name=name;
        this.percentage = percentage;
    }

}

public class PredicateDemo {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Ashutosh", 85.36f));
        s.add(new Student("Avinash", 96.35f));
        s.add(new Student("Akash", 52.36f));

        Predicate<Student> p = student -> student.percentage >= 70;
        for (Student s2 : s) {
            if (p.test(s2)) {
                System.out.println(s2.name + " " + s2.percentage);
            }
        }
    }
}



//        Predicate <Integer> p = n->n>10;
//        System.out.println(p.test(10));
//        System.out.println(p.test(15));
//        System.out.println(p.test(5));
////
//        Predicate < String> p = str->str.length()>=5;
//        System.out.println(p.test("Ash"));


//        String[] s = {"Ashutosh", "Meera", "Aditi", "Vijay", "Balaji", "Omkar"};
//        Predicate<String> p = str -> str.length() > 5;
//        for (String s1 : s) {
//            if (p.test(s1)) {
//                System.out.println(s1);
//            }
//        }


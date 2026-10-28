package Strings;


final class Student {

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ashutosh");

        System.out.println("Before:");
        System.out.println(s1.getId());
        System.out.println(s1.getName());

//        // Try changing the state
//         s1.name = "Rahul";
//         s1.setName("Rahul");

        System.out.println("After:");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}


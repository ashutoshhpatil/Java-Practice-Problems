package ObjectClass;

class  Student {
    String name;
    int id;

    public  Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+ " "+name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(501,"Ashutosh");
        Student s2 = new Student(501,"Ashutosh");

        String str1 = s1.toString();
        String str2 = s2.toString();

        System.out.println("Object Class equals method: "+s1.equals(s2));

        System.out.println("String Class equals method: "+str1.equals(str2));   /// It returns true only if we override the toString() method
    }
}

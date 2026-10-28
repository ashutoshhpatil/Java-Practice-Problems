package ObjectClass;

public class hashCodeDemo {
    String empName;
    int empId;

    hashCodeDemo(String name,int empId){
        this.empName = name;
        this.empId = empId;
    }

    public int hashCode(){
        return empId;
    }

    public static void main(String[] args) {
        hashCodeDemo obj1 = new hashCodeDemo("Arun ",45698);
        hashCodeDemo obj2 = new hashCodeDemo("Prakash ",45699);
        hashCodeDemo obj3 = new hashCodeDemo("Ved ",45700);

        System.out.println(obj1.hashCode());


        System.out.println(obj1);   ///ObjectClass.hashCodeDemo@b282
        System.out.println(obj2);  ///ObjectClass.hashCodeDemo@b283
        System.out.println(obj3);  ///ObjectClass.hashCodeDemo@b284

    }
}

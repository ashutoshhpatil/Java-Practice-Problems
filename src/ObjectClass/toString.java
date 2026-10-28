package ObjectClass;

public class toString {
    String name;
    int rollNo;

    toString(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public String toString(){
        return "name: "+name+ "------"+"Roll No: "+rollNo;
    }

    public static void main(String[] args) {
        toString obj = new toString("Durga",101);
        System.out.println(obj);
    }
}

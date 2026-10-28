package Constructor;

class CopyDemo{
    String name;
    int rollNo;

    CopyDemo(String n, int r){
        name =n;
        rollNo =r;
    }

    CopyDemo(CopyDemo n){
          name = n.name;
          rollNo = n.rollNo;
    }

    void dispInfo(){
        System.out.println("Name : "+name);
        System.out.println("Roll No: "+rollNo);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        CopyDemo obj = new CopyDemo("Ashutosh",101);
        CopyDemo obj2 = new CopyDemo(obj);

        obj.dispInfo();
        obj2.dispInfo();
    }

}

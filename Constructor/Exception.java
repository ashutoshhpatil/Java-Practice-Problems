package Constructor;

import java.io.IOException;

class Parent{
    Parent()throws IOException{
        System.out.println("Parents Exception");
    }
}

class Child extends Parent{

    // the child class must throw the same exception or parent exception ...we can't use try-catch here
    Child ()throws IOException{
        System.out.println("Child's Exception");
    }
}

public class Exception {
    public static void main(String[] args) {


    }
}

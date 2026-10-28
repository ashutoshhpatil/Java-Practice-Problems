package ObjectClass;

class Student1 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}

class Main1 {
    public static void main(String[] args) {
        Student1 s = new Student1();

        s = null;

        System.gc();
    }
}

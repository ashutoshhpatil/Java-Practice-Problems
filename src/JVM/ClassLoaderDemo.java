package JVM;

class Test {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(Test.class.getClassLoader() );

    }
}

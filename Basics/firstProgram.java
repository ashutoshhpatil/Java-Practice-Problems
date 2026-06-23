public class ClassObjectsBasics {
    String name = "Ashutosh";
    int age = 22;
    String add = "Udgir dist-Latur 413517";

    void dispInfo(){
        System.out.println("The name of the student is " +name + " age is " +age+ " and the address of the student is " +add);
    }

        public static void main(String[] args) {
            ClassObjectsBasics cb = new ClassObjectsBasics();
            cb.dispInfo();
        }
    }

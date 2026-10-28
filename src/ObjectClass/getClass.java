package ObjectClass;

class ArmyOfficial {
    String name;
    int armyId;
}

class Main{
    public static void main(String[] args) {
        ArmyOfficial ao = new ArmyOfficial();

        System.out.println(ao.getClass());        /// returns an object
        System.out.println(ao.getClass().getName());     /// returns a string with class name and package
        System.out.println(ao.getClass().getSimpleName());    /// returns a String but only class name
    }
}



class Animal{

}

class Dog extends Animal{
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a.getClass());      ///class ObjectClass.Dog
        System.out.println(a.getClass().getSimpleName());   ///Dog
    }
}

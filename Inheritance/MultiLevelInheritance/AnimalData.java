package Inheritance.Assignment1.MultilevelInheritance;

class Animal{
    String animalName = "Dog";
    int age = 2;

    void dispAnimal(){
        System.out.println("Animal: "+animalName);
        System.out.println("Age: "+age);
    }
}

class Pet extends Animal{
    String ownerName = "Ashutosh";
    Long contactNum = 9878987898L;

    void dispPet(){
        super.dispAnimal();
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Contact Number: "+contactNum);
    }
}

class Dog extends Pet{
    String breed = "Labrador";
    boolean vaccinationStatus = true;

    void getData(){
        if(vaccinationStatus){
            System.out.println("Vaccination is Done");
        }else {
            System.out.println("Vaccination is Remaining");
        }
    }

    void dispDog(){
        super.dispPet();
        System.out.println("Breed: "+breed);
    }
}

public class AnimalData {
    public static void main(String[] args) {
        Dog obj  = new Dog();
        obj.getData();
        obj.dispDog();

    }
}

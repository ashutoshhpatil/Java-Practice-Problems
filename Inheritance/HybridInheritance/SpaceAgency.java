package Inheritance.HybridInheritance;

class Space {
    String agencyName = "ISRO";
    String country = "INDIA";
    String directorName = "Dr. Somnath ";

    void disp() {
        System.out.println("Agency Name: " + agencyName);
        System.out.println("Country: " + country);
        System.out.println("Director Name: " + directorName);
    }
}

class Mission extends Space{
    String missionName = "Chandrayaan";
    int launchYear = 2013;
    int missionDays= 14;
    int totalBudget;
}

class MoonMission extends Mission{
    int noofAstronauts=4;

    int costPerAstronaut= 2500000;


    void dispMoon(){
        totalBudget  = noofAstronauts*costPerAstronaut;
super.disp();
        System.out.println("Mission Name: "+missionName);
        System.out.println("Launch Year: "+launchYear);
        System.out.println("Mission Days: "+missionDays);
        System.out.println("No of Astronauts: "+noofAstronauts);

        System.out.println("Cost Per Astronaut: "+costPerAstronaut);
        System.out.println("Total Budget: "+totalBudget);
    }
}

class MarsMission extends Mission{
    int fuelCost = 85000000;
    int researchCost = 42000000;

    void dispMars(){
        totalBudget  =  fuelCost*researchCost;
super.disp();
        System.out.println("Mission Name: "+missionName);
        System.out.println("Launch Year: "+launchYear);
        System.out.println("Mission Days: "+missionDays);
        System.out.println("Fuel Cost: "+fuelCost);
        System.out.println("Research Equipment Cost: "+researchCost);
        System.out.println("Total Budget: "+totalBudget);
    }

}
public class SpaceAgency {
    public static void main(String[] args) {
        MoonMission mm1 =new MoonMission();
        mm1.dispMoon();

        MarsMission mm2 =new MarsMission();
        mm2.dispMars();

    }
}

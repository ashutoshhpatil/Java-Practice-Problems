package Inheritance.HybridInheritance;

class SmartCity{
    String cityName = "Pune";
    String mayorName = "Manjusha Nagpure";

    void disp(){
        System.out.println("City Name: "+cityName);
        System.out.println("Mayor Name: "+mayorName);
    }
}

class Service extends SmartCity{
    int serviceID;
    String serviceName;
    int monthlyCost;
    int expenditure;

    void dispService(){
        System.out.println("Service ID: "+serviceID);
        System.out.println("Service Name: "+serviceName);
        System.out.println("Monthly Cost: "+monthlyCost);
    }
}

class Transport extends Service{
    int noOfBuses = 550;
    int routeDistance = 1312;
    int fuelCost = 2200000;

    void dispTrans(){
        serviceID = 12456;
        serviceName = "Pune Transport Service";
        monthlyCost = 5045250;

        expenditure = monthlyCost+fuelCost;
       super.disp();
        super.dispService();
        System.out.println("No of Buses: "+noOfBuses);
        System.out.println("Total Route Distance "+routeDistance+ " kms");
        System.out.println("Fuel Cost/Month: "+fuelCost+ "(In Lakhs)");
        System.out.println("Total Expenditure: "+expenditure+ " (In Lakhs)");
    }
}

class HealthCare extends Service{
    int hospitals = 1250;
    int emergencyUnits = 250;
    int medicineExpense = 1856480;

    void dispHealth(){
        serviceID = 78954;
        serviceName = "Pune HealthCare  Service";
        monthlyCost = 8545500;

        expenditure = monthlyCost+medicineExpense;
        super.disp();
        super.dispService();
        System.out.println("No of Hospitals: "+hospitals);
        System.out.println("Emergency Units: "+emergencyUnits);
        System.out.println("Medicine Expenses: "+medicineExpense+ " (In Lakhs)");
        System.out.println("Total Expenditure: "+expenditure+ " (In Crores)");
    }
}

public class CityManagement {
    public static void main(String[] args) {
        Transport tt= new Transport();
        tt.dispTrans();

        System.out.println("================");

        HealthCare hc =new HealthCare();
        hc.dispHealth();

    }
}

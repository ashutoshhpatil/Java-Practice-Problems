package Inheritance.HybridInheritance;

class InsuranceCompany{
    String cmpName = "STAR INSURANCE";
    String branch = "PUNE";
    float gstPercentage = 0.18f;
    float premiumAmount;
    int basePremium;
    float totalAmount;

    void dispIC(){
        System.out.println("Company Name: "+cmpName);
        System.out.println("Location: "+branch);
    }
}

class Policy extends InsuranceCompany{
    int policyNumber = 4556;
    String customerName = "Ashutosh";
    float gstAmount;
    int policyDuration = 10;

    void dispCustomer(){
        basePremium = 85000;
        premiumAmount = basePremium*policyDuration;

        super.dispIC();
        System.out.println("Customer Name: "+customerName);
        System.out.println("Policy Number: "+policyNumber);
    }
}

class VehiclePolicy extends Policy{
    String vehicleType  ="Car";
    int vehicleAge = 12;
    float vehicleValue = 1200000;
    int accidentClaims =0;
    float extraPremium;
    float discount;

    void calcPremium(){

        basePremium = 80000;
        if(vehicleAge>10){
            extraPremium = (float) 0.12*basePremium;
        }else {
            extraPremium = (float) 0.05*basePremium;
        }

        if(accidentClaims == 0){
            discount = basePremium*0.20f;
        }else if(accidentClaims == 1){
            discount = basePremium*0.10f;
        }else {
            discount = 0;
        }

        gstAmount = 0.18f*basePremium;

        totalAmount = basePremium+extraPremium-discount+gstAmount;
    }

    void dispVehicle(){
        super.dispIC();
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Vehicle Age: "+vehicleAge);
        System.out.println("Vehicle Value: "+vehicleValue);

        System.out.println("Premium: "+basePremium);
        System.out.println("Extra Premium: "+extraPremium);
        System.out.println("Discount: "+discount);
        System.out.println("GST: "+gstAmount);
        System.out.println("Total Amount: "+totalAmount);

    }

}

public class InsuranceManagement {
    public static void main(String[] args) {
        VehiclePolicy vp = new VehiclePolicy();
        vp.calcPremium();
        vp.dispVehicle();
    }
}

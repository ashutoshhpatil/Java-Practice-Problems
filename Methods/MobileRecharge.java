package Methods.Assignment1;

public class MobileRecharge {
    String customerName;
    String mobileNumber;
    String rechargePlan;
    int planAmount;
    double finalAmount;
    double GSTAmount;

    void setCustomerDetails(String customerName,String mobileNumber){
        this.customerName=customerName;
        this.mobileNumber=mobileNumber;
    }

    int getPlanAmount(String rechargePlan){
        this.rechargePlan=rechargePlan;
        if(rechargePlan.equalsIgnoreCase("Basic")){
            planAmount = 299;
        }
        else if(rechargePlan.equalsIgnoreCase("Standard")){
            planAmount = 399;
        }
        else if(rechargePlan.equalsIgnoreCase("Premium")){
            planAmount = 599;
        }
        else if(rechargePlan.equalsIgnoreCase("Unlimited")){
            planAmount = 999;
        }else {
            System.out.println("Plan Unavailable");
        }
        return planAmount;
    }

    double calcFinalAmount(double gstRate){
        GSTAmount = (planAmount*gstRate)/100;
        finalAmount = GSTAmount+planAmount;
        return finalAmount;
    }

    void dispDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("Recharge Plan: "+rechargePlan);
        System.out.println("Plan Amount: "+planAmount);
    }

    public static void main(String[] args) {
        MobileRecharge mobileRecharge = new MobileRecharge();
        mobileRecharge.setCustomerDetails("Ashutosh","932246xxxx");
        mobileRecharge.getPlanAmount("Unlimited");
        mobileRecharge.calcFinalAmount(5.6);
        mobileRecharge.dispDetails();
        System.out.println("Final Amount: "+mobileRecharge.finalAmount);
    }
}

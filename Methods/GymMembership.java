package Methods.Assignment1;

public class GymMembership {
    String gymName;
    String memberName;
    String memberID;
    int membershipFee;
    int membershipMonths;

    void getDetails(){
        System.out.println("Gym Name: "+gymName);
    }

    void setMemberDetails(String memberName,String memberID, int membershipMonths){
        this.membershipMonths = membershipMonths;
        System.out.println("Member Name: "+memberName);
        System.out.println("Member ID "+memberID);
        System.out.println("Membership Months: "+membershipMonths);
    }

    int getMembershipFee(){
        membershipFee = membershipFee*membershipMonths;
        System.out.println("Membership Fee "+membershipFee);
        return membershipFee;
    }

    int calculateDiscount(float discount){
        this.membershipFee = membershipFee;
        this.membershipMonths = membershipMonths;
        if(membershipMonths>5){
            membershipFee = membershipFee-(int)(membershipFee*discount);
            System.out.println("Discount "+(membershipFee*discount));
        }
       return membershipFee;
    }

    public static void main(String[] args) {
        GymMembership gymMembership = new GymMembership();
        gymMembership.gymName = "AP Fitness";
        gymMembership.membershipFee = 1000;
        gymMembership.getDetails();
        gymMembership.setMemberDetails("Raghav","IR5648",6);
        gymMembership.getMembershipFee();
        int finalFee = gymMembership.calculateDiscount(0.30f);
        System.out.println("Total Fee: "+finalFee);
    }

}

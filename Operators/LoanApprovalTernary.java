package Operators;

public class LoanApprovalTernary {
    int creditScore;
    double annualIncome;

    void getInfo(){
        String loanStatus = (creditScore>850)?("Approved")
            :(creditScore>=650 && annualIncome >=500000)?("Approved with Conditions")
            :(creditScore>=550 && annualIncome >=300000)?("Under Review")
            :("Rejected");

        System.out.println("Loan Status: "+loanStatus);
    }

    public static void main(String[] args) {
        LoanApprovalTernary loan = new LoanApprovalTernary();
        loan.creditScore = 950;
        System.out.println("Credit Score: "+loan.creditScore);
        loan.annualIncome = 450000;
        System.out.println("Annaul Income: "+loan.annualIncome);
        loan.getInfo();
    }
}

package Interface;

import java.util.Scanner;

interface Voter{
    Scanner sc= new Scanner(System.in);

    void verifyVoter();

    void castVote();
}

interface Result{
    void countVotes();

    void declareWinner();
}

class ElectionPortal implements Voter,Result{

    int voterID;
    String candidateName;
    int rahul;
    int ashutosh;
    int meenal;
    int votes;
    String winner;

    void dispCandidates(){
        System.out.println("1.Rahul");
        System.out.println("2. Ashutosh");
        System.out.println("3. Meenal");
    }

    @Override
    public void verifyVoter() {
        System.out.println("Enter voter Id");
        voterID = sc.nextInt();

        if(voterID == 1005){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Invalid");
            System.exit(0);
        }

        dispCandidates();
    }

    @Override
    public void castVote() {
        for(int i=0;i<5;i++) {
            System.out.println("Cast Your Vote:" );
            votes = sc.nextInt();

            if (votes == 1) {
                candidateName = "Rahul";
                rahul++;
            }
            else if (votes == 2) {
                candidateName = "Ashutosh";
                ashutosh++;
            }
            else if (votes == 3) {
                candidateName = "Meenal";
                meenal++;
            }
            else {
                System.out.println("Invalid Vote");
            }
            }
        }


    @Override
    public void countVotes() {
        if(rahul>ashutosh && rahul>meenal)
            winner = "Rahul";
        else if (ashutosh>rahul && ashutosh>meenal)
            winner = "Ashutosh";
        else
            winner = "Meenal";
    }

    public void declareWinner() {

        System.out.println("Winner is: "+winner);
    }

}

public class AdvancedDigitalVoting {
    public static void main(String[] args) {
        ElectionPortal obj = new ElectionPortal();
        obj.verifyVoter();
        obj.castVote();
        obj.countVotes();
        obj.declareWinner();
    }
}

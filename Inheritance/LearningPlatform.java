package Inheritance;

class User{
    static int totalUsers;
    String username;
    int userID;

    void register(){
        totalUsers++;
        System.out.println(username + " registered with ID " + userID);
    }

    void dispProfile(){
        System.out.println("User: "+username);
    }
}

class Learner extends User{
    int courseEnrolled;
    int totalScore;

    void enrollCourse(){
        courseEnrolled++;
        System.out.println(username + " enrolled. Total courses: " + courseEnrolled);
    }

    void dispProfile(){
        System.out.println("Learner: " + username + ", Courses: " + courseEnrolled);
    }
}

class Instructor extends User{
    int coursesTaught;
    double rating;

    void createCourse(){
        coursesTaught++;
        System.out.println(username + " created a course. Total courses taught: " + coursesTaught);
    }

    void dispProfile(){
        System.out.println("Instructor: " + username + ", Rating: " + rating);
    }
}

interface Certifiable{
    boolean checkCertificationEligibility();
}

interface ranked{
    String getRankTitle();
}

class PremiumLearner extends Learner implements Certifiable{
    boolean subscriptionStatus;

    void takeQuiz(int score){
        totalScore +=score;
        System.out.println(username + " scored " + score + " in quiz. Total score: " + totalScore);
    }

    @Override
    public boolean checkCertificationEligibility() {
        if(subscriptionStatus == true && courseEnrolled>=3 && totalScore >=200){
            return true;
        }else {
            return false;
        }
    }

    void dispProfile(){
        super.dispProfile();
        System.out.println("Premium status: " + subscriptionStatus);
    }
}

class SeniorInstructor extends Instructor implements Certifiable,ranked{
    int experience;

    @Override
    public boolean checkCertificationEligibility() {
         if(coursesTaught>=5 && rating>=4.0){
             return true;
         }else {
             return false;
         }
    }

    @Override
    public String getRankTitle() {
         if(experience>=10){
             return "Master Instructor";
         }else if(experience>=5){
             return "Senior Instructor";
         }else {
             return "Junior Inspector";
         }
    }
}

    public class LearningPlatform {
        static void checkAllCertifications(User[] users) {
            for (User u : users) {
                u.dispProfile();

                if (u instanceof Certifiable) {
                    Certifiable c = (Certifiable) u;
                    System.out.println("Certification eligible: " + c.checkCertificationEligibility());
                }

                if (u instanceof ranked) {
                    ranked r = (ranked) u;
                    System.out.println("Rank: " + r.getRankTitle());
                }
            }
        }

        public static void main(String[] args) {
            PremiumLearner riya = new PremiumLearner();
            riya.username = "Riya";
            riya.userID = 1;
            riya.courseEnrolled = 4;
            riya.totalScore = 250;
            riya.subscriptionStatus = true;


            SeniorInstructor mrRao = new SeniorInstructor();
            mrRao.username = "Mr. Rao";
            mrRao.userID = 2;
            mrRao.coursesTaught = 6;
            mrRao.rating = 4.5;
            mrRao.experience = 8;


            Learner kabir = new Learner();
            kabir.username = "Kabir";
            kabir.userID = 3;
            kabir.courseEnrolled = 1;


            riya.register();

            mrRao.register();

            kabir.register();


            User[] allUsers = new User[3];
            allUsers[0] = riya;
            allUsers[1] = mrRao;
            allUsers[2] = kabir;
            checkAllCertifications(allUsers);
            System.out.println("Total registered users: " + User.totalUsers);
        }
    }


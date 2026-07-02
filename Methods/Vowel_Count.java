package Methods;

public class Vowel_Count {
    String str = "Hello From TekupSkills Training";
    int count =0;

    void validcount(){
        for(int i=0;i<str.length();i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}

class X{
    public static void main(String[] args) {
        Vowel_Count vc = new Vowel_Count();
        vc.validcount();
    }
}

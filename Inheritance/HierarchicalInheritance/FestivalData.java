package Inheritance;

class Festival{
    String festivalName;
    String month;
    void disp(){
        System.out.println("Indian Festival");
    }
}

class Diwali extends Festival{

    void dispDiwali(){
        festivalName = "Diwali";
        month = "November";
        super.disp();
        System.out.println("Festival Name: "+festivalName);
        System.out.println("Festival Month: "+month);
    }
}

class Holi extends Festival{
    void dispHoli(){
        festivalName = " Holi";
        month = "March";
        super.disp();
        System.out.println("Festival Name: "+festivalName);
        System.out.println("Festival Month: "+month);
    }
}

public class FestivalData {
    public static void main(String[] args) {
        Diwali diwali =new Diwali();
        diwali.dispDiwali();

        Holi holi = new Holi();
        holi.dispHoli();
    }
}

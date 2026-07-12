package Constructor;

class Company{
    private String cmpName;
    private String cmpLocation;

    Company(){
        super();
        cmpName = "Google";
        cmpLocation = "San Francisco";
    }

    //getter methods
    public String getCmpName(){
        return  cmpName;
    }

    public String getCmpLocation(){
        return cmpLocation;
    }

    //setter methods
    public void setInfo(String cmpName,String cmpLocation){
        if(cmpName == null || cmpName.isEmpty()){
            System.out.println("Security Alert: Company name cannot be blank.");
            return;
        }

        if(cmpLocation == null || cmpLocation.isEmpty()){
            System.out.println("Security Alert: Company location cannot be blank.");
            return;
        }

        this.cmpName=cmpName;
        this.cmpLocation=cmpLocation;
    }

    void dispInfo(){
        System.out.println("Company Name: "+cmpName);
        System.out.println("Company Location: "+cmpLocation);
    }
}

public class NoArgumentConstructor {
    public static void main(String[] args) {
        Company obj = new Company();
        System.out.println("Company Info 1:");
        obj.dispInfo();

        obj.setInfo("Microsoft","");

//        System.out.println("Company Details 2: ");
//        obj.dispInfo();



    }
}

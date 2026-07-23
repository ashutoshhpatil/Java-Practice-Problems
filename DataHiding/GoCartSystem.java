package DataHiding;

class GoCart{
    private String driverName;
    private int speed;
    private int fuel;

        GoCart(String name,int startingFuel){
            this.driverName =name;
            this.speed = 0;
            if(startingFuel>100){
                this.fuel = 100;
            }else if(startingFuel<0){
                this.fuel =0;
            }
        }

        void drive(){
            if(fuel>=10){
                fuel -= 10;
                speed += 20;

                if (speed>80){
                    speed = 80;
                }
            }  else {
                System.out.println("Not enough fuel!");
            }
        }

        void brake(){
            speed -= 20;
            if(speed<0){
                speed = 0;
            }
        }

        void addFuel(int amount){
            fuel += amount;
            if(fuel>100){
                fuel = 100;
            }
        }

        void dispInfo(){
            System.out.println("Driver Name: "+driverName);
            System.out.println("Fuel:  "+fuel);
            System.out.println("Speed: "+speed);
        }
}


public class GoCartSystem {
    public static void main(String[] args) {
        System.out.println("--- Starting Engine ---");
        GoCart kart = new GoCart("Mario", 150);
        kart.dispInfo(); // Expect: Speed 0, Fuel 100

        // 2. Test Driving & Max Speed Limit (80)
        System.out.println("--- Hitting the Gas ---");
        kart.drive(); // Speed 20, Fuel 90
        kart.drive(); // Speed 40, Fuel 80
        kart.drive(); // Speed 60, Fuel 70
        kart.drive(); // Speed 80, Fuel 60
        kart.drive(); // Attempting to go past 80...

        // FIX: Changed dashboard() to dispInfo()
        kart.dispInfo(); // Expect: Speed 80, Fuel 50

        // 3. Test Braking & Min Speed Limit (0)
        System.out.println("--- Slamming the Brakes ---");
        kart.brake(); // Speed 60
        kart.brake(); // Speed 40
        kart.brake(); // Speed 20
        kart.brake(); // Speed 0
        kart.brake(); // Attempting negative speed...
        kart.dispInfo(); // Expect: Speed 0, Fuel 50

        // 4. Test Fuel Cap limit (100)
        System.out.println("--- Refueling ---");
        kart.addFuel(200);
        kart.dispInfo(); // Expect: Fuel 100

        // 5. Test Low Fuel Condition
        System.out.println("--- Empty Tank Test ---");
        GoCart brokenKart = new GoCart("Toad", 5); // Only 5 fuel
        brokenKart.drive();
    }
}

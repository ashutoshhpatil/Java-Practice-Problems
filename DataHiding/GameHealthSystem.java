package DataHiding;

class GamePlayer{
    private String playerName;
    private int health;
    private int armor;

    GamePlayer(String n,int h, int a) {
        this.playerName = n;
        if (h < 0 || h > 100) {
            this.health = 100;
        } else {
            this.health = h;
        }

        if (a > 50 || a < 0) {
            this.armor = 0;
        } else {
            this.armor = a;
        }
    }

    public void takeDamage(int damageAmount) {
        // 1. Check if the damage is a valid positive number
        if (damageAmount > 0) {

            // 2. Check if the armor can absorb the whole hit
            if (damageAmount <= armor) {
                armor -= damageAmount; // Armor takes all the damage
            }
            // 3. If the damage is more than the armor
            else {
                int remainingDamage = damageAmount - armor; // Calculate what gets past the armor
                armor = 0; // Armor is destroyed
                health -= remainingDamage; // Health takes the rest of the damage
            }

            // 4. Ensure health doesn't drop below 0
            if (health <= 0) {
                health = 0;
                System.out.println("Player has been defeated!");
            }
        } else {
            System.out.println("Damage amount must be greater than 0.");
        }
    }

    public void heal(int healAmount) {
        // 1. Check if the heal amount is valid
        if (healAmount > 0) {
            health += healAmount; // Add the health

            // 2. Cap the health at 100
            if (health > 100) {
                health = 100;
            }
            System.out.println(playerName + " healed for " + healAmount + ". Current Health: " + health);
        } else {
            System.out.println("Heal amount must be greater than 0.");
        }
    }

    public void displayStatus() {
        // Just print out the current state of the variables
        System.out.println("--- Player Status ---");
        System.out.println("Name: " + playerName);
        System.out.println("Health: " + health + "/100");
        System.out.println("Armor: " + armor + "/50");
        System.out.println("---------------------");
    }
}

public class GameHealthSystem {
    public static void main(String[] args) {
        GamePlayer p1 = new GamePlayer("Hero", 100, 20);
        p1.takeDamage(30);
        p1.heal(15);
        p1.takeDamage(150);
        p1.displayStatus();
    }
}

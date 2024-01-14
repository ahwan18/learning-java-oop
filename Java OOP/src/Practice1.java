// player
class Player{
    String name;
    double healthPoint;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double healthPoint){
        this.name = name;
        this.healthPoint = healthPoint;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName \t: " + this.name);
        System.out.println("Health \t: " + this.healthPoint + " HP");
        this.weapon.display();
        this.armor.display();
    }
}


// weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon \t: " + this.name + " , Power : " + this.attackPower);
    }
}

// armor
class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor \t: " + this.name + " , Defence : " + this.defencePower);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        
        // making object player
        Player player1 = new Player("Ahwan", 100);
        Player player2 = new Player("Nimay", 100);

        // making weapon object
        Weapon sword = new Weapon("Sword", 15);
        Weapon Scissors = new Weapon("Scissors", 10);

        // making armor object
        Armor ironArmor = new Armor("Iron Armor", 10);
        Armor woodArmor = new Armor("Wood Armor", 8);

        // equip Weapon and Armor
        player1.equipWeapon(sword);
        player1.equipArmor(ironArmor);
        player1.display();

        player2.equipWeapon(Scissors);
        player2.equipArmor(woodArmor);
        player2.display();
    }
}

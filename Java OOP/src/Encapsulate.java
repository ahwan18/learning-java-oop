class Client{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Defence armor;
    private Attack weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Client(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display(){
        System.out.println("\nPlayer\t: " + this.name);
        System.out.println("Level\t: " + this.level);
        System.out.println("Max HP\t: " + this.maxHealth());
        System.out.println("Power\t: " + this.getAttackPower());
    }

    public void levelUp(){
        this.level++;
    }

    public void setArmor(Defence armor){
        this.armor = armor;
    }

    public void setWeapon(Attack weapon){
        this.weapon = weapon;
    }
    
    public int maxHealth(){
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddedHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Defence{
    private String name;
    private int strength;
    private int health;

    public Defence(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddedHealth(){
        return this.strength*10 + this.health;
    }

    
}

class Attack{
    private String name;
    private int attack;
    
    public Attack(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
    
    public int getAttack(){
        return this.attack;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        
        Client player1 = new Client("Ahwan");
        Defence armor1 = new Defence("Iron Armor", 10,200);
        Attack weapon1 = new Attack("Sword", 20);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        
        player1.display();
        
        Client player2 = new Client("Nimay");
        Defence armor2 = new Defence("Party Dress", 5,150);
        Attack weapon2 = new Attack("Scissor", 50);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);
        player2.display();

    }
}

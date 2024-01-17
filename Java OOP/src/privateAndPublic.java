class Hero{
    String name; // default, write and read on outside class
    public int exp; // public, write and read on outside class
    private int health; // private, write and read only in the class

    Hero(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier acces
    void display(){
        plusExp();
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp.\t: " + this.exp);
        System.out.println("HP\t: " + this.health); // read in the class
    }

    // public
    public void changeName(String newName){
        this.name = newName;
    }

    // private
    private void plusExp(){
        this.exp += 100;
    }
}

public class privateAndPublic {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ahwan", 50, 100);

        // default
        System.out.println(hero1.name); // reading data
        hero1.name = "Fish"; // writing data
        System.out.println(hero1.name); // reading data
        
        // public
        System.out.println(hero1.exp); // reading data
        hero1.exp = 100; // writing data
        System.out.println(hero1.exp); // reading data
        
        // private
        // System.out.println(hero1.health); // reading data
        // hero1.health = 100; // writing data
        // System.out.println(hero1.health); // reading data

        // method
        hero1.display();

        // public
        hero1.changeName("Mr. Fish");
        hero1.display();

        // private, not visible
        // hero1.plusExp();
    }
    
}

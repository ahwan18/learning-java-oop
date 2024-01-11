class Chara{
    // Data Member
    String name;
    String IDnumber;


    // constructor
    Chara(String name, String IDnumber){
        this.name = name;
        this.IDnumber = IDnumber;
    }

    // method without return and without parameter
    void showName() {
        System.out.println("Nama : " + this.name);
        System.out.println("ID Number : " + IDnumber);
    }

    // method without return and with parameter
    void setName(String name){
        this.name = name;
    }

    // method with return but without parameter
    String getName(){
        return this.name;
    }

    String getID(){
        return this.IDnumber;
    }

    // method with return and with parameter
    String greet(String greeting){
        return greeting + " too, my name is " + this.name;
    }
}

class Boss{
    String name;

    Boss(String name){
        this.name = name;
    }
}

public class Method {
    public static void main(String[] args) {
        Chara chara1 = new Chara("Ahwan", "123");
        // method
        chara1.showName();
        chara1.setName("Nimay");
        chara1.showName();

        System.out.println(chara1.getName());
        System.out.println(chara1.getID());

        String data = chara1.greet("Cool");
        System.out.println(data);

        Boss boss1 = new Boss("Great Nimay");
    }
}

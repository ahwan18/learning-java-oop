// class without constuctor
class Plain {
    String dataString;
    int dataInteger;
}

// class with constructor
class charInformation{
    String name;
    String IDnumber;
    String abllity;

    // constructor
    // charInformation() {
    //     System.out.println("This is constructor");
    // }

    // constructor with parameter
    charInformation(String inputName, String inputIDnumber, String inputAblity) {
        name = inputName;
        IDnumber = inputIDnumber;
        abllity = inputAblity;

        System.out.println(name);
        System.out.println(IDnumber);
        System.out.println(abllity);
    }
}

public class Constuctor {
    public static void main(String[] args) throws Exception{

        charInformation identity1 = new charInformation("Ahwan","123","Smart");
        charInformation identity2 = new charInformation("Nimay","321","beautiful");
        // System.out.println(identity1.name);
        // System.out.println(identity2.name);
    
        // Plain objectPlain = new Plain();
        // objectPlain.dataInteger = 10;
        // objectPlain.dataString = "Fish";

        // System.out.println(objectPlain.dataInteger);
        // System.out.println(objectPlain.dataString);
    }
}

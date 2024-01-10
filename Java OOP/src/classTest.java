

// making class as template
class Identity{
    String name;
    String IDnumber;
    String abllity;
    double weight;
    int height;
}


public class classTest {
    public static void main(String[] args) throws Exception {
        
        // instantiate / making object
        Identity identity1 = new Identity();
        identity1.name = "Ahwan";
        identity1.IDnumber = "99999";
        identity1.abllity = "Smart";
        identity1.weight = 45.5;
        identity1.height = 162;

        System.out.println(identity1.name);
        System.out.println(identity1.IDnumber);
        System.out.println(identity1.abllity);
        System.out.println(identity1.weight);
        System.out.println(identity1.height);

        Identity identity2 = new Identity();
        identity2.name = "Nimay";
        identity2.IDnumber = "99990";
        identity2.abllity = "Beautiful";
        identity2.weight = 45;
        identity2.height = 155;

        System.out.println(identity2.name);
        System.out.println(identity2.IDnumber);
        System.out.println(identity2.abllity);
        System.out.println(identity2.weight);
        System.out.println(identity2.height);
    }
}

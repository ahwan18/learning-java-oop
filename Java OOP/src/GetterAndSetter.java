class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 3;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // GETTER
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // SETTER
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Round{
    private double diameter;

    Round(double diameter){
        this.diameter = diameter;
    }

    // SETTER
    public void setRadius(double radius){
        this.diameter = radius*2;
    }

    // GETTER
    public double getRadius(){
        return this.diameter/2;
    }

    // GETTER
    public double getArea(){
        return 3.14*diameter*diameter/4;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        
        Data object = new Data();
        // public

        // read and write using public
        object.intPublic = 10; // write
        System.out.println("Public\t: " + object.intPublic); // read

        // read only, we can use GETTER
        int number1 = object.getIntPrivate();
        System.out.println("Getter\t: " + number1);

        // write only (We only can write)
        object.setDoublePrivate(9);
        object.display();

        // merging read and write with setter and getter
        Round object2 = new Round(5);
        System.out.println("Radius : " + object2.getRadius());
        object2.setRadius(8);
        System.out.println("Radius : " + object2.getRadius());
        System.out.println("Area : " + object2.getArea());
    }
}

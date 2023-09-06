class Base1{
    String color;
    void show(){
        color = "Red";
        System.out.println("Base");
    }
}
class derived1 extends Base1{
    String color;
    void show(){
        super.show();
        color = "Blue";
        System.out.println("derived");
        System.out.println("color = "+color);
        System.out.println("color = "+super.color);
    }
}
public class A24_super {
    public static void main(String[] args) {
        derived1 d2 = new derived1();
        d2.show();
    }
}
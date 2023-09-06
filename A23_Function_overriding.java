class Base{
    void show(){
        System.out.println("Base");
    }
}
class derived extends Base{
    void show(){
        System.out.println("derived");
    }
}
public class A23_Function_overriding {
    public static void main(String[] args) {
        Base B1 = new Base();
        Base B2 = new derived();
        B1.show();
        B2.show();
    }
}

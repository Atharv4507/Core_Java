/**
 * A19_Inner_class
 */
class outer{
    class ineer{
        void show(){
            System.out.println("show");
        }
    }
}
public class A19_Inner_class {

    public static void main(String[] args) {
        outer ot = new outer();
        outer.ineer in = ot.new ineer();
        in.show();
    }
}
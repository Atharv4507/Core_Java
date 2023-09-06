abstract class person{
    abstract void display();
}
public class A18_Anonymous_class {

    public static void main(String[] args) {
        person p = new person() {
            void display(){
                System.out.println("show");
            }
            
        };
        p.display();
    } 
}
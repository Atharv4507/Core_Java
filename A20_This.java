public class A20_This {
    int a;
    int b;
    A20_This(int a,int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        A20_This a5 = new A20_This(10, 10);
        a5.display();
    }
}
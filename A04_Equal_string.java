import java.util.Scanner;

public class A04_Equal_string {
    public static void main(String[] args) {
        String s1,s2,q = "quit";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'quit' to quit it");
        do{
            System.out.print("Enter string s1: ");
            s1 = sc.nextLine();
            System.out.print("Enter string s2: ");
            s2 = sc.nextLine();
            if (s1.equals(s2)) {
                System.out.println("strings are equals");
            } else {
                System.out.println("strings are not equals");
            }
            System.out.println(" ");
        }while(!s1.equals(q));
        System.out.println(" ");
        System.out.println(sc);
    }
}

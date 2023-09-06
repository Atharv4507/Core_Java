import java.util.Scanner;

class youngageException extends RuntimeException{
    youngageException(String msg){
        super(msg);
    }
}

public class A29_voties {
    public static void main(String[] args) throws youngageException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age<18) {
            System.out.println("");
            throw new youngageException("Not eligible for voting");
        } else {
            System.out.println("You are Eligible");
        }
    }
}
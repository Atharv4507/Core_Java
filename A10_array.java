import java.util.Scanner;

public class A10_array {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Entering elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = "+arr[i]);
        }
        System.out.println(" ");
        System.out.println(sc);
    }
}
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("sum of two numbers is: " + c);
        sc.close();
    }
}

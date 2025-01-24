package PW_IF_ELSE;
import java.util.Scanner;
public class div_by_3_and_5 {
    public static void main(String[] args)
    {   // Tell whether the number is divisible by both 2 and 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
//        System.out.println("Enter another number");
//        int num1 = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0)
        {
            System.out.println(" The number is divisible by both 2 and 3");
        }
        else
        {
            System.out.println("The number is not divisible by both");
        }
    }
}

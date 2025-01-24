package PW_IF_ELSE;
import java.util.Scanner;
public class divisible_by_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x  = sc.nextInt();
        if (x%5==0)
        {
            System.out.println("The number "+x+" is divisible by 5");
        }
        else
        {
            System.out.println("The number "+x+" is not divisible by 5");
        }
    }
}

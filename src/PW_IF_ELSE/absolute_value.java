package PW_IF_ELSE;
import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if (x>0)
        {
            System.out.println("The given number is absolute number");
        }
        else
        {
            x= x * (-1);
            System.out.println("The absolute value of the number is "+x);
        }
    }
}

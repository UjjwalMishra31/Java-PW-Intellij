package PW_IF_ELSE;
import java.util.*;
public class EVEN_ODD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if(x%2==0)
        {
            System.out.println("The Number "+x+" is even.");
        }
        else
        {
            System.out.println("The number "+x+" is odd.");
        }
    }
}

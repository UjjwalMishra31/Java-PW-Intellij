package PW_IF_ELSE;
import java.util.*;
public class CPrice_SPrice {
    public static void main(String[] args)
    {       // Check wether selling price is greater than cost price
            // If yes, then tell the profit amount or else tell loss amount
        Scanner sc = new Scanner(System.in);
        int cp,sp,profit,loss;
        System.out.println("Enter the cost price of the product");
        cp = sc.nextInt();
        System.out.println("Enter the selling price of the product");
        sp = sc.nextInt();
        if (cp > sp)
        {
            loss = cp - sp;
            System.out.println("The loss on the product is "+loss);
        }
        else
        {
            profit = sp - cp;
            System.out.println("The profit on the product is "+profit);
        }
    }
}

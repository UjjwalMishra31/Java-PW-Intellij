package PW_IF_ELSE;

import java.util.Scanner;

public class youngest_age
{
    public static void main(String[] args)
    {   // given the age of three person , find the youngest one of them
        Scanner sc = new Scanner(System.in);
        int Ram,Shyam,Ajay;
        System.out.println("Enter Ram's age : ");
        Ram = sc.nextInt();
        System.out.println("Enter Shyam's age : ");
        Shyam = sc.nextInt();
        System.out.println("Enter Ajay's age : ");
        Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay)
        {
            System.out.println("Ram is younger");
        } else if (Ajay < Ram && Ajay < Shyam)
        {
            System.out.println("Ajay is younger");
        }else
        {
            System.out.println("Shyam is younger");
        }

    }
}

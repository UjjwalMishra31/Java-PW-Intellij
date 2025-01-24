package PW_IF_ELSE;
import java.util.Scanner;
public class Student_marks {
    public static void main(String[] args)
    {   // Calculate percentage and tell them words based on it
        Scanner sc = new Scanner(System.in);
        int maths,eng,science,social,hindi,sanskrit,total;
        System.out.println("Please enter your marks one by one as per the subject");
        System.out.print("\n Maths : ");
        maths = sc.nextInt();
        System.out.print("\n English : ");
        eng = sc.nextInt();
        System.out.print("\n Science : ");
        science = sc.nextInt();
        System.out.print("\n Social Studies : ");
        social = sc.nextInt();
        System.out.print("\n Hindi : ");
        hindi = sc.nextInt();
        System.out.print("\n Sanskrit : ");
        sanskrit = sc.nextInt();
        total = maths + eng + sanskrit + science + hindi + social;
        double percentage = (total/600.0)*100;
//        System.out.println("enter percentage");
//        percentage= sc.nextInt();
        if (percentage > 90)
        {
            System.out.println("Excellent");
            System.out.println("Your percentage is "+percentage);
        } else if (percentage > 80)
        {
            System.out.println("Very Good");
            System.out.println("Your percentage is "+percentage);
        } else if (percentage > 70)
        {
            System.out.println(" Good ");
            System.out.println("Your percentage is "+percentage);
        } else if (percentage > 60 )
        {
            System.out.println("Can do Better");
            System.out.println("Your percentage is "+percentage);
        } else if (percentage > 50)
        {
            System.out.println("Average");
            System.out.println("Your percentage is "+percentage);
        }else if (percentage > 40)
        {
            System.out.println("Below Average");
            System.out.println("Your percentage is "+percentage);
        }
        else
        {
            System.out.println("Fail");
            System.out.println("Your percentage is "+percentage);
        }


    }
}

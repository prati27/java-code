import java.util.Scanner;
public class leap {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the year");
         int yr=sc.nextInt();

         if(yr%4==0 && (yr%100!=0 || yr%400==0) )
         {
            System.out.println("it is a leap year");

         }
         else{
            System.out.println("not a leap year");
         }
         sc.close();
    }
    
}

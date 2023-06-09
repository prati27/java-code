import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");

        String name=sc.nextLine();
        System.out.println("welcome "+name);
        sc.close();
    }
}

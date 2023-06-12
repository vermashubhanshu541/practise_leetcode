import java.sql.SQLOutput;
import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = n - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + sum; k++)
            {
                if(k==1 || k==i+sum)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            sum++;
            System.out.println();
        }
        sum--;
        for (int i = n; i >=1; i--)
        {
            for (int j = n - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + sum; k++)
            {
                if(k==1 || k==i+sum)
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            sum--;
            System.out.println();
        }
    }
}

import java.util.*;
public class maxWater {
    static int n,max;
    static int[] poles;
    static void maxCapacity()
    {
        max=0;
        int i=0,j=n-1,vol;
        while(i!=j)
        {
            vol= (j-i) * (Math.min(poles[i], poles[j]));
            max= Math.max(max, vol);
            if(poles[i]<poles[j]) i++;
            else j--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        n=sc.nextInt();
        poles=new int[n];
        System.out.println("Enter heights:");
        for(int i=0;i<n;i++)
        {
            poles[i]=sc.nextInt();
        }
        maxCapacity();
        System.out.println("Maximum Volume:"+max);
    }
}

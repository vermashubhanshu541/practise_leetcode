import java.util.*;
public class MAXCONSECUTIVE1s {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter 0's or 1's in the array:");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        ArrayList<Integer> ls=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                sum+=arr[i];
            }
            else
            {
                ls.add(sum);
                sum=0;
            }
        }
        ls.add(sum);
        sum=0;
        for(int i=0;i<ls.size()-1;i++)
        {
            if(ls.get(i)+ls.get(i+1) > sum)
            {
                sum=ls.get(i)+ls.get(i+1);
            }
        }
        System.out.println("Maximum 1's after replacing one 0 with 1 are: "+ (sum+1));
    }
}

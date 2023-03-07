import java.util.*;
public class queueNeo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int frame=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();

        for(int j=0;j<(n-frame+1);j++)
        {
            int max=0;
            for(int k=j;k<j+frame;k++)
            {
                if(max<arr[k])
                {
                    max=arr[k];
                }
            }
            q.add(max);
        }
        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
    }
}
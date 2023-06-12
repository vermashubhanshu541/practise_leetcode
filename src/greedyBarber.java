import java.util.*;
public class greedyBarber {
    static int numberOfBarbers(int n,int[] arr,int[] dep)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int barbers=1,result=1;
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                barbers++;
                i++;
            }
            else if(arr[i]>dep[j])
            {
                barbers--;
                j++;
            }
            if(barbers>result)
                result=barbers;
            // 1 2 3 4 5
            // 2 3 4 6 7
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] dep=new int[n];
        for(int i=0;i<n;i++)
            dep[i]=sc.nextInt();
        System.out.println(numberOfBarbers(n,arr,dep));
    }
}

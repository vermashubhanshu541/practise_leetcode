import java.util.*;

public class jumps {
    static boolean jump(int[] arr,int n,int i){
        if(i==n-1)
            return true;
        else if(i>n || arr[i]==0)
            return false;
        else if(i<n-1)
        {
            return jump(arr,n,(i+arr[i]));
        }
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean result=jump(arr,n,0);
        if(result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
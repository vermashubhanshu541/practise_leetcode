import java.util.*;
public class Ex1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0, pos=0, c = 0;
        if (arr[0] == 0)
            System.out.println("can't move sorry");
        else if (arr[0] > n - 1)
            System.out.println("Minimum number of jumps: 1");
        else {
            for (int i = 0; i < n - 1; i++) {
                k=Math.max(k,arr[i]+i);
                if(pos==i)
                {
                    pos=k;
                    c++;
                }
            }
            if(k<n-1)
                System.out.println("-1");
            System.out.println("jumps:"+c);
        }
    }
}

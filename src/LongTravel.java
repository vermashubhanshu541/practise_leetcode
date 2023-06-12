import java.util.*;
public class LongTravel {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix size");
        int N=sc.nextInt();
        int[][] arr=new int[N][N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int current=arr[0][0],p=0,q=0;
        System.out.print("Longest path "+current);
        while(p<N && q<N)
        {
            if(q+1<N) {
                if (arr[p][q + 1] - current == 1 || arr[p][q + 1] - current == -1) {
                    current = arr[p][q + 1];
                    q = q + 1;
                }
            }
            else if(p+1<N) {
            if (arr[p + 1][q] - current == 1 || arr[p + 1][q] - current == -1) {
                    current = arr[p + 1][q];
                    p = p + 1;
                }
            }
            System.out.print("->"+current);
        }
    }
}

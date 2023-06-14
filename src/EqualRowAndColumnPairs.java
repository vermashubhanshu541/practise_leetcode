import java.util.*;
public class EqualRowAndColumnPairs {
    static int count=0,n;
    static int[][] grid;
    static boolean findMore(int p, int q,int a,int b)
    {
        if(a>=n || b>=n)
            return true;
        if(grid[a][p]==grid[q][b])
        {
            return findMore(p, q, a + 1, b + 1);
        }
        return false;
    }
    static void sameRC()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(findMore(i,j,0,0))
                    count++;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        n= sc.nextInt();
        grid=new int[n][n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        sameRC();
        System.out.println(count);
    }
}

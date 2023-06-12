import java.util.*;
public class countIslands {
    static boolean[][] follow;
    static int[][] mat;
    static int m,n,count;
    static void markIslands(int a, int b)
    {
        int[] x_dir={1,0,-1,0},y_dir={0,1,0,-1};
        if (a!=m-1)
        {
            if(mat[a+x_dir[0]][b+y_dir[0]]==1 && !follow[a+x_dir[0]][b+y_dir[0]])
            {
                follow[a+x_dir[0]][b+y_dir[0]]=true;
                markIslands(a+x_dir[0],b+y_dir[0]);
            }
        }
        if(b!=n-1)
        {
            if(mat[a+x_dir[1]][b+y_dir[1]]==1 && !follow[a+x_dir[1]][b+y_dir[1]])
            {
                follow[a+x_dir[1]][b+y_dir[1]]=true;
                markIslands(a+x_dir[1], b+y_dir[1]);
            }
        }
        if(a!=0)
        {
            if(mat[a+x_dir[2]][b+y_dir[2]]==1 && !follow[a+x_dir[2]][b+y_dir[2]])
            {
                follow[a+x_dir[2]][b+y_dir[2]]=true;
                markIslands(a+x_dir[2],b+y_dir[2]);
            }
        }
        if(b!=0)
        {
            if(mat[a+x_dir[3]][b+y_dir[3]]==1 && !follow[a+x_dir[3]][b+y_dir[3]])
            {
                follow[a+x_dir[3]][b+y_dir[3]]=true;
                markIslands(a+x_dir[3], b+y_dir[3]);
            }
        }
    }
    static void countIsland()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!follow[i][j] && mat[i][j]==1)
                {
                    follow[i][j]=true;
                    markIslands(i,j);
                    count++;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix: m n");
        m=sc.nextInt();
        n=sc.nextInt();
        mat=new int[m][n];
        System.out.println("Enter 1's and 0's in matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        follow=new boolean[m][n];
        countIsland();
        System.out.println(count);
    }
}

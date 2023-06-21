import java.util.*;
public class highestPathSum {
    static int m,n;
    static int[][] mat;
    static int findPath2(int y,int x)
    {
        if(y!=m-1 && x!=n-1 && y!=0 && x!=0)
        {
            return mat[y][x]+ Math.max(Math.max(findPath2(y,x+1),findPath2(y+1,x)),Math.max(findPath2(y,x-1),findPath2(y-1,x)));
        }
        else if(y==0 && x!=n-1 && x!=0)
        {
            return mat[y][x]+ Math.max(Math.max(findPath2(y,x+1),findPath2(y+1,x)),findPath2(y,x-1));
        }
        else if(x==0 && y!=m-1 && y!=0)
        {
            return mat[y][x]+ Math.max(Math.max(findPath2(y,x+1),findPath2(y+1,x)),findPath2(y-1,x));
        }
        else if(y==m-1 && x!=n-1 && x!=0)
        {
            return mat[y][x]+ Math.max(findPath2(y,x+1),Math.max(findPath2(y,x-1),findPath2(y-1,x)));
        }
        else if(y!=m-1 && x==n-1 && y!=0)
        {
            return mat[y][x]+ Math.max(findPath2(y+1,x),Math.max(findPath2(y,x-1),findPath2(y-1,x)));
        }
        else if(x==0 && y==0)
        {
            return mat[y][x]+Math.max(findPath(y,x+1),findPath(y+1,x));
        }
        else if(x==0 && y==m-1)
        {
            return mat[y][x]+Math.max(findPath(y,x+1),findPath(y-1,x));
        }
        else if(x==n-1 && y==0)
        {
            return mat[y][x]+Math.max(findPath(y,x-1),findPath(y+1,x));
        }
        else if(x==n-1 && y==m-1)
        {
            return mat[y][x];
        }
        return 0;
    }
    static int findPath(int y,int x)
    {
            if(x<n-1 && y<m-1)
            {
                return mat[y][x]+Math.max(findPath(y,x+1),findPath(y+1,x));
            }
            else if(x==n-1 && y!=m-1)
            {
                return mat[y][x]+findPath(y+1,x);
            }
            else if(y==m-1 && x!=n-1)
            {
                return mat[y][x]+findPath(y,x+1);
            }
            else if(y==m-1 && x==n-1)
            {
                return mat[y][x];
            }
            return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of the matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        mat=new int[m][n];
        System.out.println("Enter elements in the matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        }
        System.out.println("Movement allowance is 2 or 4?");
        if(sc.nextInt()==2)
            System.out.println(findPath(0,0));
        else
            System.out.println(findPath2(0,0));
    }
}

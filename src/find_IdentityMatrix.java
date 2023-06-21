import java.util.*;
public class find_IdentityMatrix {
    static int[][] mat;
    static int m,n,count=0,ones=0,max;
    static boolean checkZeros(int i,int j)
    {
        //System.out.println("Ones="+ones);
        for(int k=1;k<=ones;k++)
        {
            if(mat[i-k][j]==1)
                return false;
            if(mat[i][j-k]==1)
                return false;
        }
        return true;
    }
    public static void findIdentity(int i,int j)
    {
        if(i<m-1 && j<n-1)
        {
            if(mat[i+1][j+1]==1)
            {
                ones++;
                findIdentity(i+1,j+1);
            }
        }
        if(checkZeros(i,j))
        {
            count++;
        }
        else
        {
            count=0;
        }
        ones--;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of the matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        mat=new int[m][n];
        System.out.println("#CONSTRINT IS YOU CAN ONLY ENTER 0s or 1s#");
        System.out.println("Enter elements in the matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int ele=sc.nextInt();
                if(ele==0 || ele==1)
                    mat[i][j]=ele;
                else
                {
                    System.out.println("WARNING! you can't enter "+ ele);
                    j--;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1) {
                    findIdentity(i, j);
                    if(max<count)
                        max=count;
                    count=0;
                    ones=0;
                }
            }
        }
        System.out.println(max);
    }
}

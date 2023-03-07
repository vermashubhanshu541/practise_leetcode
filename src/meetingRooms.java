import java.util.*;
public class meetingRooms {
    static ArrayList<Integer> c=new ArrayList<>();
    public static boolean isFree(int a,int b)
    {
        if(c.isEmpty())
        {
            c.add(b);
            return true;
        }
        else
        {
            for(int i=0;i<c.size();i++)
            {
                if(c.get(i)<=a)
                {
                    c.set(i,b);
                    return true;
                }
            }
        }
        c.add(b);
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of meetings:");
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        System.out.println("Enter timings:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int min=1;
        for(int i=0;i<n;i++)
        {
            if(isFree(arr[i][0],arr[i][1]))
            {
                continue;
            }
            min++;
        }
        System.out.println(min);
    }
}

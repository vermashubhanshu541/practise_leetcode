// You are using Java
import java.util.*;
public class bookSort
{
    static int words(String s)
    {
        int c=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                c++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of books:");
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        System.out.println("Enter names of the books:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int[] a2=new int[n];
        for(int i=0;i<n;i++)
        {
            a2[i]=words(arr[i]);
        }
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(a2[i],arr[i]);
        }
        Arrays.sort(a2);
        for(int i=0;i<n-1;i++)
        {
            if(a2[i]==a2[i+1])
            {
                if(hm.get(a2[i]).charAt(0)>hm.get(a2[i+1]).charAt(0))
                {
                    String temp=hm.get(a2[i]);
                    hm.put(a2[i],hm.get(a2[i+1]));
                    hm.put(a2[i+1],temp);
                }
            }
        }
        System.out.println("Sorted book titles:");
        for(int i=0;i<n;i++)
        {
            System.out.println(hm.get(a2[i]));
        }
    }
}

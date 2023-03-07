import java.util.*;
public class swapBuddy {
    public static boolean buddyStrings(String s1,String s2)
    {
        ArrayList<Integer> ls=new ArrayList<>();
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2))
        {
            HashSet<Character> hs=new HashSet<>();
            for(int i=0;i<s1.length();i++)
            {
                hs.add(s1.charAt(i));
            }
            return hs.size() < s1.length();
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                ls.add(i);
        }
        if(ls.size()>2)
            return false;
        return ls.size() == 2 && s1.charAt(ls.get(0)) == s2.charAt(ls.get(1)) && s1.charAt(ls.get(1)) == s2.charAt(ls.get(0));
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String s1=sc.next();
        System.out.println("Enter another word");
        String s2=sc.next();
        if(buddyStrings(s1,s2))
            System.out.println("Strings are swap buddy");
        else
            System.out.println("Strings are not swap buddy");
    }
}

import java.util.*;
public class romanToInteger {
   /*static public int romanToInt(String s) {
        int[] myInt= new int[]{1,5,10,50,100,500,1000};
        String[] romanMapped=new String[]{"I","V","X","L","C","D","M"};
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int formedNum=0;
        String[] converted=s.split("");
        for(int i=0;i<converted.length;i++){
            for(int j=0;j<romanMapped.length;j++){
                if(converted[i].equals(romanMapped[j])){
                    formedNum+=myInt[j];
                }
            }
        }
        return formedNum;
    }*/
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1="MDCLXVI";
        System.out.println("Enter a roman number:");
        String s=sc.next();
        int sum=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('M',1000);
        hm.put('D',500);
        hm.put('C',100);
        hm.put('L',50);
        hm.put('X',10);
        hm.put('V',5);
        hm.put('I',1);
        int i=0;
        while(i<s.length())
        {
            if(i==(s.length()-1))
            {
                sum+=hm.get(s.charAt(i));
                break;
            }
            if(s1.indexOf(s.charAt(i))>s1.indexOf(s.charAt(i+1)))
            {
                sum+=(hm.get(s.charAt(i+1)) - hm.get(s.charAt(i)));
                i+=2;
            }
            else
            {
                sum+=hm.get(s.charAt(i));
                i++;
            }
        }
        System.out.println(sum);
//        System.out.println(romanToInt("MCMXCIV"));
    }
}

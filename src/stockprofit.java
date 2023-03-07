import java.util.*;
public class stockprofit {
    public static void maxprofit(int[] prices,int size)
    {
        int maxprofit=0;
        for(int i=1;i<size;i++)
        {
            if(prices[i]>prices[i-1])
                maxprofit+=prices[i]-prices[i-1];
        }
        System.out.println(maxprofit);
    }
   static public void addStrings(String num1, String num2) {
        String[] arr1=num1.split("");
        String[] arr2=num2.split("");
        int l1=arr1.length;
        int l2=arr2.length;
        int carry=0;
        Stack<Integer> st=new Stack<>();
        while(l1>0 && l2>0){
            int sum=carry+Integer.parseInt(arr1[l1-1])+Integer.parseInt(arr2[l2-1]);
            carry=sum/10;
            st.add(sum%10);
            l1--;
            l2--;
        }
       System.out.println(st);
        int maxLen=Math.max(l1,l2);
        int flag=l1>l2?1:0;
        while(maxLen>0 && carry>=0){
            if(flag==1){
                int a=Integer.parseInt(arr1[maxLen-1])+carry;
                st.add(a%10);
                carry=a/10;
            }else if(flag==0){
                int b=Integer.parseInt(arr2[maxLen-1])+carry;
                st.add(b%10);
                carry=b/10;
            }
            maxLen--;
        }
        if(carry!=0)
            st.add(1);
        String s="";
        while(!st.isEmpty()){
            s+=st.pop();
        }
       System.out.println(s);


    }
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        int len=sc.nextInt();
//        int[] arr=new int[len];
//        for(int i=0;i<len;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        maxprofit(arr,len);
        addStrings("3876620623801494171","6529364523802684779");
    }
}

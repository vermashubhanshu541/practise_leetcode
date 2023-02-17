import java.util.*;
public class twoNumberSum
{
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
    {
        ListNode p=l1,q=l2,ls=null,r=ls;
        int carry=0,x,y;
        while(p!=null||q!=null||carry!=0)
        {
            x=(p!=null)?p.val:0;
            y=(q!=null)?q.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            sum%=10;
            ListNode temp=new ListNode(sum,null);
            if(ls==null)
            {
                ls=temp;
                r=temp;
            }
            else
            {
                r.next=temp;
                r=r.next;
            }
            if(p!=null)
             p=p.next;
            if(q!=null)
             q=q.next;
        }
        return ls;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a number");
        int b=sc.nextInt();
        ListNode l1=null,p=l1;
        while(a>0)
        {
            ListNode temp=new ListNode(a%10,null);
            if(l1==null)
            {
                l1=temp;
                p=temp;
            }
            else
            {
                p.next=temp;
                p=p.next;
            }
            a/=10;
        }
        ListNode l2=null,q=l1;
        while(b>0)
        {
            ListNode temp=new ListNode(b%10,null);
            if(l2==null)
            {
                l2=temp;
                q=temp;
            }
            else
            {
                q.next=temp;
                q=q.next;
            }
            b/=10;
        }
        ListNode ls=addTwoNumbers(l1,l2);
        p=ls;
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }
    }
}
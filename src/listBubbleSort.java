import java.util.*;
public class listBubbleSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values in linkedList and input -1 when you want to stop");
        int num=sc.nextInt();
        ListNode start=null,p=start;
        while(num!=-1)
        {
            ListNode temp=new ListNode(num);
            if(start==null)
            {
                start=temp;
                p=temp;
            }
            else {
                p.next=temp;
                p=p.next;
            }
            num=sc.nextInt();
        }
        ListNode end,q;
        for(end=null;end!=start.next;end=p)
        {
            for(p=start;p.next!=end;p=p.next)
            {
                q=p.next;
                if(p.val>q.val)
                {
                    int temp=p.val;
                    p.val=q.val;
                    q.val=temp;
                }
            }
        }
        p=start;
        while(p!=null)
        {
            System.out.print(p.val+" ");
            p=p.next;
        }
    }
}

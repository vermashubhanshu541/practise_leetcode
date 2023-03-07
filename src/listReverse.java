/*
Input:
99 23 45 12 76 29 64 38 57 82
76 57
Output:
Original list: 99 23 45 12 76 29 64 38 57 82
Reversed list: 82 57 38 64 29 76 12 45 23 99
Swapped list: 82 76 38 64 29 57 12 45 23 99
 */
import java.util.*;
public class listReverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("To end the list input give -1");
        System.out.println("Enter elements in the linked list:");
        int val=sc.nextInt();
        doublyListNode start=null,p=start;
        while(val!=-1)
        {
            doublyListNode temp=new doublyListNode(val);
            if(start==null)
            {
                start=temp;
                p=start;
            }
            else
            {
                temp.previous=p;
                p.next=temp;
                p=temp;
            }
            val=sc.nextInt();
        }
        System.out.println("Enter the values to be swapped:");
        int a=sc.nextInt(),b=sc.nextInt();
        doublyListNode q=start;
        System.out.print("Original list: ");
        while(q!=null)
        {
            System.out.print(q.data+" ");
            q=q.next;
        }
        System.out.println();
        doublyListNode e=p;
        System.out.print("Reversed list: ");
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.previous;
        }
        p=q=start;
        while(p.data!=a)
        {
            p=p.next;
        }
        while(q.data!=b)
        {
            q=q.next;
        }
        int tmp=p.data;
        p.data=q.data;
        q.data=tmp;

        System.out.println();
        System.out.print("Swapped list: ");
        while(e!=null)
        {
            System.out.print(e.data+" ");
            e=e.previous;

        }

    }
}

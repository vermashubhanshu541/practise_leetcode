import java.util.*;
class sortedListMerge {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode list=null,p=list;
            if(list1==null && list2!=null)
            {
                list=list2;
            }
            else if(list2==null && list1!=null)
            {
                list=list1;
            }
            else if(list1!=null && list2!=null) {
                while (list1 != null && list2 != null) {
                    if (list1.val <= list2.val) {
                        if (list == null) {
                            list = list1;
                            p = list;
                        } else {
                            p.next = list1;
                            p = p.next;
                        }
                        list1 = list1.next;
                    } else if (list2.val < list1.val) {
                        if (list == null) {
                            list = list2;
                            p = list;
                        } else {
                            p.next = list2;
                            p = p.next;
                        }
                        list2 = list2.next;
                    }
                }
                if (list1 == null && list2 != null) {
                    p.next = list2;
                } else if (list2 == null && list1 != null) {
                    p.next = list1;
                }
            }
            return list;
        }
        public static void display(ListNode list)
        {
            while(list!=null)
            {
                System.out.print(list.val+"-->");
                list=list.next;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter elements in list1 and insert -1 to stop:");
            ListNode list1=null,m=list1;
            int val=sc.nextInt();
            while(val!=-1)
            {
                if(list1==null)
                {
                    list1=new ListNode(val);
                    m=list1;
                }
                else
                {
                    m.next=new ListNode(val);
                    m=m.next;
                }
                val=sc.nextInt();
            }
            System.out.println("Enter elements in list2 and insert -1 to stop:");
            ListNode list2=null,n=list2;
            val=sc.nextInt();
            while(val!=-1)
            {
                if(list2==null)
                {
                    list2=new ListNode(val);
                    n=list2;
                }
                else
                {
                    n.next=new ListNode(val);
                    n=n.next;
                }
                val=sc.nextInt();
            }
//            display(list1);
//            System.out.println();
//            display(list2);
            ListNode list=mergeTwoLists(list1,list2);
            display(list);
        }
    }


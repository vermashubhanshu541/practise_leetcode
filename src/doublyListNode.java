public class doublyListNode {
    int data;
    doublyListNode next,previous;
    doublyListNode(){}
    doublyListNode(int data)
    {
        this.data=data;
    }
    doublyListNode(int data,doublyListNode next,doublyListNode previous)
    {
        this.data=data;
        this.next=next;
        this.previous=previous;
    }
}

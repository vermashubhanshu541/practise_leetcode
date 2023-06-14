import java.util.*;
public class Min_Absolute_Diff_In_BST {
    static treeNode root;
    static int min=Integer.MAX_VALUE;

    static void changeMin(int x)
    {
        if(x<min)
            min=x;
    }
    static void diff(treeNode p)
    {
        treeNode l=p.left,r=p.right,s,t;
        if(l!=null && r!=null)
        {
            s=l;
            while(s.right!=null)
                s=s.right;
            t=r;
            while(t.left!=null)
                t=t.left;
            int send= Math.min((p.data - s.data), (t.data - p.data));
            changeMin(send);
            diff(l);
            diff(r);
        }
        else if(l==null && r!=null)
        {
            t=r;
            while(t.left!=null)
                t=t.left;
            int send=t.data-p.data;
            changeMin(send);
            diff(r);
        }
        else if(l!=null)
        {
            s=l;
            while(s.right!=null)
                s=s.right;
            int send=p.data-s.data;
            changeMin(send);
            diff(l);
        }
    }
    public static int getMinimumDifference(treeNode root) {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return root.data;
        diff(root);
        return min;
    }
    public static void insert(int x)
    {
        root=insert(root,x);
    }
    private static treeNode insert(treeNode p,int x)
    {
        if(p==null)
            p = new treeNode(x);
        else if(x<p.data)
            p.left=insert(p.left,x);
        else if(x>p.data)
            p.right=insert(p.right,x);
        return p;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in BST and press -1 to stop:");
        int n=sc.nextInt();
        while(n!=-1)
        {
            insert(n);
            n=sc.nextInt();
        }
        System.out.println("Minimum Absolute Difference in BST is "+ getMinimumDifference(root));
    }
}

import java.util.*;
public class balancedHeightTree {
    private static treeNode root;
//    balancedHeightTree()
//    {
//        root=null;
//    }
    public static treeNode insert(treeNode root,int data)
    {
        treeNode temp=new treeNode(data);
        if(root==null)
        {
            root=temp;
            return root;
        }
        else if(root.data==data)
        {
            return root;
        }
        else if (root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else if(root.data<data)
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
//    public static treeNode in(treeNode q,int data)
//    {
//        if(q==null)
//        {
//            q=new treeNode(data);
//            return q;
//        }
//        if(q.left==null)
//        {
//            q.left=new treeNode(data);
//            return q;
//        }
//        else if(q.right==null)
//        {
//            q.right=new treeNode(data);
//            return q;
//        }
//        else if(q.data>data && q.left!=null)
//        {
//            q.left=in(q.left,data);
//        }
//        else if(q.data<data && q.right!=null)
//        {
//            q.right=in(q.right,data);
//        }
//        return q;
//    }
    public static void display(treeNode root)
    {
       if(root!=null)
       {
           display(root.left);
           System.out.println(root.data);
           display(root.right);
       }
    }
    static int height(treeNode root)
    {
        if(root==null)
            return  0;
        return (1+Math.max(height(root.left),height(root.right)));
    }
    static boolean isBalanced(treeNode root)
    {
        if(root==null)
            return true;
        int ls=height(root.left);
        int rs=height(root.right);
        System.out.println(ls+" "+rs);
        return Math.abs(ls-rs) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root=insert(root,sc.nextInt());
        }
//        treeNode p=root2;
//        for(int i=0;i<n;i++)
//        {
//            p=in(p,sc.nextInt());
//        }
//        System.out.println(p.right.data);
       // p=root2;
        //display(root);
        System.out.println();
        if(isBalanced(root))
            System.out.println("The binary tree is height-balanced");
        else
            System.out.println("The binary tree is not height-balanced");
    }
}

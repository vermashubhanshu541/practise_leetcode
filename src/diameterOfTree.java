import java.util.*;
public class diameterOfTree {
    private static treeNode root;
    public static treeNode insert(treeNode root,int data)
    {
        if(root==null)
        {
            root=new treeNode(data);
            return root;
        }
        else if(root.left!=null)
        {
            root.left= insert(root.left,data);
        }
        else if(root.right!=null)
        {
            root.right= insert(root.right,data);
        }
        return root;
    }
    public static void display(treeNode root)
    {
        if(root!=null)
        {
            display(root.left);
            System.out.print(root.data+" ");
            display(root.right);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root=insert(root,sc.nextInt());
        }
        display(root);
    }
}

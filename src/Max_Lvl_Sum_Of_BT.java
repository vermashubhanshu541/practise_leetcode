import java.util.*;
public class Max_Lvl_Sum_Of_BT {
    static treeNode root;
    static int max=Integer.MIN_VALUE,lvl=1,maxLvl=1;
    static ArrayList<treeNode> lt=new ArrayList<>();
    public static void insert(int x)
    {
        if(root==null) {
            root = new treeNode(x);
            return;
        }
        treeNode p=root;
        lt.add(p);
        while(lt!=null)
        {
            p=lt.remove(0);
            if(p.left!=null)
                lt.add(p.left);
            else
            {
                p.left=new treeNode(x);
                return;
            }
            if(p.right!=null)
                lt.add(p.right);
            else
            {
                p.right=new treeNode(x);
                return;
            }
        }
    }
    static treeNode changeMAX()
    {
        int sum=0;
        for (treeNode treeNode : lt) sum += treeNode.data;
        if(max<sum){
            max=sum;
            maxLvl=lvl;
        }
        return lt.get(lt.size()-1);
    }
    public static int maxLevelSum() {
        if(root==null)
            return 0;
        max=root.data;
        treeNode p,q;
        lt.add(root);
        q=root;
        while(!lt.isEmpty())
        {
            if(!lt.contains(q))
            {
                lvl++;
                q=changeMAX();
            }
            p=lt.remove(0);
            if(p.left!=null)
                lt.add(p.left);
            if(p.right!=null)
                lt.add(p.right);
        }
        System.out.println("Max sum: "+max);
        return maxLvl;
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
        lt.clear();
        System.out.println("Max sum level: "+maxLevelSum());
    }
}

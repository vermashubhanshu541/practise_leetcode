import java.util.*;

public class Countodd {
    int data;
    Countodd link;
    public Countodd(int data){
        this.data=data;
        link=null;
    }
    public void add(int data,Countodd node){
        Countodd temp=new Countodd(data);
        node.link=temp;
        temp.link=null;
    }
    public int countOdds(int low, int high){
        Countodd p=new Countodd(low);
        Countodd start=p;
        for(int i=low+1;i<=high;i++){
            start.add(i,p);
            p=p.link;
        }
        p=start;
        int count=0;
        while(p!=null){
            if(p.data%2==0) {
                p=p.link;
            }
            count++;
            p=p.link;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        Countodd ob=new Countodd(low);
        System.out.println(ob.countOdds(low,high));
    }
}

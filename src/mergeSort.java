// You are using Java
import java.util.*;
class Main
{
    void printArr(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    void merge(int[] arr,int l,int m,int r)
    {
        int i=0,j=0,k=l;
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        i=0;
        j=0;
        while(i<n1&&j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=right[j];
            j++;
            k++;
        }
        printArr(arr);
    }

    void sort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Main ob=new Main();
        ob.sort(arr,0,n-1);
        ob.printArr(arr);
    }
}
import java.util.*;
public class stockprofit {
    public static int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }

        return sell;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int len=sc.nextInt();
        System.out.println("Enter elements in the array:");
        int[] prices=new int[len];
        for(int i=0;i<len;i++)
        {
           prices[i]=sc.nextInt();
        }
        System.out.println("Enter transaction fees:");
        int fee=sc.nextInt();
        System.out.println(maxProfit(prices,fee));
    }
}

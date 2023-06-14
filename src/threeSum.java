import java.util.*;
public class threeSum {
//    ArrayList<Integer> ls=new ArrayList<>();
//        for(int i=0;i<nums.length;i++)
//            ls.add(nums[i]);
//    //boolean[] bool=new boolean[nums.length];
//    ArrayList<List<Integer>> l2=new ArrayList<>();
//    //System.out.println(ls);
//        for(int i=0;i<ls.size();i++)
//    {
//        for(int j=i+1;j<ls.size();j++)
//        {
//            int s=-1*(ls.get(i)+ls.get(j));
//            if(ls.contains(s) && i!=j && j!=ls.indexOf(s) && i!=ls.indexOf(s))
//            {
//
//                ArrayList<Integer> l1=new ArrayList<>();
//                l1.add(ls.get(i));
//                l1.add(ls.get(j));
//                l1.add(s);
//                Collections.sort(l1);
//                l2.add(l1);
//            }
//        }
//    }
//    Set<List<Integer>> set=new HashSet<>();
//        for(int i=0;i<l2.size();i++)
//            set.add(l2.get(i));
//        return new ArrayList<>(set);
//}
    public static List<List<Integer>> threeElementSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ls = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1, p2 = nums.length - 1;
            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0) {
                    ArrayList<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[p1]);
                    l1.add(nums[p2]);
                    ls.add(l1);
                    p1++;
                } else if (sum < 0)
                    p1++;
                else
                    p2--;
            }
        }
        return new ArrayList<>(ls);
//        Arrays.sort(nums);
//        HashSet<List<Integer>> hl=new HashSet<>();
//        int p1=0,p2=nums.length-1;
//        for(int i=p1+1;i<p2;i++)
//        {
//            int sum=nums[i]+nums[p1]+nums[p2];
//            if(sum==0)
//            {
//                ArrayList<Integer> ls=new ArrayList<>();
//                ls.add(nums[i]);
//                ls.add(nums[p1]);
//                ls.add(nums[p2]);
//                hl.add(ls);
//                p1++;
//            }
//            else if(sum<0)
//          }
        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(threeElementSum(nums));
    }
}

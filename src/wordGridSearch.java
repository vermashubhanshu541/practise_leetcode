import java.util.*;
public class wordGridSearch {
    static int R,C;
    static int[] x={-1,-1,-1,0,0,1,1,1};
    static int[] y={-1,0,1,-1,1,-1,0,1};
    public static boolean sequenceFound(char[][] grid, int i, int j, String word){
        if(grid[i][j]!=word.charAt(0))
            return false;

        for(int dir=0;dir<8;dir++){
            int k,rd=i+x[dir],cl=j+y[dir];
            for(k=1;k<word.length();k++){
                if(rd>=R||rd<0||cl>=C||cl<0)
                    break;
                if(grid[rd][cl]!=word.charAt(k))
                    break;

                rd+=x[dir];
                cl+=y[dir];
            }
            if(k==word.length())
                return true;
        }
        return false;
    }
    public static boolean patternSearch(char[][] grid, int row, int col, String word){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((grid[i][j]==word.charAt(0)) && sequenceFound(grid,i,j,word)) {

                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        R=sc.nextInt();
        System.out.println("Enter number of columns");
        C=sc.nextInt();
        char[][] grid=new char[R][C];
        System.out.println("Enter grid elements");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                grid[i][j]=sc.next().charAt(0);
            }
        }
        System.out.println("Enter the word to be searched");
        String word=sc.next();
        if(patternSearch(grid,R,C,word))
            System.out.println("Pattern found");
        else
            System.out.println("Not found");
    }
}

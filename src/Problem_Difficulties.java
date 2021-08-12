import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem_Difficulties {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            Set<Integer> set = new HashSet<Integer>();
            int a[] = new int[4];
            for(int i=0;i<4;i++){
                int n = sc.nextInt();
                a[i] = n;
                set.add(n);
            }
            int l = set.size();
            if(l==4 || l==3){
                System.out.println(2);
            }
            else if(l==2){
                Arrays.sort(a);
                if(a[0]==a[1]&&a[2]==a[3])System.out.println(2);
                else System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}

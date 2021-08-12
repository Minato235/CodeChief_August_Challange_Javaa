import java.util.Scanner;

public class Special_Triplets {	public static void main (String[] args) throws java.lang.Exception
{
    // your code goes here

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    while(a--!= 0) {
        int n= sc.nextInt();
        int cnt = 0;
        for(int i = 1; i < n+1; i++) {
            for(int j = i; j < n+1; j += i) {
                if(j % i == 0) {
                    for(int k = i; k < n+1; k += j) {
                        if(k % j == i) cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
}

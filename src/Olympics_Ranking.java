import java.util.Scanner;

public class Olympics_Ranking {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- != 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int sumA = a + b + c;
            int sumX = x + y + z;
            if (sumA > sumX) {
                System.out.println("1");
            } else if (sumA < sumX) {
                System.out.println("2");
            } else
                System.out.println("0");
        }
    }
}

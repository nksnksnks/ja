import java.util.Scanner;

public class phantichthuasonguyento{
    public static void main(string[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            int i = 2;
            int sum = 0;
            System.out.println("Test %d:", t);
            while(n > 1){
                while(n % i == 0){
                    n = n/i;
                    sum += 1;
                }
                System.out.println(" %d(%d)", i, sum);
            }
            t-=1;
        }
    }
}
import java.util.Scanner;

public class pttsnto{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1; j<=t; j++){
            long n = sc.nextLong();
            long i = 2;
            int sum = 0;
            System.out.format("Test %d:", j);
            while(n > 1){
                while(n % i == 0){
                    n = n/i;
                    sum += 1;
                }
                if(sum > 0){
                    System.out.format(" %d(%d)", i, sum);
                }
                i+=1;
                sum = 0;
            }
            System.out.format("%n");
        }
    }
}
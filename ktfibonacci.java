import java.util.Scanner;

public class ktfibonacci{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n =  sc.nextLong();
            long x = 0;
            long a = 0;
            long b = 1;
            while(x < n){
                x = a + b;
                a = b;
                b = x;
            }
            if(x == n ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}
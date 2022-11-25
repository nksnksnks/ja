import java.util.Scanner;
public class loichacluon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t>0){
            long n = sc.nextLong();
            long i = 1;
            while(n > 1){
                    i+=1;
                if(i>6){
                    i+=1;
                }
                if(2*i > n){
                    i=n;
                }
                while(n%i == 0){
                    sum += i;
                    n = n / i;
                }
            }
            t-=1;
        }
        System.out.format("%d", sum);
    }
}
    
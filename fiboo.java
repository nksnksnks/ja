import java.util.Scanner;

public class fiboo{
    public static void main(string[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n =  sc.nextInt();
            long x = 0;
            long a = 1;
            long b = 1;
            long c = 2;
            for(int i=0; i<n; i++){
                x = c + b;
                a = b;
                b = c;
            }
            System.out.println(x);
            t-=1;
        }
    }
}
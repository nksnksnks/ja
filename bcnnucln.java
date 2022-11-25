import java.util.Scanner;

public class test3{

    public static long UCLN(long a, long b){
        if(b == 0) 
            return a;
        return UCLN(b, a%b);
    }
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long BC = a*b/UCLN(a, b);
            long UC = UCLN(a, b);
            System.out.format("%d %d%n", BC, UC);
            t-=1;
        }    
    }
}
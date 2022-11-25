import java.math.BigInteger;
import java.util.Scanner;
public class hieuSNL_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.compareTo(b) < 0){
                BigInteger swap = a;
                a = b;
                b = swap;
            }
            BigInteger ds = a.subtract(b);
            if (ds.toString().length() < a.toString().length())
                System.out.print(0);
            System.out.println(ds);
        }
    }
}
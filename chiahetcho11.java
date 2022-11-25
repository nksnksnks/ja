import java.math.BigInteger;
import java.util.Scanner;
public class chiahetcho11{
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
            BigInteger div = a.divide(b);
            if(div.multiply(b).compareTo(a) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
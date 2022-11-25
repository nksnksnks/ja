import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
public class BSNN{
    public static int GCD(Long a, Long b){
        BigInteger a1 = BigInteger.valueOf(a);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger gcd = a1.gcd(b1);
        return gcd.intValue();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Long ds = 1L;
            Long n = sc.nextLong();
            for(Long i=1L; i<= n; i++){
                ds = i * ds / GCD(i, ds);
            }
            System.out.println(ds);
        }
    }
}
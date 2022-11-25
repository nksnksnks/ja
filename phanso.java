import java.util.Scanner;
import java.math.BigInteger;
class PS{
    private BigInteger a;
    private BigInteger b;
    void input(Scanner sc){
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
    }
    void output(){
        System.out.print(a.divide(a.gcd(b)));
        System.out.print("/");
        System.out.println(b.divide(a.gcd(b)));
    }
}
public class phanso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PS ps = new PS();
        ps.input(sc);
        ps.output();
    }
}
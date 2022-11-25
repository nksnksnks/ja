import java.util.Scanner;
import java.lang.Math;
class point{
    public double a, a1;
    void input(Scanner sc){
        this.a = sc.nextDouble();
        this.a1 = sc.nextDouble();
    }
    double distance(point p){
        double x0 = this.a - p.a;
        double x1 = this.a1 - p.a1;
        return Math.sqrt(x0*x0 + x1*x1);
    }
}
public class dientichtamgiac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            point A1 = new point();
            point B1 = new point();
            point C1 = new point();
            A1.input(sc);
            B1.input(sc);
            C1.input(sc);
            double a = A1.distance(B1);
            double b = A1.distance(C1);
            double c = C1.distance(B1);
            if(a+b <= c || a+c <= b || b+c <= a || a==0 || b == 0 || c == 0){
                System.out.println("INVALID");
            }
            else{
                double ds = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                ds = ds/4;
                System.out.format("%.2f%n", ds);
            }
        }
    }
}
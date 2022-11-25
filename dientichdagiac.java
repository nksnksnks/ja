import java.util.*;
import java.lang.*;
class Point{
    double x;
    double y;
    void input(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    double distance(Point p){
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
}
public class dientichdagiac {
    public static double tamgiac(double x, double y, double z){
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double sum=0;
            int n = sc.nextInt();
            Point[] A = new Point[n];
            for(int i=0; i<n; i++){
                A[i] = new Point();
                A[i].input(sc);
            }
            for(int i=1; i<n-1; i++){
                double a = A[0].distance(A[i]);
                double b = A[0].distance(A[i+1]);
                double c = A[i].distance(A[i+1]);
                sum += tamgiac(a, b, c);
            }
            System.out.format("%.3f%n", sum);
        }
    }
}

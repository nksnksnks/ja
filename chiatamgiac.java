import java.util.Scanner;
import java.lang.Math;

public class chiatamgiac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(int i=1; i<n; i++){
                double k = Math.sqrt(i / n) * h;
                System.out.format("%.6f ", k);
            }
            System.out.println();
            t-=1;
        }
    }
}
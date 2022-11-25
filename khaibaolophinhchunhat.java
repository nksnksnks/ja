import java.util.*;
import java.lang.Math;
class rectance{
    double a;
    double b;
    String c;
    void input(Scanner sc){
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        String s = sc.next();
        this.c = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    boolean check(){
        double x = this.a;
        double y = this.b;
        if(x*y <= 0)
            return false;
        return true;
    }
    double Area(){
        return (a*b);
    }
    double Perimeter(){
        return ((a+b)*2);
    }
    void output(){
        if(this.check() == false){
            System.out.print("INVALID");
        }
        else{
            System.out.format("%d %d %s", (int) this.Perimeter(), (int) this.Area());
        }
    }
}
public class khaibaoloppoint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        rectance a = new rectance();
        a.input(sc);
        a.output();
    }
}
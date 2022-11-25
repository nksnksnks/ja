import java.util.Scanner;
import java.lang.Math;
class thisinh{
    String ma;
    String hoTen;
    double a;
    double b;
    double c;
    double ut;
    double tong;
    String kq;
    void input(Scanner sc){
        ma = sc.next();
        sc.nextLine();
        hoTen = sc.nextLine();
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble(); 
        if(ma.substring(2,3).compareTo("1") == 0) ut = 0.5d;
        if(ma.substring(2,3).compareTo("2") == 0) ut = 1d;
        if(ma.substring(2,3).compareTo("3") == 0) ut = 2.5d;
        tong = a*2 + b + c;
        if(tong + ut >= 24) kq = "TRUNG TUYEN";
        else kq = "TRUOT";
    }
    void output(){
        if(ut != 1 && tong - Math.ceil(tong) != 0)
            System.out.format("%s %s %.1f %.1f %s", ma, hoTen, ut, tong, kq);
        if(ut == 1 && tong - Math.ceil(tong) != 0)
            System.out.format("%s %s %d %.1f %s", ma, hoTen,(int) ut, tong, kq);
        if(ut == 1 && tong - Math.ceil(tong) == 0)
            System.out.format("%s %s %d %d %s", ma, hoTen,(int) ut, (int)tong, kq);
        if(ut != 1 && tong - Math.ceil(tong) == 0)
            System.out.format("%s %s %.1f %d %s", ma, hoTen, ut, (int)tong, kq);
    }
}

public class baitoantuyensinh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        thisinh ts = new thisinh();
        ts.input(sc);
        ts.output();
    }
}
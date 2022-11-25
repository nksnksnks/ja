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
        ut = setUt();
        tong = a*2 + b + c;
        kq = setKq();
    }
    double setUt(){
        double x=0;
        if(ma.substring(2,3).compareTo("1") == 0) x = 0.5d;
        if(ma.substring(2,3).compareTo("2") == 0) x = 1d;
        if(ma.substring(2,3).compareTo("3") == 0) x = 2.5d;
        return x; 
    }
    String setKq(){
        String x ="";
        if(tong + ut >= 24) x = "TRUNG TUYEN";
        else x = "TRUOT";
        return x;
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
        System.out.println();
    }
}

public class bangdiemtuyensinh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thisinh[] ts = new thisinh[n];
        for(int i = 0;  i<n; i++){
            ts[i] = new thisinh();
            ts[i].input(sc);
        }
        for(int i =0;i<n; i++){
            ts[i].output();
        }
    }
}
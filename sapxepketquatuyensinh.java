import java.util.*;
import java.lang.*;
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
        tong = a*2 + b + c + ut;
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
        if(tong - Math.ceil(tong) != 0)
            System.out.format("%s %s %.1f %s", ma, hoTen, tong, kq);
        if(Math.ceil(tong) == 0)
            System.out.format("%s %s %d %s", ma, hoTen, (int)tong, kq);
        System.out.println();
    }
}

public class sapxepketquatuyensinh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<thisinh> ts = new ArrayList<thisinh>();
        for(int i = 0;  i<n; i++){
            thisinh tsi = new thisinh();
            tsi.input(sc);
            ts.add(tsi);
        }
        Collections.sort(ts, new Comparator<thisinh>(){
            @Override
            public int compare(thisinh o1, thisinh o2){
                if(o1.tong > o2.tong) return -1;
                else if(o1.tong < o2.tong) return 1;
                else{
                    return o1.ma.compareToIgnoreCase(o2.ma);
                }
            }
        });
        for(int i =0;i<n; i++){
            ts.get(i).output();
        }
    }
}
import java.util.*;
import java.lang.*;
class dem{
    static int demm = 0;
}
class customer{
    String ID;
    String sd;
    long neww;
    long old;
    long phuTroi;
    long heSo;
    long thanhTien;
    long thanhToan;
    void input(Scanner sc){
        sd = sc.next();
        old = sc.nextInt();
        neww = sc.nextInt();
        heSo = setHeSo();
        thanhTien = (neww - old)*heSo*550;
        phuTroi = setPhuTroi();
        ID = setID();
        thanhToan = thanhTien + phuTroi;
    }
    String setID(){
        dem.demm++;
        if(dem.demm < 10)return "KH0" + String.valueOf(dem.demm);
        else return "KH" + String.valueOf(dem.demm);
    }
    long setPhuTroi(){
        long dsPlus;
        if(neww - old < 50) dsPlus=0;
        else if(neww - old >= 50 && neww - old <= 100) dsPlus = Math.round(thanhTien/100.0*35);
        else dsPlus = thanhTien;
        return dsPlus;
    }
    long setHeSo(){
        if(sd.substring(0,2).compareTo("KD") == 0) return 3;
        else if(sd.substring(0,2).compareTo("NN") == 0) return 5;
        else if(sd.substring(0,2).compareTo("TT") == 0) return 4;
        else return 2;
    }
    void output(){
        System.out.format("%s %d %d %d %d%n", ID, heSo, thanhTien, phuTroi, thanhToan);
    }
}
public class tinhtiendien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        customer[] cs = new customer[n];
        for(int i=0; i<n; i++){
            cs[i] = new customer();
            cs[i].input(sc);
        }
        for(int i=0; i<n; i++){
            cs[i].output();
        }
    }
}
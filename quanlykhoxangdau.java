import java.util.*;
import java.lang.*;
class ql{
    String id;
    long amount;
    long thue;
    long donGia;
    long thanhTien;
    String name;
    void input(Scanner sc){
        id = sc.next();
        amount = sc.nextInt();
        donGia = setDonGia();
        thue = setThue();
        name = setName();
        thanhTien = donGia * amount + thue;
    }
    long setDonGia(){
        String x = id.substring(0,1);
        if(x.compareTo("X") == 0) return 128000;
        else if(x.compareTo("D") == 0)return 11200;
        else return 9700;
    }
    String setName(){
        String x = id.substring(3,5);
        if(x.compareTo("BP") == 0) return "British Petro";
        else if(x.compareTo("ES") == 0) return "Esso";
        else if(x.compareTo("SH") == 0) return "Shell";
        else if(x.compareTo("CA") == 0) return "Castrol";
        else if(x.compareTo("MO") == 0) return "Mobil";
        else return "Trong Nuoc";

    }
    long setThue(){
        if(id.substring(3, 5).compareTo("TN") == 0) return 0;
        else{
            String x = id.substring(0,1);
            if(x.compareTo("X") == 0) return donGia * amount /100 *3;
            else if(x.compareTo("D") == 0)return donGia * amount /200 * 7;
            else return donGia * amount /50;
        }
    }
    void output(){
        System.out.format("%s %s %d %d %d%n", id, name, donGia, thue, thanhTien);
    }
}
public class quanlykhoxangdau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ql> qly = new ArrayList<ql>();
        for(int i=0; i<n; i++){
            ql qli = new ql();
            qli.input(sc);
            qly.add(qli);
        }
        for(int i =0; i<n; i++){
            qly.get(i).output();
        }
    }
}

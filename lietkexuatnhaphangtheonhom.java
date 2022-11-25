import java.util.*;
import java.lang.*;
class hangHoa{
    String ID;
    long nhap;
    long xuat;
    long donGia;
    long tien;
    long thue;
    void input(Scanner sc){
        ID = sc.next();
        nhap = sc.nextLong();
        donGia = setDonGia();
        xuat = setXuat();
        tien = xuat*donGia;
        thue = setThue();
    }
    long setDonGia(){
        if(ID.substring(4,5).compareTo("Y") == 0) return 110000;
        else return 135000;
    }
    long setXuat(){
        if(ID.substring(0,1).compareTo("A") == 0) return Math.round(nhap/100.0*60);
        else return Math.round(nhap/100.0*70);
    }
    long setThue(){
        if(ID.substring(0,1).compareTo("A") == 0){
            if(ID.substring(4,5).compareTo("Y") == 0) return Math.round(tien/100.0*8);
            else return Math.round(tien/100.0*11);
        }
        else{
            if(ID.substring(4,5).compareTo("Y") == 0) return Math.round(tien/100.0*17);
            else return Math.round(tien/100.0*22);
        }

    }
    void output(){
        System.out.format("%s %d %d %d %d %d%n", ID, nhap, xuat, donGia, tien, thue);
    }
}
public class lietkexuatnhaphangtheonhom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<hangHoa> hh = new ArrayList<hangHoa>();
        for(int i =0; i<n; i++){
            hangHoa hhi = new hangHoa();
            hhi.input(sc);
            hh.add(hhi);
        }
        Collections.sort(hh, new Comparator<hangHoa>(){
            @Override
            public int compare(hangHoa o1, hangHoa o2){
                if(o1.thue > o2.thue) return -1;
                else if(o1.thue < o2.thue) return 1;
                else return 0;
            }
        });
        String x = sc.next();
        for(int i =0; i<n; i++){
            if(hh.get(i).ID.substring(0,1).compareTo(x) == 0)
                hh.get(i).output();
        }
    }
}

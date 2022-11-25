import java.util.*;
import java.lang.*;
class SP{
    String ID;
    String name;
    long amount;
    long donGia;
    long chietKhau;
    long thanhTien;
    void input(Scanner sc){
        sc.nextLine();
        ID = sc.nextLine();
        name = sc.nextLine();
        amount = sc.nextLong();
        donGia = sc.nextLong();
        chietKhau = sc.nextLong();
        thanhTien = donGia*amount-chietKhau;
    }
    void output(){
        System.out.format("%s %s %d %d %d %d%n", ID, name, amount, donGia, chietKhau, thanhTien);
    }
}
public class tinhtien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SP> sp = new ArrayList<SP>();
        for(int i=0; i<n; i++){
            SP spi= new SP();
            spi.input(sc);
            sp.add(spi);
        }
        Collections.sort(sp, new Comparator<SP>(){
            @Override
            public int compare(SP o1, SP o2){
                if(o1.thanhTien > o2.thanhTien) return -1;
                else return 1;
            }
        });
        for(int i=0; i<n; i++){
            sp.get(i).output();
        }
    }
}

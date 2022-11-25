import java.util.Scanner;
class sinhvien{
    String ten;
    String gioiTinh;
    String namSinh;
    String queQuan;
    String MST;
    String namLam;
    String STT = "00001";
    void input(){
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        gioiTinh = sc.nextLine();
        namSinh = sc.nextLine();
        queQuan = sc.nextLine();
        MST = sc.nextLine();
        namLam = sc.nextLine();
    }
    void output(){
        System.out.format("%s %s %s %s %s %s %s", STT, ten, gioiTinh, namSinh, queQuan ,MST , namLam);
    }
}
public class khaibaolopnhanvien{
    public static void main(String[] args){
        sinhvien sv = new sinhvien();
        sv.input();
        sv.output();
    }
}
import java.util.Scanner;
class NhanVien{
    String maNV;
    String hoTen;
    long luongCB;
    long ngayCong;
    String chucVu;
    long phuCap;
    long thuNhap;
    long tienThuong;
    long luongThang;
    void input(){
        Scanner sc = new Scanner(System.in);
        maNV = "NV01";
        hoTen = sc.nextLine();
        luongCB = sc.nextLong();
        ngayCong = sc.nextLong();
        chucVu = sc.next();
        chucVu = chucVu + "x";
        if(chucVu.substring(0,2).compareTo("GD") == 0){
            phuCap = 250000;}
        if(chucVu.substring(0,3).compareTo("PGD") == 0){
            phuCap = 200000;}
        if(chucVu.substring(0,2).compareTo("TP") == 0){
            phuCap = 180000;}
        if(chucVu.substring(0,2).compareTo("NV") == 0){
            phuCap = 150000;}
        luongThang = luongCB*ngayCong;
        if(ngayCong >= 25){
            tienThuong = luongThang/5;
        }
        if(ngayCong < 22){
            tienThuong = 0;
        }
        if(ngayCong < 25 && ngayCong>=22){
            tienThuong = luongThang/10;
        }
        thuNhap = luongThang + tienThuong + phuCap;
    }
    void output(){
        System.out.format("NV01 %s %d %d %d %d", hoTen, luongThang, tienThuong, phuCap, thuNhap);
    }
}
public class baitoantinhcong{
    public static void main(String[] args){
        NhanVien gv = new NhanVien();
        gv.input();
        gv.output();
    }
}
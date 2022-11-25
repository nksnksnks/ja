import java.util.*;
class dem{
    static int demm = 0;
}
class nhanVien{
    String hoTen;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String maNV;
    String ngayKi;
    void input(Scanner sc){
        sc.nextLine();
        hoTen = sc.nextLine();
        gioiTinh = sc.next();
        ngaySinh = sc.next();
        sc.nextLine();
        diaChi = sc.nextLine();
        maSoThue = sc.next();
        ngayKi = sc.next();
        dem.demm++;
        if(dem.demm < 10) maNV = "0000" + String.valueOf(dem.demm);
        if(dem.demm>=10 && dem.demm < 100 ) maNV = "000" + String.valueOf(dem.demm);
    }
    void output(){
        System.out.format("%s %s %s %s %s %s %s%n", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKi);
    }
}
public class danhsachdoituongnhanvien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nhanVien[] nv = new nhanVien[n];
        for(int i=0; i<n; i++)
            nv[i] = new nhanVien();
        for(int i=0; i<n; i++){
            nv[i].input(sc);
        }
        for(int i=0; i<n; i++)
            nv[i].output();
    }
}


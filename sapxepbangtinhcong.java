import java.util.*;
class dem{
    static int demm = 0;
}
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
    void input(Scanner sc){
        maNV = setMaNV();
        hoTen = sc.nextLine();
        luongCB = sc.nextLong();
        ngayCong = sc.nextLong();
        chucVu = sc.next();
        chucVu = chucVu + "x";
        sc.nextLine();
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
    public long getThuNhap(){
        return thuNhap;
    }
    String setMaNV(){
        String x = "";
        dem.demm++;
        if(dem.demm < 10) x = "NV0" + String.valueOf(dem.demm);
        else x = "NV" + String.valueOf(dem.demm);
        return x;
    }
    void output(){
        System.out.format("%s %s %d %d %d %d%n", maNV, hoTen, luongThang, tienThuong, phuCap, thuNhap);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<NhanVien> gv = new ArrayList<NhanVien>();
        sc.nextLine();
        for(int i = 0; i<n; i++){
            NhanVien gvi = new NhanVien();
            gvi.input(sc);
            gv.add(gvi);
        }
        Collections.sort(gv, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2){
                if(o1.getThuNhap() > o2.getThuNhap()) return -1;
                else return 1;
            }
        });
        for(int i = 0; i<n; i++){
            (gv.get(i)).output();
        }
    }
}
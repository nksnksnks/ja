import java.util.*;
import java.lang.*;
class dem{
    static int demm=0;
}
class nhanVien{
    String maNV;
    String hoTen;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String ngayKiHopDong;
    void input(Scanner sc){
        sc.nextLine();
        hoTen = sc.nextLine();
        gioiTinh = sc.next();
        ngaySinh = sc.next();
        sc.nextLine();
        diaChi = sc.nextLine();
        maSoThue = sc.next();
        ngayKiHopDong = sc.next();
    }
    public String getngaySinh(){
        return ngaySinh;
    }
    void maNhanVien(){
        dem.demm++;
        if(dem.demm<10) maNV = "0000" + String.valueOf(dem.demm);
        else maNV = "000" + String.valueOf(dem.demm);
    }
    void output(){
        System.out.format("%s %s %s %s %s %s %s%n", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
    }
}
public class sapxepdanhsachdoituongnhanvien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nhanVien[] nv = new nhanVien[n];
        List<nhanVien> nvPlus = new ArrayList<>();
        for(int i=0; i<n; i++){
            nv[i] = new nhanVien();
            nv[i].input(sc);
            nvPlus.add(nv[i]);
        }
        Collections.sort(nvPlus, new Comparator<nhanVien>(){
            @Override
            public int compare(nhanVien o1, nhanVien o2){
                String s1 = (o1.getngaySinh());
                String[] s11 = s1.split("/");
                String s2 = (o2.getngaySinh());
                String[] s22 = s2.split("/");
                if(Integer.parseInt(s11[2]) > Integer.parseInt(s22[2]))
                    return 1;
                else if(Integer.parseInt(s11[2]) < Integer.parseInt(s22[2]))
                    return -1;
                else{
                    if(Integer.parseInt(s11[1]) > Integer.parseInt(s22[1]))
                        return 1;
                    else if(Integer.parseInt(s11[1]) < Integer.parseInt(s22[1]))
                        return -1;
                    else{
                        if(Integer.parseInt(s11[0]) > Integer.parseInt(s22[0]))
                            return 1;
                        else if(Integer.parseInt(s11[0]) < Integer.parseInt(s22[0]))
                            return -1;
                    }
                }
                return 0;
            }
        });
        for(int i=0; i<n; i++){
            (nvPlus.get(i)).output();
        }
    }
}

import java.util.*;
class dem{
    static int demm = 0;
} 
class khachHang{
    String hoTen;
    String ngaySinh;
    String queQuan;
    String gioiTinh;
    String maKH;
    void input(Scanner sc){
        hoTen = sc.nextLine();
        hoTen = chuanHoa();
        gioiTinh = sc.nextLine();
        ngaySinh = sc.nextLine();
        ngaySinh = setNgaySinh();
        queQuan = sc.nextLine();
        maKH = setMaKH();
    }
    String setMaKH(){
        dem.demm++;
        if(dem.demm < 10) return "KH00" + String.valueOf(dem.demm);
        else return "KH0" + String.valueOf(dem.demm);
    }
    String setNgaySinh(){
        String x ="";
        String[] s = ngaySinh.split("/");
        for(int i = 0; i < 3; i++){
            if(Integer.parseInt(s[i]) < 10){
                x = x + "0" + s[i];
            }
            else x += s[i];
            if(i<2) x += "/";
        }
        return x;
    }
    String chuanHoa(){
        Vector<String> a = new Vector<>();
        String b = "";
        hoTen = hoTen +" ";
        hoTen = hoTen.toLowerCase();
        for(int i=0; i< hoTen.length(); i++){
            if(hoTen.charAt(i) == ' '){
                if(b!=""){
                    a.add(b);
                    b="";
                }
            }
            else{
                if(b=="")
                    b += hoTen.substring(i, i+1).toUpperCase();
                else
                    b+=hoTen.charAt(i);
            }
        }
        hoTen = "";
        for(int i = 0; i<a.size(); i++){
            hoTen += a.get(i) + " ";
        }
        return hoTen.substring(0, (int) hoTen.length()-1);
    }
    void output(){
        System.out.format("%s %s %s %s %s%n", maKH, hoTen, gioiTinh, queQuan, ngaySinh);
    }
}
public class danhsachkhachhang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<khachHang> sv = new ArrayList<khachHang>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            khachHang svi = new khachHang();
            svi.input(sc);
            sv.add(svi);
        }
        Collections.sort(sv, new Comparator<khachHang>(){
            @Override
            public int compare(khachHang o1, khachHang o2){
                String[] a1 = o1.ngaySinh.split("/");
                String[] a2 = o2.ngaySinh.split("/");
                if (Integer.parseInt(a1[2]) > Integer.parseInt(a2[2])) return 1;
                else if(Integer.parseInt(a1[2]) < Integer.parseInt(a2[2])) return -1;
                else{
                    if (Integer.parseInt(a1[1]) > Integer.parseInt(a2[1])) return 1;
                    else if(Integer.parseInt(a1[1]) < Integer.parseInt(a2[1])) return -1;
                    else{
                        if (Integer.parseInt(a1[0]) > Integer.parseInt(a2[0])) return 1;
                        else return -1;
                    }
                }
        }
        });
        for(int i=0; i<sv.size(); i++)
            (sv.get(i)).output();
    }
}


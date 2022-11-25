import java.util.*;
class dem{
    static int demm = 0;
} 
class sinhVien{
    String hoTen;
    String lop;
    String ngaySinh;
    public double GPA;
    String maSV;
    void input(Scanner sc){
        hoTen = sc.nextLine();
        lop = sc.next();
        ngaySinh = sc.next();
        GPA = sc.nextDouble();
        String[] s = ngaySinh.split("/");
        String x = "";
        for(int i = 0; i < 3; i++){
            if(Integer.parseInt(s[i]) < 10){
                x = x + "0" + s[i];
            }
            else x += s[i];
            if(i<2) x += "/";
        }
        ngaySinh = x;
        dem.demm++;
        if(dem.demm < 10) maSV = "B20DCCN00" + String.valueOf(dem.demm);
        if(dem.demm>=10 && dem.demm < 100 ) maSV = "B20DCCN0" + String.valueOf(dem.demm);
    }
    String chuanHoa(){
        Vector<String> a = new Vector<>();
        String b = "";
        hoTen = hoTen +" ";
        hoTen = hoTen.toLowerCase();
        for(int i=0; i<hoTen.length(); i++){
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
        return hoTen;
    }
    void output(){
        hoTen = chuanHoa();
        System.out.format("%s %s%s %s %.2f%n", maSV, hoTen, lop, ngaySinh, GPA);
    }
}
public class danhsachdoituongsinhvien_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sinhVien[] sv = new sinhVien[n];
        for(int i=0; i<n; i++)
            sv[i] = new sinhVien();
        for(int i=0; i<n; i++){
            sc.nextLine();
            sv[i].input(sc);
        }
        for(int i=0; i<n; i++)
            sv[i].output();
    }
}


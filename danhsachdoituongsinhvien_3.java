import java.util.*;
class dem{
    static int demm = 0;
} 
class sinhVien{
    String hoTen;
    String lop;
    String ngaySinh;
    double GPA;
    String maSV;
    public double getGPA(){
        return GPA;
    }
    void input(Scanner sc){
        hoTen = sc.nextLine();
        lop = sc.next();
        ngaySinh = sc.next();
        GPA = sc.nextDouble();
        ngaySinh = setNgaySinh();
        maSV = setMaSV();
        hoTen = setName();
    }
    String setMaSV(){
        dem.demm++;
        String x = "";
        if(dem.demm < 10) x = "B20DCCN00" + String.valueOf(dem.demm);
        if(dem.demm>=10 && dem.demm < 100 ) x = "B20DCCN0" + String.valueOf(dem.demm);
        return x;
    }
    String setNgaySinh(){
        String[] s = ngaySinh.split("/");
        String x = "";
        for(int i = 0; i < 3; i++){
            if(Integer.parseInt(s[i]) < 10){
                x = x + "0" + s[i];
            }
            else x += s[i];
            if(i<2) x += "/";
        }
        return x;
    }
    String setName(){
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
        System.out.format("%s %s%s %s %.2f%n", maSV, hoTen, lop, ngaySinh, GPA);
    }
}
public class danhsachdoituongsinhvien_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<sinhVien> sv = new ArrayList<sinhVien>();
        sinhVien[] svi = new sinhVien[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            svi[i] = new sinhVien();
            svi[i].input(sc);
            sv.add(svi[i]);
        }
        Collections.sort(sv, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(o1.getGPA() > o2.getGPA())
                    return -1;
                else if(o1.getGPA() < o2.getGPA())
                    return 1;
                else return 0;
        }
        });
        for(int i=0; i<sv.size(); i++)
            (sv.get(i)).output();
    }
}


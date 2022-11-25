import java.util.*;
class sinhVien{
    String hoTen;
    String lop;
    String maSV;
    double diem1;
    double diem2;
    double diem3;
    int sortt;
    void input(Scanner sc){
        maSV = sc.next();
        sc.nextLine();
        hoTen = sc.nextLine();
        lop = sc.next();
        diem1 = sc.nextDouble();
        diem2 = sc.nextDouble();
        diem3 = sc.nextDouble();
    }
    public String getHoTen(){
        return hoTen;
    }
    void output(){
        System.out.format("%s %s %s %.1f %.1f %.1f%n", maSV, hoTen, lop, diem1, diem2, diem3);
    }
}
public class test3{
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
                return (o1.getHoTen()).compareToIgnoreCase(o2.getHoTen());
        }
        });
        int dem = 0;
        for(int i=0; i<sv.size(); i++){
            dem ++ ;
            System.out.format("%d ", dem);
            (sv.get(i)).output();
        }
    }
}


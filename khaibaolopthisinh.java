import java.util.Scanner;
class sinhvien{
    String ten;
    String ns;
    float diem1;
    float diem2;
    float diem3;
    float tongdiem;
    void input(){
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        ns = sc.nextLine();
        diem1 = sc.nextFloat();
        diem2 = sc.nextFloat();
        diem3 = sc.nextFloat();
        tongdiem = diem1 + diem2 + diem3;
    }
    void output(){
        System.out.format("%s %s %.1f", ten, ns, tongdiem);
    }
}
public class khaibaolopsinhvien{
    public static void main(String[] args){
        sinhvien sv = new sinhvien();
        sv.input();
        sv.output();
    }
}
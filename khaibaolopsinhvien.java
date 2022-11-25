import java.util.Scanner;
class sinhvien{
    String ten;
    String ns;
    String lop;
    float diem;
    void input(){
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        lop = sc.nextLine();
        ns = sc.nextLine();
        diem = sc.nextFloat();
    }
    void output(){
        System.out.format("B20DCCN001 %s %s ", ten, lop);
        String[] s0 = ns.split("/");
        String x = "";
        for(int i = 0; i < 3; i++){
            if(Integer.parseInt(s0[i]) < 10){
                x = x + "0" + s0[i];
            }
            else x += s0[i];
            if(i<2) x += "/";
        }
        System.out.print(x);
        System.out.format(" %.2f", diem);
    }
}
public class khaibaolopsinhvien{
    public static void main(String[] args){
        sinhvien sv = new sinhvien();
        sv.input();
        sv.output();
    }
}
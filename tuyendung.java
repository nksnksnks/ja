import java.util.*;
import java.lang.*;
class dem{
    static int demm = 0;
}
class examinee{
    String ID;
    String name;
    double lt;
    double tt;
    String xepLoai;
    double sum;
    void input(Scanner sc){
        ID = setID();
        sc.nextLine();
        name = sc.nextLine();
        lt = sc.nextDouble();
        if(lt > 10) lt = lt/10.00;
        tt = sc.nextDouble();
        if(tt > 10) tt = tt/10.00;
        sum = setSum();
        xepLoai = setXL();
    }
    String setID(){
        String x = "";
        dem.demm++;
        if(dem.demm < 10) x = "TS0" + String.valueOf(dem.demm);
        else x = "TS" + String.valueOf(dem.demm);
        return x;
    }
    String setXL(){
        String x = "";
        if(sum <= 5) x = "TRUOT";
        else if(sum > 5 & sum <8) x = "CAN NHAC";
        else if(sum >=8 && sum <9.5) x = "DAT";
        else x = "XUAT SAC";
            return x;
    }
    double setSum(){
        double x;
        x = (lt+tt)/2.00;
        return x;
    }
    void output(){
        System.out.format("%s %s %.2f %s%n", ID, name, sum, xepLoai);
    }
}
public class tuyendung{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<examinee> ex = new ArrayList<examinee>();
        for(int i=0; i<n; i++){
            examinee exi = new examinee();
            exi.input(sc);
            ex.add(exi);
        }
        Collections.sort(ex, new Comparator<examinee>(){
            @Override
            public int compare(examinee o1, examinee o2){
                if(o1.sum > o2.sum) return -1;
                else return 1;
            }
        });
        for(int i=0; i<n; i++){
            ex.get(i).output();
        }
    }
}

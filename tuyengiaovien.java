import java.util.*;
import java.lang.*;
class dem{
    static int demm = 0;
}
class examinee{
    String ID;
    String IDm;
    String name;
    double lt;
    double tt;
    String xepLoai;
    double sum;
    double cong;
    String mon;
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        IDm = sc.nextLine();
        ID = setID();   
        lt = sc.nextDouble();
        tt = sc.nextDouble();
        cong = setCong();
        sum = setSum();
        xepLoai = setXL();
        mon = setMon();
    }
    String setMon(){
        if(IDm.substring(0, 1).compareTo("A") == 0) return "TOAN";
        else if(IDm.substring(0, 1).compareTo("B") == 0) return "LY";
        else return "HOA";
    }
    String setID(){
        String x = "";
        dem.demm++;
        if(dem.demm < 10) x = "GV0" + String.valueOf(dem.demm);
        else x = "GV" + String.valueOf(dem.demm);
        return x;
    }
    String setXL(){
        String x = "";
        if(sum <= 18) x = "LOAI";
        else x = "TRUNG TUYEN";
            return x;
    }
    double setSum(){
        double x;
        x = (lt*2+tt) + cong;
        return x;
    }
    double setCong(){
        double x = 0;
        if(IDm.substring(1, 2).compareTo("1") == 0) x= 2.0;
        else if(IDm.substring(1, 2).compareTo("2") == 0) x= 1.5;
        else if(IDm.substring(1, 2).compareTo("3") == 0) x= 1.0;
        return x;
    }
    void output(){
        System.out.format("%s %s %s %.1f %s%n", ID, name, mon, sum, xepLoai);
    }
}
public class tuyengiaovien{
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
                else if(o1.sum < o2.sum) return 1;
                else {
                    return (o1.ID).compareToIgnoreCase(o2.ID);
                }
            }
        });
        for(int i=0; i<n; i++){
            ex.get(i).output();
        }
    }
}
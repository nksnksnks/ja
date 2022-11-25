import java.util.*;
import java.lang.*;
class dem{
    static int demm = 0;
}
class examinee{
    String ID;
    String name;
    String date;
    double lt;
    double tt;
    String xepLoai;
    int sum;
    int tuoi;
    double diemThuong;
    String XL;
    void input(Scanner sc){
        ID = setID();
        sc.nextLine();
        name = sc.nextLine();
        date = sc.next();
        lt = sc.nextDouble();
        tt = sc.nextDouble();
        tuoi = setTuoi();
        diemThuong = setDiemThuong();
        sum = setSum();
        XL = setXL();
    }
    int setTuoi(){
        int x=0;
        x = 2021 - Integer.parseInt(date.substring(6,10));
        return x;
    }
    String setID(){
        String x = "";
        dem.demm++;
        if(dem.demm < 10) x = "PH0" + String.valueOf(dem.demm);
        else x = "PH" + String.valueOf(dem.demm);
        return x;
    }
    double setDiemThuong(){
        double x;
        if(lt >= 8 && tt >= 8) x = 1;
        else if(lt >= 7.5 && tt >= 7.5) x = 0.5;
        else x = 0;
        return x;
    }

    String setXL(){
        String x = "";
        if(sum < 5) x = "Truot";
        else if(sum >= 5 & sum <=6) x = "Trung binh";
        else if(sum == 7) x = "Kha";
        else if(sum == 8) x = "Gioi";
        else x = "Xuat sac";
            return x;
    }
    int setSum(){
        int x;
        x = (int) Math.round((lt+tt)/2+diemThuong);
        if(x>10) x = 10;
        return x;
    }
    void output(){
        System.out.format("%s %s %d %d %s%n", ID, name, tuoi, sum, XL);
    }
}
public class test3{
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
                else return (o1.ID).compareToIgnoreCase(o2.ID);
            }
        });
        for(int i=0; i<n; i++){
            ex.get(i).output();
        }
    }
}

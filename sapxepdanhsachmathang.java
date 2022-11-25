import java.util.*;
import java.lang.*;
class plus{
    static int demm=0;
}
class thiSinh{
    int maTS;
    String hoTen;
    String ngaySinh;
    double diem1;
    double diem2;
    double tong;
    void input(Scanner sc){
        sc.nextLine();
        hoTen = sc.nextLine();
        ngaySinh = sc.nextLine();
        diem1 = sc.nextDouble();
        diem2 = sc.nextDouble();
        tong = diem2-diem1;
        plus.demm++;
        maTS = plus.demm;
    }
    public double getTong(){
        return tong;
    }
    void output(){
        System.out.format("%d %s %s %.2f%n", maTS, hoTen, ngaySinh, tong);
    }
}
public class sapxepdanhsachmathang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thiSinh[] ts = new thiSinh[n];
        List<thiSinh> tsPlus = new ArrayList<>();
        for(int i=0; i<n; i++){
            ts[i] = new thiSinh();
            ts[i].input(sc);
            tsPlus.add(ts[i]);
        }
        Collections.sort(tsPlus, new Comparator<thiSinh>(){
            @Override
            public int compare(thiSinh o1, thiSinh o2){
                if(o1.getTong() > o2.getTong())
                    return -1;
                else if(o1.getTong() < o2.getTong())
                    return 1;
                else return 0;
            }
        });
        for(int i=0; i<tsPlus.size(); i++){
                (tsPlus.get(i)).output();
        }
    }
}

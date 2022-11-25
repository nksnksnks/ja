import java.util.*;
class dem{
    static int[] demm = {0,0,0,0,0,0,0,0,0,0};
}
class nhapKho{
    String ID;
    String name;
    long amount;
    long donGia;
    long tienChietKhau;
    long thanhTien; 
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        amount = sc.nextLong();
        donGia = sc.nextLong();
        tienChietKhau = setTienChietKhau();
        thanhTien = amount*donGia - tienChietKhau;
        ID = setID();
    }
    long setTienChietKhau(){
        long x = 0;
        long a = 0;
        if(amount > 10) a = 5;
        else if(amount <= 10 && amount>=8) a = 2;
        else if(amount >=5 && amount < 8) a = 1;
        else a = 0;
        x = donGia*amount*a/100;
        return x;
    }
    String setID(){
        String x = "";
        String[] s = name.split(" ");
        x = s[0].substring(0,1).toUpperCase() + s[1].substring(0,1).toUpperCase() + "0";
        return x;
    }
    void output(){
        System.out.format("%s", ID);
    }
    void output2(){
        System.out.format(" %s %d %d%n", name, tienChietKhau, thanhTien);
    }
}
public class test3{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nhapKho[] sp = new nhapKho[n];
        for(int i=0; i<n; i++){
            sp[i] = new nhapKho();
            sp[i].input(sc);
        }
        List<String> x = new ArrayList<String>();
        for(int i = 0; i<n; i++){
            x.add(sp[i].setID());
        }
        int[] dem = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<n; i++){
            String xx = x.get(i);
            int gan = 0;
            for(int j = 0;j<n; j++){
                if(xx.equals(x.get(j)) && dem[j] == 0){
                    gan++;
                    dem[j] = gan;
                }
            }
        }
        for(int i=0; i<n; i++){
            sp[i].output();
            System.out.print(dem[i]);
            sp[i].output2();
        }
    }
}
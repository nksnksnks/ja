import java.util.*;
class nhapKho{
    String ID;
    String name;
    long amount;
    long donGia;
    long tienChietKhau;
    long thanhTien;
    public int dem;
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
        System.out.format("%s%d %s %d %d%n",ID , dem, name, tienChietKhau, thanhTien);
    }
}
public class test3{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<nhapKho> sp = new ArrayList<nhapKho>();
        for(int i=0; i<n; i++){
            nhapKho spi = new nhapKho();
            spi.input(sc);
            sp.add(spi);
        }
        List<String> x = new ArrayList<String>();
        for(int i = 0; i<n; i++){
            x.add(sp.get(i).setID());
        }
        int[] dem = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<n; i++){
            String xx = x.get(i);
            int gan = 0;
            for(int j = 0;j<n; j++){
                if(xx.equals(x.get(j)) && dem[j] == 0){
                    gan++;
                    dem[j] = gan;
                    sp.get(j).dem = dem[j];
                }
            }
        }
        Collections.sort(sp, new Comparator<nhapKho>(){
            public int compare(nhapKho o1, nhapKho o2){
                if(o1.tienChietKhau > o2.tienChietKhau) return -1;
                else if(o1.tienChietKhau < o2.tienChietKhau) return 1;
                else return 0;
            }
        });
        for(int i=0; i<n; i++){
            sp.get(i).output();
        }
    }
}
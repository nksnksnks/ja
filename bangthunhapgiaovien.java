import java.util.*;
class teacher{
    String maNgach;
    String name;
    int dem;
    long phuCap;
    long luongCB;
    long thuNhap;
    long heSoLuong;
    String chuc;
    void input(Scanner sc){
        sc.nextLine();
        maNgach = sc.nextLine();
        name = sc.nextLine();
        luongCB = sc.nextLong();
        phuCap = setPhuCap();
        heSoLuong = setHeSoLuong();
        thuNhap = luongCB*heSoLuong + phuCap;
        chuc = setChuc();
    }
    long setPhuCap(){
        long x = 0;
        if(maNgach.substring(0, 2).compareTo("GV") == 0) x = 500000;
        else if(maNgach.substring(0, 2).compareTo("HP") == 0) x = 900000;
        else x = 2000000;
        return x;
    }
    String setChuc(){
        return maNgach.substring(0, 2);
    }
    long setHeSoLuong(){
        long x = Integer.parseInt(maNgach.substring(2,4));
        return x;
    }
    void output(){
        System.out.format("%s %s %d %d %d%n", maNgach, name, heSoLuong, phuCap, thuNhap);
    }
}
public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<teacher> tc= new ArrayList<teacher>();
        for(int i = 0; i<n; i++){
            teacher tci = new teacher();
            tci.input(sc);
            tc.add(tci);
        }
        int ht = 0;
        int hp = 0;
        for(int i=0; i<n; i++){
            if((tc.get(i).chuc).compareTo("HT") == 0 && ht < 1){
                ht++;
                tc.get(i).output();
            }
            else if((tc.get(i).chuc).compareTo("HP") == 0 && hp < 2){
                hp++;
                tc.get(i).output();
            }
            else if((tc.get(i).chuc).compareTo("GV") == 0) tc.get(i).output();
        }
    }
}

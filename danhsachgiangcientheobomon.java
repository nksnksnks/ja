import java.util.*;
class dem{
    static int demm=0;
}
class teacher{
    String ID;
    String name;
    String monHoc;
    String maMon;
    void input(Scanner sc){
        name = sc.nextLine();
        monHoc = sc.nextLine();
        monHoc = monHoc.toUpperCase();
        ID = setID();
        maMon = setMaMon();
    }
    String setID(){
        dem.demm++;
        String x = "";
        if(dem.demm < 10) x = "GV0" + String.valueOf(dem.demm);
        else x = "GV" + String.valueOf(dem.demm);
        return x;
    }
    public String getMaMon(){
        return maMon;
    }
    String setMaMon(){
        String[] s = monHoc.split(" ");
        String x = "";
        for(int i=0; i<s.length; i++){
            x = x + s[i].substring(0,1);
        }
        return x;
    }
    void output(){
        System.out.format("%s %s %s%n", ID, name, maMon);
    }
}

public class danhsachgiangcientheobomon{
    public static String setMaMonn(String monHoc){
        String[] s = monHoc.split(" ");
        String x = "";
        for(int i=0; i<s.length; i++){
            x = x + s[i].substring(0,1);
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        teacher[] tc = new teacher[n];
        List<teacher> tcPlus = new ArrayList<teacher>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            tc[i] = new teacher();
            tc[i].input(sc);
            tcPlus.add(tc[i]);
        }
        int t;
        t = sc.nextInt();
        String[] x = new String[t];
        sc.nextLine();
        for(int i = 0; i<t; i++){
            x[i] = sc.nextLine();
            x[i] = x[i].toUpperCase();
            x[i] = setMaMonn(x[i]);
        }
        for(int i = 0; i<t; i++){
            System.out.format("DANH SACH GIANG VIEN BO MON %s:%n", x[i]);
            for(int j=0; j<tcPlus.size(); j++){
                if((x[i]).equals((tcPlus.get(j)).getMaMon()) == true)
                    (tcPlus.get(j)).output();
            }
        }
    }
}

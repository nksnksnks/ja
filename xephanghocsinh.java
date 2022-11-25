import java.util.*;
class dem{
    static int demm = 0;
}
class student{
    String ID;
    String name;
    double tb;
    int xh;
    String xl;
    void input(Scanner sc){
        ID = setID();
        sc.nextLine();
        name = sc.nextLine();
        tb = sc.nextDouble();
        xl = setXl();
    }
    String setXl(){
        String x = "";
        if(tb < 5) x = "Yeu";
        else if(tb >= 5 && tb<7) x = "Trung Binh";
        else if(tb >=7 && tb < 9) x ="Kha";
        else x = "Gioi";
        return x;
    }
    String setID(){
        dem.demm++;
        String x = "";
        if(dem.demm < 10) x = "HS0" + String.valueOf(dem.demm);
        else x = "HS" + String.valueOf(dem.demm);
        return x;
    }
    void output(){
        System.out.format("%s %s %.1f %s %d%n", ID, name, tb, xl, xh);
    }
}
public class xephanghocsinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] st = new student[n];
        List<student> stPlus = new ArrayList<student>();
        for(int i=0; i<n; i++){
            st[i] = new student();
            st[i].input(sc);
            stPlus.add(st[i]);
        }
        Collections.sort(stPlus, new Comparator<student>(){
            @Override
            public int compare(student o1, student o2){
                if(o1.tb > o2.tb) return -1;
                else return 1;
            }
        });
        double test = stPlus.get(0).tb;
        int demxh = 1;
        int x =0;
        for(int i=0; i<n; i++){
            if(stPlus.get(i).tb == test){
                stPlus.get(i).xh = demxh;
                x++;
            }
            else{
                demxh += x;
                x = 1;
                test = stPlus.get(i).tb;
                stPlus.get(i).xh = demxh;
            }
        }
        for(int i =0; i<n; i++){
            st[i].output();
        }
    }  
}

import java.util.*;
import java.lang.Math;
class dem{
    static int demm = 0;
}
class student{
    String name;
    String ID;
    String category;
    double[] diem = new double[10];
    double medium;
    static String setID(){
        String x = "";
        dem.demm++;
        if(dem.demm >= 10){
            x = "HS" + String.valueOf(dem.demm);
        }
        else x = "HS0" + String.valueOf(dem.demm);
        return x;
    }
    static String setCategory(double x){
        String s;
        if(x >= 9) s = "XUAT SAC";
        else if(x>=8 && x<9) s = "GIOI";
        else if(x>=7 && x<8) s = "KHA";
        else if(x>=5 && x<7) s = "TB";
        else s = "YEU";
        return s;
    }
    void input(Scanner sc){
        ID = setID();
        sc.nextLine();
        name = sc.nextLine();
        for(int i = 0; i<10; i++){
            diem[i] = sc.nextDouble();
            if(i < 2){
                medium += diem[i]*2;
            }
            else medium += diem[i];
        }
        medium = medium/12;
        medium = (double) Math.round(medium * 10.0) / 10.0;
        category = setCategory(medium);
    }
    public double getMedium(){
        return medium;
    }
    void output(){
        System.out.format("%s %s %.1f %s%n", ID, name, medium, category);
    }
}
public class bangdiemhocsinh{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] std = new student[n];
        List<student> stdPlus = new ArrayList<student>();
        for(int i=0; i<n; i++){
            std[i] = new student();
            std[i].input(sc);
            stdPlus.add(std[i]);
        }
        Collections.sort(stdPlus, new Comparator<student>(){
            @Override
            public int compare(student o1, student o2){
                if(o1.getMedium() > o2.getMedium()) return -1;
                else if(o1.getMedium() < o2.getMedium()) return 1;
                else return 0;
            }
        });
        for(int i=0; i<n; i++){
            (stdPlus.get(i)).output(); 
        }
    }
}
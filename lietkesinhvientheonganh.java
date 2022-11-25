import java.util.*;
class student{
    String ID;
    String name;
    String clas;
    String email;
    String checkClass;
    String checkNganh;
    void input(Scanner sc){
        ID = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        clas = sc.next();
        email = sc.next();
        checkClass = clas.substring(0, 1);
        checkNganh = ID.substring(5, 7);
    }
    public String getCheckClass(){
        return checkClass;
    }
    public String getCheckNganh(){
        return checkNganh;
    }
    void output(){
        System.out.format("%s %s %s %s%n", ID, name, clas, email);
    }
}
public class lietkesinhvientheonganh{
    public static String maNganh(String s){
        String x = "";
        String[] sPlus = s.split(" "); 
        for(int i=0; i<2; i++){
            x = x + sPlus[i].substring(0, 1);
        }
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] std = new student[n];
        List<student> stdPlus = new ArrayList<student>();
        for(int i=0; i<n; i++){
            std[i] = new student();
            std[i].input(sc);
            stdPlus.add(std[i]);
        }
        int Q = sc.nextInt();
        String[] Qs = new String[Q];
        sc.nextLine();
        for(int i=0; i<Q; i++){
            Qs[i] = sc.nextLine();
            Qs[i] = Qs[i].toUpperCase();
        }
        for(int i=0; i<Q; i++){
            System.out.format("DANH SACH SINH VIEN NGANH %s:%n", Qs[i]);
            Qs[i] = maNganh(Qs[i]);
            for(int j=0; j<stdPlus.size(); j++){
                if(((stdPlus.get(j)).getCheckClass()).compareTo("E") == 0 && (Qs[i].compareTo("CN") == 0 || Qs[i].compareTo("AT") == 0)) continue;
                else
                    if((stdPlus.get(j).getCheckNganh()).compareTo(Qs[i]) == 0)     
                        (stdPlus.get(j)).output();
            }
        }
    }
}
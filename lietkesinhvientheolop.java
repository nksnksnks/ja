import java.util.*;
class student{
    String ID;
    String name;
    String clas;
    String email;
    void input(Scanner sc){
        ID = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        clas = sc.next();
        email = sc.next();
    }
    public String getClas(){
        return clas;
    }
    void output(){
        System.out.format("%s %s %s %s%n", ID, name, clas, email);
    }
}
public class lietkesinhvientheolop{
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
        for(int i=0; i<Q; i++){
            Qs[i] = sc.next();
        }
        for(int i=0; i<Q; i++){
            System.out.format("DANH SACH SINH VIEN LOP %s:%n", Qs[i]);
            for(int j=0; j<stdPlus.size(); j++){
                if(((stdPlus.get(j)).getClas()).equals(Qs[i]) == true){
                    (stdPlus.get(j)).output();
                }
            }
        }
    }
}
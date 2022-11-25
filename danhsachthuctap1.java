import java.util.*;
class dem{
    static int demm=0;
}
class teacher{
    int ID;
    String name;
    String email;
    String clas;
    String maSV;
    String company;
    void input(Scanner sc){
        maSV = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        name = name.trim();
        clas = sc.next();
        email = sc.next();
        company = sc.next();
        ID = setID();
    }
    int setID(){
        dem.demm++;
        return dem.demm;
    }
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    void output(){
        System.out.format("%d %s %s %s %s", ID, maSV, name, clas, email);
    }
}

public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        teacher[] tc = new teacher[n];
        List<teacher> tcPlus = new ArrayList<teacher>();
        for(int i=0; i<n; i++){
            tc[i] = new teacher();
            tc[i].input(sc);
            tcPlus.add(tc[i]);
        }
        int t;
        t = sc.nextInt();
        String[] x = new String[t];
        for(int i = 0; i<t; i++){
            x[i] = sc.next();
        }
        Collections.sort(tcPlus, new Comparator<teacher>(){
            @Override
            public int compare(teacher o1, teacher o2){
                return (o1.getName()).compareToIgnoreCase(o2.getName());
            }
        });
        for(int i = 0; i<t; i++){
            for(int j=0; j<tcPlus.size(); j++){
                if(((tcPlus.get(j)).getCompany()).contains(x[i]) == true){
                    (tcPlus.get(j)).output();
                    System.out.format(" %s%n", x[i]);
                }
            }
        }
    }
}

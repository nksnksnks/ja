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
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    String setID(){
        dem.demm++;
        String x = "";
        if(dem.demm < 10) x = "GV0" + String.valueOf(dem.demm);
        else x = "GV" + String.valueOf(dem.demm);
        return x;
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

public class test3{
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
        Collections.sort(tcPlus, new Comparator<teacher>(){
            @Override
            public int compare(teacher o1, teacher o2) {
                String[] name1 = (o1.getName()).split(" ");
                String[] name2 = (o2.getName()).split(" ");
                int x = name1.length-1;
                int y = name2.length-1;
                    if ((name1[x]).compareToIgnoreCase(name2[y]) != 0){
                        return (name1[x]).compareToIgnoreCase(name2[y]);
                    }
                return (o1.getID()).compareToIgnoreCase(o2.getID());
            }
        });
        for(int i=0; i<tcPlus.size(); i++){
            (tcPlus.get(i)).output();
        }
    }
}

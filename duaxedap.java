import java.util.*;
import java.lang.*;
class cuaro{
    String ID;
    String name;
    String donVi;
    String time;
    int V;
    void input(Scanner sc){
        name = sc.nextLine();
        donVi = sc.nextLine();
        time = sc.nextLine();
        ID = setID();
        V = vt();
    }
    String setID(){
        String id = "";
        String[] dv = donVi.split(" ");
        String[] na = name.split(" ");
        for(int i=0; i<dv.length;i++){
            id = id + dv[i].substring(0,1);
        }
        for(int i=0; i<na.length;i++){
            id = id + na[i].substring(0,1);
        }
        return id;
    }
    int vt(){
        String[] hm = time.split(":");
        double tg = (double) Integer.parseInt(hm[0]) - 6 + (double) Integer.parseInt(hm[1])/60;
        return (int)Math.round(120/tg);
    }
    void output(){
        System.out.format("%s %s %s %d Km/h%n", ID, name, donVi, V);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<cuaro> cr = new ArrayList<cuaro>() ;
        sc.nextLine();
        for(int i=0; i<n; i++){
            cuaro cri = new cuaro();
            cri.input(sc);
            cr.add(cri);
        }
        Collections.sort(cr, new Comparator<cuaro>() {
            @Override
            public int compare(cuaro o1, cuaro o2){
                if(o1.V > o2.V) return -1;
                else if(o1.V < o2.V)  return 1;
                else return o1.ID.compareToIgnoreCase(o2.ID);
            }
        });
        for(int i=0; i<n; i++){
            cr.get(i).output();
        }
    }
}

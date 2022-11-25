import java.util.*;
import java.lang.*;
class MH{
    String ID;
    String name;
    String xl;
    int in;
    int out;
    int sl;
    void input(Scanner sc){
        ID = sc.nextLine();
        name = sc.nextLine();
        xl = sc.nextLine();
    }
    int setIn(){
        return sl * in;
    }
    int setOut(){
        if(xl.equals("A")) return out*sl*108/100;
        else if(xl.equals("B")) return out*sl*105/100;
        else return out*sl*102/100;
    }
    void output(){
        System.out.format("%s %s %d %d%n", ID, name, setIn(), setOut());
    }
}
public class nhapxuathang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MH> mh= new ArrayList<MH>();
        sc.nextLine();
        for(int i=0; i<n; i++){
            MH mhi = new MH();
            mhi.input(sc);
            mh.add(mhi);
        }
        int x = sc.nextInt();
        String[] xi = new String[x];
        sc.nextLine();
        for(int i=0; i<x; i++){
            xi[i] = sc.nextLine();
        }
        for(int i = 0; i<x; i++){
            String[] xiPlus = xi[i].split(" ");
            for(int j=0; j<mh.size(); j++){
                if((xiPlus[0]).equals(mh.get(j).ID) == true){
                    mh.get(j).in = Integer.parseInt(xiPlus[1]);
                    mh.get(j).out = Integer.parseInt(xiPlus[3]);
                    mh.get(j).sl = Integer.parseInt(xiPlus[2]);
                    mh.get(j).output();
                    break;
                }
            }
        }
    }
}

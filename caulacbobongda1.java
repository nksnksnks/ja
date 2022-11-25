import java.util.*;
import java.lang.*;
class doiBong{
    String ID;
    String name;
    long giaVe;
    long cdv=0;
    String maTran;
    long doanhThu;
    void input(Scanner sc){
        sc.nextLine();
        ID = sc.nextLine();
        name = sc.nextLine();
        giaVe = sc.nextLong();
    }
    public long getDoanhThu(){
        return cdv*giaVe;
    }
    void output(){
        System.out.format("%s %s %d%n", maTran, name, cdv*giaVe);
    }
}
public class caulacbobongda1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<doiBong> doB = new ArrayList<doiBong>();
        int n = sc.nextInt();
        doiBong[] doi = new doiBong[n];
        for(int i=0; i<n; i++){
            doi[i] = new doiBong();
            doi[i].input(sc);
        }
        int x = sc.nextInt();
        String[] ma = new String[x];
        long[] so = new long[x];
        for(int j = 0; j<x; j++){
            ma[j] = sc.next();
            so[j] = sc.nextLong();
        }
        for(int j = 0; j<x; j++){
            for(int i=0; i<n; i++){
                if(ma[j].substring(1,3).compareTo(doi[i].ID) == 0){
                    doi[i].cdv = so[j];
                    doi[i].maTran = ma[j];
                    doB.add(doi[i]);
                    break;
                }
            }
        }
        Collections.sort(doB, new Comparator<doiBong>(){
            @Override
            public int compare(doiBong o1, doiBong o2) {
                if(o1.getDoanhThu() > o2.getDoanhThu())
                    return -1;
                else if(o1.getDoanhThu() < o2.getDoanhThu())
                    return 1;
                else return (o1.name).compareToIgnoreCase(o2.name);
        }
        });
        for(int i=0; i<sv.size(); i++)
            (doB.get(i)).output();
    }
}

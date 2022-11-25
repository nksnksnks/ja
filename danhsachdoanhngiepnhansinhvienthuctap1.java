import java.util.*;
class company{
    String name;
    String fullName;
    int amount;
    void input(Scanner sc){
        name = sc.next();
        sc.nextLine();
        fullName = sc.nextLine();
        amount = sc.nextInt();
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    void output(){
        System.out.format("%s %s %d%n", name, fullName, amount);
    }
}
public class danhsachdoanhnghiepnhansinhvienthuctap1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<company> cp = new ArrayList<company>();
        for(int i=0; i<n; i++){
            company cpi = new company();
            cpi.input(sc);
            cp.add(cpi);
        }
        Collections.sort(cp, new Comparator<company>(){
            @Override
            public int compare(company o1, company o2){
                if(o1.getAmount() > o2.getAmount()){
                    return -1;
                }
                else if(o1.getAmount() < o2.getAmount()){
                    return 1;
                }
                else{
                    return (o1.getName()).compareToIgnoreCase(o2.getName());
                }
            }
        });
        for(int i=0; i<n; i++){
            (cp.get(i)).output();
        }
    } 
}
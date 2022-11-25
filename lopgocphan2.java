import java.util.*;
class student{
    String IDM;
    String nameM;
    String clas;
    String nameG;
    void input(Scanner sc){
        IDM = sc.nextLine();
        nameM = sc.nextLine();
        clas = sc.nextLine();
        nameG = sc.nextLine();
    }
    void output(){
        System.out.format("%s %s %s%n", IDM, nameM, clas);
    }
}
public class lopgocphan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<student> st = new ArrayList<student>();
        sc.nextLine();
        for(int i =0; i<n; i++){
            student sti = new student();
            sti.input(sc);
            st.add(sti);
        }
        int x = sc.nextInt();
        String[] xi = new String[x];
        sc.nextLine();
        for(int i =0; i<x; i++){
            xi[i] = sc.nextLine();
        }
        Collections.sort(st, new Comparator<student>(){
            @Override
            public int compare(student o1, student o2){
                if(o1.IDM.equals(o2.IDM) == true){
                    if(Integer.parseInt(o1.clas) > Integer.parseInt(o2.clas)) return 1;
                    else return -1;
                }
                else return o1.IDM.compareToIgnoreCase(o2.IDM);
            }
        });
        for(int i=0; i<x; i++){
            System.out.format("Danh sach cho giang vien %s:%n", xi[i]);
            for(int j =0; j<n; j++){
                if(xi[i].equals(st.get(j).nameG) == true){
                    st.get(j).output();
                }
            }
        }
    }
}
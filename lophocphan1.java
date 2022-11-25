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
        System.out.format("%s %s%n", clas, nameG);
    }
}
public class lophocphan1 {
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
                if(Integer.parseInt(o1.clas) > Integer.parseInt(o2.clas)) return 1;
                else if(Integer.parseInt(o1.clas) <Integer.parseInt(o2.clas)) return -1;
                else return 0;
            }
        });
        for(int i=0; i<x; i++){
            for(int j1=0; j1<n; j1++){
                if(xi[i].equals(st.get(j1).IDM) == true){
                    System.out.format("Danh sach nhom lop mon %s:%n", st.get(j1).nameM);
                    break;
                }
            }
            for(int j =0; j<n; j++){
                if(xi[i].equals(st.get(j).IDM) == true){
                    st.get(j).output();
                }
            }
        }
    }
}

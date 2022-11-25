import java.util.*;
class student{
    String name;
    int truee;
    int submit;
    void input(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        truee = sc.nextInt();
        submit = sc.nextInt();
    }
    void output(){
        System.out.format("%s %d %d%n", name, truee, submit);
    }
}
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<student> st = new ArrayList<student>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            student sti = new student();
            sti.input(sc);
            st.add(sti);
        }
        Collections.sort(st, new Comparator<student>(){
            @Override
            public int compare(student o1, student o2){
                if(o1.truee > o2.truee) return -1;
                else if(o1.truee < o2.truee) return 1;
                else{
                    if(o1.submit > o2.submit) return 1;
                    else if(o1.submit < o2.submit) return -1;
                    else{
                        return (o1.name).compareToIgnoreCase(o2.name);
                    }
                }
            }
        });
        for(int i=0; i<n; i++){
            st.get(i).output();
        }
    }
}
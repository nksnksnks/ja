import java.util.*;
import java.lang.*;
public class Student{

    private String id, name, tel;
    private int teamNo;
    private String assignment;

    Student(String id, String name, String tel, int teamNo) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.teamNo = teamNo;
    }
    public void setContent(String assignment) {
        this.assignment = assignment;
    }
    public String getId() {
        return this.id;
    }
    public int getTeamNo() {
        return this.teamNo;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.tel + " " + this.teamNo + " " + this.assignment;
    }
}
public class quanlybaitapnhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);
        ArrayList<Student> res = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String tel = sc.nextLine();
            int teamNo = Integer.parseInt(sc.nextLine());
            Student s = new Student(id, name, tel, teamNo);
            res.add(s);
        }
        Collections.sort(res, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareToIgnoreCase(o2.getId());
        }
        });
        for (int i = 1; i <= m; i++) {
            String assign = sc.nextLine();
            for (Student x : res) {
                if (x.getTeamNo() == i) {
                    x.setContent(assign);
                }
            }
        }
        for (Student x : res) {
            System.out.println(x);
        }
        sc.close();
    }

}
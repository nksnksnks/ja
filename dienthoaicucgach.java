import java.util.Scanner;
public class dienthoaicucgach{
    public static void main(String[] args){
        int a[] = {2, 2, 2, 3, 3, 3 ,4 ,4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.toLowerCase();
            String s0 = "";
            String s1 = "";
            for(int i=0; i<s.length(); i++){
                String x = Integer.toString(a[s.charAt(i) - 'a']);
                s0 = s0 + x;
                s1 = x + s1;
            }
            if(s0.compareTo(s1) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
import java.util.Scanner;
public class demso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.out);
        int t = sc.nextInt();
        while(t>0){
            int test=0;
            String n = sc.next();
            for(int i=0; i<n.length()-1; i++){
                if((int)n.charAt(i) - (int)n.charAt(i+1) != 1 || (int)n.charAt(i+1) - (int)n.charAt(i-1) != 1){
                    System.out.println("NO");
                }
                else{
                    test += 1;
                }

            }
            if(test == n.length()-1){
                System.out.println("YES");
            }
            t-=1;
        }
    }
}
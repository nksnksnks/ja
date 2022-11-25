import java.util.Scanner;
public class dayuuthe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String x = sc.nextLine();
            String[] s = x.split(" "); 
            int le = 0;
            int chan = 0;
            int check = 0;
                for(int i = 0; i<s.length; i++){
                    if(Integer.parseInt(s[i])%2==0) chan++;
                    if(Integer.parseInt(s[i])%2==1) le++;
                }
                    if((chan>le && s.length%2==0 )|| (le>chan && s.length%2==1)){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
        }
    }
}
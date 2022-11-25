import java.util.Scanner;
public class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int test=0;
            int test1=0;
            String n = sc.next();
            for(int i=0; i<n.length()-1; i++){
                if((int)n.charAt(i) - (int)n.charAt(i+1) != 2 || (int)n.charAt(i+1) - (int)n.charAt(i) != 2){
					test = 0;
					break;
                }
                else{
                    test += 1;
                }
            }
            if(test == n.length()-1){
                test1 = 1;
            }
            int test2 = 0;
            int sum = 0;
            for(int i = 0; i<n.length(); i++){
                sum += (int)n.charAt(i);
            }
            if(sum%10 == 0){
                test2 = 1;
            }
			if(test1 == 1 && test2==1){
				System.out.println("YES");
			}
			else if(test1 == 0 || test2==0){
				System.out.println("NO");
			}
            t-=1;
        }
    }
}
    
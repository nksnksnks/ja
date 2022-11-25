import java.util.Scanner;

public class phantubenphaidautienlonhon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] s = new long[n];
            for(int i=0; i<n; i++){
                s[i] = sc.nextLong();
            }
            int check = 0;
            int checkk = -1;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(s[i] < s[j]){
                        System.out.format("%d ",s[j]);
                        check++;
                        break;
                    }
                }
                if(check == 0){
                    System.out.format("%d ", checkk);
                }
                    check = 0;
            }
            System.out.println("-1");
        }
    }
}
import java.util.Scanner;
public class bosungdayso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n+1];
        ar[0] = 0;
        for(int i = 1; i<=n; i++){
            ar[i] = sc.nextInt();
        }
        boolean check = false;
        for(int i = 0; i<n; i++){
            if(ar[i+1] - ar[i] >= 2){
                for(int j = ar[i]+1; j < ar[i+1];j++){
                    System.out.format("%d%n", j);
                    check = true;
                }
            }
        }
        if(check == false){
            System.out.print("Excellent!");
        }
    }
}
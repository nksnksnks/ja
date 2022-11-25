import java.util.Scanner;
public class inmatran{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] ar = new int[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    ar[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                if(i%2==0){
                    for(int j = 0; j<n; j++){
                        System.out.format("%d ", ar[i][j]);
                    }
                }
                else{
                    int j = n-1;
                    while(j >= 0){
                        System.out.format("%d ", ar[i][j]);
                        j-=1;
                    }
                }
            }
            System.out.println();
        }
    }
}
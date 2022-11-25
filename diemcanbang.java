import java.util.Scanner;
public class diemcanbang{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int vt = 1;
            int left = 0;
            int right = 0;
            left += arr[0];
            for(int z = vt+1; z<n; z++){
                right += arr[z];
            }
            while(left != right && vt < n-1){ 
                left += arr[vt];
                vt += 1;
                right -= arr[vt];
            }
            if(left != right){
                System.out.println("-1");
            }
            if(left == right){
                vt += 1;
                System.out.format("%d%n", vt);
            }
            vt = 1;
            left = 0;
            right = 0;
            t-=0;
        }
    }
}
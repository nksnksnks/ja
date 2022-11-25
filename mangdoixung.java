import java.util.Scanner;
public class mangdoixung{

    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
		    long[] arr = new long[n];

		    for (int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
		    }
            int j = n-1;
            int test=0;
            for(int i = 0; i<n/2; i++){
                if(arr[i] != arr[j]){
                    break;
                }
                j-=1;
                test = i;
            }
            if(j == test || j-test==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
}
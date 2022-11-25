import java.util.Scanner;
public class giaocuahaidayso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x;
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        for (int i=0; i<n; i++){
            x = sc.nextInt();
            arr1[x] = 1;
        }
        for (int j=0; j<m; j++){
            x = sc.nextInt();
            arr2[x] = 1;
        }
        for(int i = 0; i<1001; i++){
            if (arr1[i] == 1 && arr2[i] == 1)
                System.out.format("%d ", i);
        }
    }
}

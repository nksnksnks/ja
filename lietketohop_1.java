import java.util.Scanner;
public class lietketohop_1{
    public static void ktao(int n, int[] arr){
        for(int i = 0; i<=n ; i++){
            arr[i] = i;
        }
    }
    public static void in(int n,int k, int[] arr){
        for(int i = 1; i<=k ; i++){
            System.out.format("%d", arr[i]);
        }
        System.out.print(" ");
    }
    public static int sinh(int n,int k, int[] arr){
        int i = k;
        while(i > 0 && arr[i] == n-k+i) i--;
        arr[i]++;
        int dung = 0;
        if(i  > 0){
            for (int j=i+1; j<=k; j++) {
                arr[j]=arr[i]+j-i;
            }
        }
        else dung=1;
        return dung;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr =  new int[10];
        ktao(n, arr);
        int x = 0;
        int dem  = 0;
        do{
            in(n, k, arr);
            x = sinh(n, k, arr);
            dem++;
        }while(x!=1);
        System.out.format("%nTong cong co %d to hop", dem);
    }
}
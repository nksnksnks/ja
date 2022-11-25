import java.util.Scanner;
public class demdolanxuathien{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int n1 = 0; n1<n; n1++){
                arr[n1] = sc.nextInt();
            }
            System.out.format("Test %d:%n", i);

            for(int j=0; j<n; j++){
                int dem = 1;
                if(arr[j] > 0){
                    for(int z=j+1; z<n; z++){
                        if(arr[j] == arr[z] && arr[j] > 0){
                            dem+=1;
                            arr[z] = -1;
                        }
                    }
                System.out.format("%d xuat hien %d lan%n", arr[j], dem);
                }
            }
        }
    }
}

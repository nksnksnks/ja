import java.util.Scanner;
public class hinhsao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[(t-1)*2+1];
        int[] a1 = new int[(t-1)*2+1];
        for(int i = 1; i<=(t-1)*2; i++){
            a[i] = sc.nextInt();
            a1[a[i]]++;
        }
        int check = 1;
        for(int i = 1; i<=t; i++){
            if(a1[i] != 1 && a1[i] != t-1){
                check = 0;
                break;
            }
        }
        if(check == 0) System.out.print("No");
        else System.out.print("Yes");
    }
}
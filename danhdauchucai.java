import java.util.Scanner;

public class danhdauchucai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] check = new int[256];
        for(int i = 0; i<s.length(); i++){
            check[(int) s.charAt(i)]++;
        }
        int dem = 0;
        for(int i=0; i<256; i++){
            if(check[i] > 0){
                dem++;
            }
        }
        System.out.print(dem);
    }
}
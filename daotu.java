import java.util.Scanner;

public class daotu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] word = s.split(" ");
            for(int i = 0; i<word.length; i++){
                for(int j = word[i].length() - 1; j>=0; j--){
                    System.out.print(word[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
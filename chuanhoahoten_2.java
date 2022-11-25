import java.util.Scanner;
public class chuanhoahoten_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] temp = s.split(" ");
            String s0 = "";
            for(int i = 1; i < temp.length; i++){
                s0 += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if(i < temp.length-1){
                    s0 += " ";
                }
                else s0 = s0+ ", " + String.valueOf(temp[0].toUpperCase());
            }
            System.out.format("%s%n", s0);
        }
    }
}
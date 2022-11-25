import java.util.Scanner;

public class rutgonxau{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int check = 0;
        do{
            check = 0;
            for(int i = 0; i<s.length()-1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0, i) + s.substring(i+2);
                    check++;
                    break;
                }
            }
        }while(check != 0);
        if(s.length() > 0)
            System.out.print(s);
        else
            System.out.print("Empty String");
    }
}
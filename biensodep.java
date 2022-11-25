import java.util.Scanner;
public class test{
    public static int tangchat(String s){
        String[] word = s.split("");
        if(Integer.parseInt(word[5]) < Integer.parseInt(word[6]) && Integer.parseInt(word[6]) < Integer.parseInt(word[7]) && Integer.parseInt(word[7]) < Integer.parseInt(word[9]) && Integer.parseInt(word[9]) < Integer.parseInt(word[10])){
            return 1;
        }
        else return 0;
    }
    public static int bangnhau(String s){
        String[] word = s.split("");
        if(Integer.parseInt(word[5]) == Integer.parseInt(word[6]) && Integer.parseInt(word[6]) == Integer.parseInt(word[7]) && Integer.parseInt(word[7]) == Integer.parseInt(word[9]) && Integer.parseInt(word[9]) == Integer.parseInt(word[10])){
            return 1;
        }
        else return 0;
    }
    public static int daucuoi(String s){
        String[] word = s.split("");
        if(Integer.parseInt(word[5]) == Integer.parseInt(word[6]) && Integer.parseInt(word[6]) == Integer.parseInt(word[7]) && Integer.parseInt(word[9]) == Integer.parseInt(word[10])){
            return 1;
        }
        else return 0;
    }
    public static int locphat(String s){
        String[] word = s.split("");
        for(int i = 5; i < 10; i++){
            if(i > 7){
                if(Integer.parseInt(word[i+1]) != 6 && Integer.parseInt(word[i+1]) != 8)
                    return 0;
            }
            else{
                if(Integer.parseInt(word[i]) != 6 && Integer.parseInt(word[i]) != 8)
                    return 0;
            } 
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            if(tangchat(s) == 1 || bangnhau(s) == 1 || daucuoi(s) == 1 || locphat(s) == 1){
                System.out.println("YES");}
            else{
                System.out.println("NO");}
            t--;
        }
    }
}
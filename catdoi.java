import java.util.Scanner;

public class catdoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String n = sc.next();
            int test = 0;
            int test2 = 0;
            int test3 = 0;
            int len = n.length();
            String a0 = "0";
            String a1 = "1";
            String a8 = "8";
            String a9 = "9";
            for(int i=0 ; i<len; i++){
                if(n.charAt(i) != a0.charAt(0) && n.charAt(i) != a8.charAt(0) && n.charAt(i) != a9.charAt(0) && n.charAt(i) != a1.charAt(0)){
                    test +=1;
                    break;
                }
            } 
            for(int i=0 ; i<len; i++){
                if(n.charAt(i) != a1.charAt(0) && (n.charAt(i) == a8.charAt(0) || n.charAt(i) == a9.charAt(0) || n.charAt(i) == a0.charAt(0))){
                    test2 +=1;
                }
            }       
            if(test > 0 || test2 == len){
                System.out.print("INVALID");
            }
            else{
                for(int i=0 ; i<len; i++){
                    if(n.charAt(i) == a1.charAt(0)){
                        System.out.print(a1);
                        test3 = 1;
                    }
                    if((n.charAt(i) == a8.charAt(0) || n.charAt(i) == a9.charAt(0) || n.charAt(i) == a0.charAt(0) ) && test3 > 0){
                        System.out.print("0");
                    }
                }    
            }
            System.out.print("\n");
            t-=1;
        }
    }
}
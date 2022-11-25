import java.util.Vector;
import java.util.Comparator;
import java.util.Scanner;
public class sapxepchen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();
            int dem = 0;
            int dempt = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int n1 = 0; n1<n; n1++){
                arr[n1] = sc.nextInt();
            }
            for(int s=0; s<n; s++){
                numbers.add(arr[s]);
                dempt +=1;
                numbers.sort(Comparator.naturalOrder());
                System.out.format("Buoc %d:", dem);
                for(int x=0; x<dempt; x++){
                    int gett = numbers.get(x);
                    System.out.print(" " + gett);
                }
                System.out.format("%n");
                dem +=1;
        }
    }
}   
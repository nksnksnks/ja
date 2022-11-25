import java.util.*;
public class bobapitago{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ok = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n-2; i++) {
                for (int j = i + 1; j < n-1; j++) {
                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
                    if (k * k != a[i] * a[i] + a[j] * a[j]) {
                        break;
                    }
                    if (Arrays.binarySearch(a, k) > j) {
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok == 1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
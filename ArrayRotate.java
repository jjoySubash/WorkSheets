
import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Read array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // Sort (simple selection sort)
        for (int count = 1; count <= k; count++) {
            int copy = a[0];
            for(int i=0;i<=n-2;i++){
                a[i] = a[i+1];
            }
            a[n-1] = copy;
        }
        
        // Print sorted array in one line
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

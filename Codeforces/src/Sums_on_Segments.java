import java.util.*;
public class Sums_on_Segments {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-->0){
            int n = cs.nextInt();
            int ar[] = new int[n];
            TreeSet<Integer> set = new TreeSet<Integer>();
            int prefixSum[] = new int[n+1];
            int suffixSum[] = new int[n+1];
            set.add(0);
            for(int i =0;i<n;i++){
                ar[i] = cs.nextInt();
                set.add(ar[i]);
            }
            prefixSum[0] = ar[0];
            suffixSum[0] = ar[ar.length-1];
            set.add(prefixSum[0]);
            set.add(suffixSum[0]);
            for(int i =1;i<ar.length;i++){
                prefixSum[i] = prefixSum[i-1]+ar[i];
                set.add(prefixSum[i]);
            }
            for(int i =ar.length-2;i>=0;i--){
                suffixSum[i] = suffixSum[i+1]+ar[i];
                set.add(suffixSum[i]);
            }
            for(Integer value : set){
                System.out.print(value +" ");
            }
            System.out.println("");
        }
    }
}

import java.util.*;
public class Preparing_On_Olympiad {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-->0){
            int n = cs.nextInt();int sum=0;
            int ar[] = new int[n];
            int br[] = new int[n];
            for(int i =0;i<n;i++){
                ar[i] = cs.nextInt();

            }
            for(int y =0;y<n;y++){
                br[y] = cs.nextInt();
            }
            sum = ar[n-1];
            for(int i =0;i<n;i++){

                //System.out.println(ar[i]+" "+br[i+1]);
                    if(i!=n-1 && ar[i]>br[i+1]){
                        sum+=(ar[i]-br[i+1]);
                    }


            }
            System.out.println(sum);
            sum =0;
        }
    }
}

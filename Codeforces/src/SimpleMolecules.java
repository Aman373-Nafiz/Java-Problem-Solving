import java.util.*;

public class SimpleMolecules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();int c = sc.nextInt();
        if((a+b+c)%2!=0){
            System.out.println("Impossible");
        }

        else{
            int  x = (a+b-c)/2;
            int y = (b+c-a)/2;
            int z = (c+a-b)/2;
            if (x >= 0 && y >= 0 && z >= 0) {
                System.out.println(x + " " + y + " " + z);
            } else {
                System.out.println("Impossible");
            }
        }
        sc.close();
    }
}

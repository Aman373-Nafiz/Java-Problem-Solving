import java.util.*;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ar[] =  new String[t];
        int count =1;
        for(int i =0;i<t;i++){ar[i] = sc.next(); }
        for(int i =1;i<t;i++){if(!ar[i].equals(ar[i-1])) count++;}
        System.out.println(count);
        sc.close();
    }
}

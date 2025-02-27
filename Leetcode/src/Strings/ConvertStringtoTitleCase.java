package Strings;

import java.util.*;

public class ConvertStringtoTitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
    String j = sc.next();
    String arr [] = j.split(" ");
            StringBuilder jk = new StringBuilder();
          for(int i =0;i<arr.length;i++){
               jk.append(arr[i].substring(0,1).toUpperCase()).append(arr[i].substring(1).toLowerCase()).append(" ");
          }
            System.out.println(jk);
        }
    }

}


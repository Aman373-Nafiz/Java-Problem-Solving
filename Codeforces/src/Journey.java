import java.util.*;
public class Journey {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-->0){
            int n = cs.nextInt(); int  a= cs.nextInt();int b = cs.nextInt();int c = cs.nextInt();

            int x = (n/(a+b+c)) *3;
            int y = n%(a+b+c);
            if(y!=0){
                if(a-y>=0){
                    x+=1;
                }
                else if(a+b-y>=0){
                    x+=2;
                }
                else if(a+b+c-y>=0){
                    x+=3;
                }
            }
            System.out.println(x);}
//            int x = n%(a+b+c);
//            double y = Math.ceil((double)n/(double)(a+b+c));
//            System.out.println(x+(int)y);
//            int ar []={a,b,c};int count =0;int index=0;
//            while(n>0){
//                count++;
//                //System.out.println(count);
//                n-=ar[index%3];
//                index++;
//            }
//            System.out.println(count);
        }
    }


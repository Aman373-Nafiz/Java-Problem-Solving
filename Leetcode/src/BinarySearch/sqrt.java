package BinarySearch;

public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x){
        int start =0;int end = x;
        int ans = 0;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid*mid==x){
                ans = mid;
                break;
            }
            else if(mid*mid<x){
                start = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}

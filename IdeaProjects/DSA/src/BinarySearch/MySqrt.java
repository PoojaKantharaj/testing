package BinarySearch;

public class MySqrt {
    public static void main(String[] args) {
        int x =225;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int mid = 0;
        int ans = 0;

        while(start < end){

             mid = start + (end - start) / 2;
            if(mid  == x/mid){
                return mid;
            }else if(mid > x/mid){
                end = mid;
            }else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}

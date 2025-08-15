package BinarySearch;

public class GuessTheNumber {

    public static void main(String[] args) {
        int n = 10;
        int result = guessNumber(n);
        System.out.println(result);
    }
    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start) / 2;
            int ans = guess(mid);

            if(ans == 0){
                return mid;
            }else if(ans == -1){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return mid;
    }

    public static int guess(int pick){
        int randomPick = 6;
        if(pick == randomPick)
            return 0;
        else if(pick > randomPick)
            return -1;
        else
            return 1;
    }
}

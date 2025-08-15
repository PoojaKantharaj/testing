package BinarySearch;

public class FindCeilingAndFloorElement {

    public static int findCeiling(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        if(target > arr[arr.length -1]){
            return -1;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(target > arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return arr[left];
    }


    public static int findFloor(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        if(target < arr[left]){
            return -1;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(target > arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return arr[right];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; // Sorted array
        int target = 6;

        int ceiling = findCeiling(arr, target);
        int floor = findFloor(arr, target);

        if (ceiling != -1) {
            System.out.println("Ceiling of " + target + " is " + ceiling);
        } else {
            System.out.println("No ceiling found for " + target);
        }

        if (floor != -1) {
            System.out.println("Floor of " + target + " is " + floor);
        } else {
            System.out.println("No floor found for " + target);
        }
    }
}

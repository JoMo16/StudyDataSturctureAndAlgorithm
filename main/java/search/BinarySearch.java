package search;


public class BinarySearch {


    public int binarySearch_base(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while (left <= right){
            int middle = right - left >>> 1;
            if (target < arr[middle]){
                right = middle;
            }if (target > arr[middle]){
                left = middle;
            }else {
                return middle;
            }
        }
        return 0;
    }






}

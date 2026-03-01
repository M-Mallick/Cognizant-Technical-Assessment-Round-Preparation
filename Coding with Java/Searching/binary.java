import java.util.*;
public class Main {
    public static int binary(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2; // low - (low - high)/2 for larger array
            if(arr[mid] == key) {
                return mid;
            }
            else if(key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] arr = {0,1,5,7,9,14,15};
	    int index = binary(arr, 9);
		System.out.println(index+" -> "+arr[index]);
	}
}

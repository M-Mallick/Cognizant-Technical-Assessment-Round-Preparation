import java.util.*;
public class Main {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
	public static void main(String[] args) {
	    int[] arr = {0,1,5,7,9,14,15};
	    int a = secondLargest(arr);
        System.out.println(a);
	}
}

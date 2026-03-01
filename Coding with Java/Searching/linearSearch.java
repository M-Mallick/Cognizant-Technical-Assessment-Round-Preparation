import java.util.*;
public class Main {
    public static int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] arr = {0,1,5,7,9,14,15};
	    int index = linearSearch(arr, 90);
        if(index != -1) {
            System.out.println(index + " -> " + arr[index]);
        } else {
            System.out.println("Element not found");
        }
	}
}

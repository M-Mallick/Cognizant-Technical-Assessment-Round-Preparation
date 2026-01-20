/*
Your task is to find and return an integer value representing 
the total number of subarrays of size 3 such that the sum of 
the first element and the third element is equal to the second element.

Note: A continuous part of an array is a subarray.

Input Specification
inputl: An integer array of size N.
input2: An integer value N, representing the size of the array.

Output Specification
Return an integer value representing the total number of subarrays
of size 3 such that the sum of the first element and the third 
element is equal to the second element.

Example 1
input1: {1, 2, 1, 3, 5, 2, 4, 2}
input2: 8

*/
import java.util.*;
public class Main
{
    private static int subarrayCount(int[] arr) {
        
        int s = 0, e = 2, count = 0;
        
        for(int i=1; i < arr.length; i++) {
            
            int middle = (arr[s] + arr[e]);
            
            if(middle == arr[i]) {
                count++;
            }
            if(i == arr.length - 2) {
                break;
            }
            
            s++;
            e++;
            
        }
        
        return count;
        
    }
	public static void main(String[] args) {
// 		int[] arr = {1, 2, 1, 3, 5, 2, 4, 2};
		int[] arr = {2, 4, 2};
		int count_sa = subarrayCount(arr);
		System.out.println("Your O/P: "+count_sa);
	}
}

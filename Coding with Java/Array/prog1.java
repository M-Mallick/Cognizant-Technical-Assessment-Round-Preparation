/*
There is a lift in your society that can accommodate a maximum 
weight of X units. The weights of the people planning to use 
the lift are given in an integer array A of size N.

Your task is to find and return an integer value representing 
the maximum number of people that can use the lift together 
without exceeding the lift's weight capacity.

Input Specification:
    inputl: An integer value N representing the number of people
            planning to use the lift.
    input2: An integer value X representing the maximum weight 
            capacity of the lift.
    input3: An integer array A containing the weights of the 
            people planning to use the lift.

Output Specification:
    Return an integer value representing the maximum number of 
    people that can use the lift together without exceeding its weight capacity.

Example 1:                           Example 2:
    inputl: 3                        inputl: 6
    input2: 9                        input2: 8
    input3: {5, 1, 5}                input3: {4, 3, 5, 1, 1, 2}  --> {1, 1, 2, 3, 4, 5}
    Output: 2                        Output: 4

*/
import java.util.*;
public class Main {
    private static int maxPeople(int[] arr, int mw) {
        Arrays.sort(arr);
        int sum = 0, mp = 0;
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
            if(sum <= mw) {
                mp++;
            }
            else {
                break;
            }   
        }
        return mp;
    }
	public static void main(String[] args) {
        // int maxWaight = 8;
        // int[] arr = {4, 3, 5, 1, 1, 2};
        int maxWaight = 9;
		int[] arr = {5, 1, 5};
		int max_people = maxPeople(arr, maxWaight);
		System.out.println("Your O/P: "+max_people);
	}
}

/*
    Problem Statement:
    Halsey has received a string S which comprises of only X and Y.
    In order to make it an ideal string, she wants to remove any repetitive alphabets from the string.

    This means that one X should follow one Y and so on.

    In order to clean the string, she is allowed to remove each extra X or Y one at a time.
    Find and return the minimum number of removals she needs to perform to achieve her ideal string.

    Input Specification -> input1 : A string value S
    Output Specification -> Return an integer value representing the number of removals.

    Input: XYXXYXXY   Output: 2
*/

import java.util.*;

public class UserMainCode
{
    public int minimumRemovals(String input1){

        int count = 0;

        for(int i = 1; i < input1.length(); i++) {
            if(input1.charAt(i - 1) == input1.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    // Main method to attach input & output
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String input1 = sc.nextLine();

        // Object creation
        UserMainCode obj = new UserMainCode();

        // Method call
        int result = obj.minimumRemovals(input1);

        // Output
        System.out.println(result);
    }
}

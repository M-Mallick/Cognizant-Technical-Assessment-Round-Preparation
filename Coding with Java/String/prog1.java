/*
1.	You are given a string $ consisting of lowercase English letters. You have to generate 
    a new expanded string where each character in S repeats equal to its first index occurrence.
    Your task is to find and return a string formatted as described. The characters should be 
    separated by hyphens ('-') in the output.
*/
import java.util.*;
public class Main
{
    private static String generateStr(String str) {
        Map<Character, Integer> map = new Hashtable<>();
        for(int i=0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i + 1);
            }
        }
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i < str.length(); i++) {
            int count = (int) map.get(str.charAt(i));
            while(count != 0) {
                newStr = newStr.append(str.charAt(i));
                count--;
            }
            if(i == str.length() - 1) {
                break;
            }else {
                newStr = newStr.append('-');
            }
        }
        return newStr.toString();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str_IO = sc.nextLine();
		System.out.println("Your I/P: "+str_IO);
		String str_OT = generateStr(str_IO);
		System.out.println("Your O/P: "+str_OT);
	}
}

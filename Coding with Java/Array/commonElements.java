// Find common elements in two arrays.
import java.util.*;
public class Main
{
    public static int[] commonElements(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++) {
            map.put(a[i], i);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<b.length; j++) {
            if(map.containsKey(b[j])) {
                list.add(b[j]);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
	public static void main(String[] args) {
	    int[] arr1 = {1,4,2,6,0};
	    int[] arr2 = {2,6,3,1,5,9,7};
	    int[] ans = commonElements(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}
}

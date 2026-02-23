import java.util.Arrays;
class MoveZero {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0,1};  // 1,1,1,1,1,0,0,0
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            // if low -> 0 then low++
            if(arr[low] == 0) {
                low++;
            }
            
            // if high -> 1 then high--
            if(arr[high] == 1) {
                high--;
            }
            
            // if low -> 1 and high -> 0 then swap(low, high) and low++ high--
            if(arr[low] == 1 && arr[high] == 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

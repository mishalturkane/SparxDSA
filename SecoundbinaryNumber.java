import java.util.Arrays;

public class SecoundbinaryNumber {

    public static void ZeroOne(int[] arr) {
        int temp;
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1) {
                if (arr[end] != 1) {
                    temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
                end--;
            } else{
                start++;
                    }
        }
    }
    public static void ZeroOneTwo(int [] arr){
        int left=0,right=arr.length-1;
        int current=0,temp;
        while(current<=right){
            if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                current++;
            }
            else if(arr[current]==2){
                temp=arr[right];
                arr[right]=arr[current];
                arr[current]=temp;
                right--;
            }
            else current++;
        }
    }
    public static void main(String[] args) {
        int [] arr={0,1,0,1,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1};
        ZeroOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class SecondLargest {
    public static int findSecondALarge(int [] arr){
        Arrays.sort(arr);
        if(arr.length<=0){
            return -1;
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1])
                return arr[i-1];
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int [] arr={};
        System.out.println(findSecondALarge(arr));

    }
}

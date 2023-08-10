import java.util.Arrays;

public class PairSumRevision {
    public static int Pairsum(int [] arr,int target){
        int count=0;
        int sum;
        int start=0,end=arr.length-1;
        Arrays.sort(arr);
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                count++;
                start++;
                end--;
            }else if(sum<target)
                start++;
            else end--;

        }
        return count;
    }
    public static void main(String[] args) {

        int [] arr={6,5,4,3,2,1};
        int target=8;
        System.out.println(Pairsum(arr,target));

    }
}

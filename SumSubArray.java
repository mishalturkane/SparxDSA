public class SumSubArray {
    public static void sumSubArray(int [] arr){
        int ts=0;
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current=0;
                for(int k=i;k<=j;k++){
                    current+=arr[k];
                }
                System.out.println(current);
                if(max<current){
                    max=current;
                }
            }
        }
        System.out.println("max sum:"+max);
    }

    public static void main(String[] args) {
        int [] arr={-1,4,3,5,-3,7};
        sumSubArray(arr);
    }
}

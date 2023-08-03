public class primsum {
    public  static  int primSum(int [] arr,int target){
        int cont=0;
        int sum ,j=0;
        for(int i=0;i<arr.length-1;i++){
            for( j=i+j;j< arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    ++cont;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int target=6;
       int cont=primSum(arr,target);
    }

}

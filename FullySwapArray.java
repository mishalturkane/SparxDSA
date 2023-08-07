public class FullySwapArray {
    public static void doswap(int [] arr){
        int temp;
        int start=0,end=arr.length-1;
        while(start<end){
           temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr=new int [100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        doswap(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

public class SwapAlter {
    public static void swapAlter(int [] arr){
        int temp;
        for(int i=0;i<arr.length-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        System.out.println("Before wappping:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        swapAlter(arr);
        System.out.print("After swapping : ");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}

public class SwapArr {
    public static void swap(int [] numbers){
        for(int i=0;i<numbers.length-1;i=i+2){
            int temp=numbers[i];
            numbers[i]=numbers[i+1];
            numbers[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={9,3,6,12,4,9};
        System.out.println("chalana kab tak hian:"+(arr.length-1));
        System.out.println("The Actual Array:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("The Swwaped Array:");
        swap(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

public class PlusArray {
    public static void PlusTheArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        System.out.println("Aur Array:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("The Plus Array Array:");
        PlusTheArray(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

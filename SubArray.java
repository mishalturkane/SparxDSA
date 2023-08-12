public class SubArray {
    public static void printSA(int [] arr){
        int ts=0,current=0,id=0;
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    current+=arr[k];
                }
                System.out.print(" -->current sum "+current);
                ts++;
                if(Max<current){
                    Max=current;
                    id=arr[i];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is :"+Max);
        System.out.println("Its id:"+id);
    }

    public static void main(String[] args) {
        int [] arr={3,4,9,-5,4,-3,2,-4,9};
        printSA(arr);
    }
}

public class MinSubArray {
    public static void printSA(int [] arr){
        int ts=0,current=0,id=0;
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    current+=arr[k];
                }
                System.out.print(" -->current min "+current);
                ts++;
                if(Min>current){
                    Min=current;
                    id=arr[i];
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min sum is :"+Min);
        System.out.println("Its id:"+id);
    }

    public static void main(String[] args) {
        int [] arr={3,4,9,5};
        printSA(arr);
    }
}

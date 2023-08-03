public class MaxinArray {
    public static  int maxEleArray(int [] arr){
        int max=arr[0];
        for(int x:arr){
            if(x>max)
                max=x;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
       int dekh= maxEleArray(arr);
        System.out.println("Yaha pr");
       for(int x:arr){
           System.out.print(x+" ");
       }
        System.out.println();
        System.out.println("Bada hian ye:"+dekh);
    }
}

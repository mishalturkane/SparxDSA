public class minMax {
  public static int getMaxMin(int [] arr){
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
          if(max<arr[i])
              max=arr[i];
          if(min>arr[i])
              min=arr[i];
      }z
      System.out.println(max);
      System.out.println("Minimum is:"+min);
      return 1;
  }
    public static void main(String[] args) {
        int [] arr={1,4,5,3,2};
        getMaxMin(arr);
    }
}

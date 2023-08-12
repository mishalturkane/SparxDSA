import java.util.Arrays;

public class Findrep {
    public  static int findRepeat(int [] arr){
        int dup=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    dup=arr[i];
            }
        }
        return dup;
    }
    public  static int findRepeat2(int [] arr){
        int dup=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                dup=arr[i];
            }
        }
        return dup;
    }

    public  static void   findtwoRepeat(int [] arr){
        for(int i=0;i<arr.length;i++){
           int x=Math.abs(arr[i]);
           if(arr[x]>0){
               arr[x]=-arr[x];
           }
           else
               System.out.println(x);
        }

    }
    public static void main(String[] args) {
        int [] arr={1,4,3,2,5,6,7,2,4,3,5};
        findtwoRepeat(arr);
    }
}

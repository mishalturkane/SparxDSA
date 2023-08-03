import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int [] arr,int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr={401,402,403,404,405};
       for(int x:arr){
           System.out.print(x+" ");
       }
        System.out.println();
        System.out.println("Konsa dhundhna hain ");
        int key=kb.nextInt();
        int hain=linearSearch(arr,key);
        if(hain==-1){
            System.out.println("Nhi mili beto chod");
        }
        else System.out.println("Mil gyi bahenchodo:"+hain);
    }
}

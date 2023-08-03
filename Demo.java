import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
       int [] arr=new int[5];
       Scanner kb=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" No :");
            arr[i]=kb.nextInt();
        }
        System.out.println("Here what is you entered");
        for(int x:arr){
            System.out.println(x);
        }
    }
}
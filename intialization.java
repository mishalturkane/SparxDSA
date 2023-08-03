
public class intialization {
    public static void main(String[] args) {
       int [] arr1=new int[5];
       arr1[0]=401;
       arr1[1]=402;
       arr1[2]=403;
       arr1[4]=405;
       System.out.println(arr1[1]); 

        int [] arr2=new int[]{401,402,403,404,405};

        int [] arr3=new int[]{401,402,403,404,405};
        System.out.println("Arrya size is "+arr3.length);


         arr3=new int[]{401,402,403,404,405,406};
        System.out.println("NowArrya size is "+arr3.length);
        for(double x:arr3){
            System.out.println(x);
        }
    }
}

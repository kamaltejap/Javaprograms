package STRINGS;

public class MultiplyArrays {

    public static void main(String args[])
    {
    int [] arr1={5,3,1};
    int [] arr2={1,4};

     int a=Integer.parseInt(arraytoString(arr1));
     int b=Integer.parseInt(arraytoString(arr2));

     
     System.out.println(a*b);

    }
    public static String arraytoString(int[] arr){
    
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);

        }
        return sb.toString();
   
   
}
}
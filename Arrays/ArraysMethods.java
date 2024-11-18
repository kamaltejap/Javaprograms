package Arrays;
import java.util.Arrays;

public class ArraysMethods {
    public static void main(String args[])
    {
        int[] arr1={10,21,2,3};
        int[] arr2={10,5,6,7};
        int[] arr3={8,9,10};
    
        
        int size1=arr1.length;
        int size2=arr2.length;

        //Increasing the size of an array 
         arr1=Arrays.copyOf(arr1,size1+size2);// size=8
         arr2=Arrays.copyOfRange(arr2,0,11);//size=11
        
         //Sorting
        Arrays.sort(arr1);
        //Sorts the specified range of array in ascending order
        Arrays.sort(arr2,0,3);//sorting index 0 to index3



         //Checks if both the arrays are equal or not.
         boolean b=Arrays.equals(arr1,arr2);
         System.out.println("b is "+b);//false


         //Finds and returns the index of the first unmatched element between the two specified arrays.
         int a=Arrays.mismatch(arr1, arr2);
         System.out.println("Mismatched index = " +a);//index 0


         //Assigns this  value(10) to each index of this arrays.
         Arrays.fill(arr1,10);//all i=10 


         //Coverting into String
         String s=Arrays.toString(arr1);
         System.out.println("toString ="+s);

    
    }
}

package Arrays;
import java.util.Arrays;

public class Insertion{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        //insert 100 at index 2
        int index=2;
        int ele=100;

        arr=Arrays.copyOf(arr,arr.length+1);

        for(int i=arr.length-1;i>=2;i--){

            arr[i]=arr[i-1];
        }

        arr[index]=ele;//Reassigning

        for(int i:arr){
            System.out.println(i);
        }

    }
  
}

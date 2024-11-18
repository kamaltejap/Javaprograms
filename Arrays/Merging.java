package Arrays;

import java.util.Arrays;

public class Merging {
    public static void main(String args[]){

        int[] arr1={9,1,2,3,4};
        int[] arr2={5,6,7,8,0};

        int size1=arr1.length;
        int size2=arr1.length;

        arr1=Arrays.copyOf(arr1,size1+size2);

        int j=0;
        for(int i=size1;i<arr1.length;i++){
           
            arr1[i]=arr2[j++];
        }
        //Sorting
        Arrays.sort(arr1);

        for(int i:arr1){
            System.out.print(i+" ");
        }

    }
    
}

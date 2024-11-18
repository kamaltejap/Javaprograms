package Arrays;

import java.nio.channels.Pipe.SourceChannel;

public class AtEvenIndex {
    public static void main(String args[]){
        int[] arr={2,3,4,5,6,7,8};

        int evencnt=0;
        int oddcnt=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            evencnt++;
            else
            oddcnt++;
        }
        int[] even=new int[evencnt];
        int[] odd=new int[oddcnt];
            int j=0;
            int g=0;

        for(int i:arr){
            if(i%2==0){
                even[j++]=i;
            }
            else
                odd[g++]=i;
        }
        System.out.print("Even :");
        for(int i:even){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Odd :");
        for(int i:odd){
            System.out.print(i+" ");
        }
    }
    
}

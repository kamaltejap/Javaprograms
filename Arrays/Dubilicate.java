package Arrays;

public class Dubilicate {
    public static void main(String args[]){

        int[] arr={2,3,4,2,6,7,8,2,4,6,5,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+" ");
                
            }
        }
    }
      
}

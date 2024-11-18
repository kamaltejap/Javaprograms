package Arrays;


public class Sorting {
    public static void main(String args[]){
    
        int[] arr={2,6,7,8,3,5,3,4,6,9};
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
                if(arr[i]<arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                    
                }
            }
        } 
        for(int i:arr){
            System.out.print(i+" ");
        }
        

    }
}


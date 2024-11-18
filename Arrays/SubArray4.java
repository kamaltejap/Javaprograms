package Arrays;

public class SubArray4 {
    public static void main(String args []){

        int [] arr={3,4,-7,1,3,3,1,4};

    

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                
                sum =sum + arr[j];
                if(sum==7){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    
}

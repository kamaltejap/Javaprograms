package Arrays;

public class SumOfPair {
    public static void main(String args[]){
        int[] arr={0,1,2,3,4,5,6,7,2};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){

                    if(arr[i]+arr[j]+arr[k]==10){
                        System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = 10");
                    }
                }
            }
        }

    }
    
}

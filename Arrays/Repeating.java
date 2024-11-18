package Arrays;

public class Repeating {
    public static void main(String args []){
        int [] arr={2,2,2,2,3,3,3,3,1,1,1,1};
        int n=arr.length;
        int ele=0;
        int maxCount=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                
                if(arr[i]==arr[j]){
                    cnt++;
                }
            
            }
            if(cnt>maxCount||cnt==maxCount){
                maxCount=cnt;
                ele=arr[i];

    
            }
        }
        System.out.println("Element is :"+ele+" count is :"+maxCount);




    }
    
}

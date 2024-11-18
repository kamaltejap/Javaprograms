package Arrays;

public class Spairalform {
    public static void main(String args[]){
         int arr[][]={{1,2,3,0},{4,5,6,10},{7,8,9,12},{13,14,15,16}};
        int rows=arr.length;
        int cols=arr[0].length;

         int left=0;
         int right=cols-1;
         int top=0;
         int bottom=rows-1;

         
        while(true){
            if(left>right){
                break;
            }
            else{
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
            }
            top++;
            if(top>bottom){
                break;
            }
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
           

            if(left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;

            if(top>bottom){
                break;
            }
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
            
         }
    }
    
}

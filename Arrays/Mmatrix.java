package Arrays;

public class Mmatrix {
    //Diagonal sum
    public static void mian(String args[]){
        int[][] arr={ {1,2,3}, 
                      {4,5,6},
                      {7,8,9} };
             int sum=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(i==j)                     //for all diagonal if(i==j || i+j==2)
                    {                           //for upper triangle if(i<j)
                        sum=sum+arr[i][j];     //for lower triangle if(i>j)                         
                    }
                }
            }
            System.out.println(sum);
    }
    
}

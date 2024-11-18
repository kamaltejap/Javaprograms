package Arrays;

public class RepeatingMax {
    public static void main(String args[]){
    int [] arr={1,1,1,1,1,2,2,3,3};
        int n=arr.length;


            int max1=0;//Integer.MIN_VALUE;
            int max2=0;
            int max3=0;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++)
            {  
                if(arr[i]==arr[j])
                {
                    cnt++;

                    if(cnt>max3){
                        max3=max2;
                        max2=max1;
                        max1=i;
                        
                    }
                    else if(cnt>max2){
                        max1=max2;
                        max2=i;
                    }
                    else if(cnt>max1){
                        max1=i;
                        
                    }
                }
                
            }
        }
            System.out.println(max1+" "+max2+" "+max3);
            
        
        
        
        
    }
}


    
    


    


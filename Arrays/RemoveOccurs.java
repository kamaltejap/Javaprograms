package Arrays;

public class RemoveOccurs {
        //Removing the element occurence
    public static void main(String args[]){

        int[] arr={1,5,2,3,2,7,8,2,6,8,2};
        int ele=2;

        int[] newarr=new int[arr.length-1];//removing the element
        
        int cnt=0,j=0;
        for(int i:arr){

            if(i==ele){
                cnt++;
            }
            if(i==ele && cnt==2){//cnt = which one you want
                
                continue;
            } 
            newarr[j++] =i;     
        }
                 

        for(int i:newarr){
            System.out.print(i+" ");
        }
    
    }
    
}

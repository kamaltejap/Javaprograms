package Arrays;

public class Segregate {
    public static void main(String args[]){

        int[] arr={0,1,0,0,1,1,1,0,1,0};

        int [] newarr=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                newarr[i++]=arr[i];
            }
        }
            while(j<newarr.length){
                newarr[j++]=1;
            }
        
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
    
}

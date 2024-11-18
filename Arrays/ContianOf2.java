package Arrays;

public class ContianOf2 {
    public static void main(String args[]){

        int n=99;
        for(int i=1;i<n;i++){

            int c=i/10;
            int r=i%10;

            if(r==2||c==2){
        
                System.out.println(i);
            }

        }
    }
    
}

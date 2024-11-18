public class Pattern17 {
    public static void main(String [ ] args){

        int n=4;
      

        for(int i=1;i<=n;i++){
            //sapce
          int l=i;
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           
            for(int k=1;k<=i;k++){
                
                System.out.print(l++);
            }
         int v=6;
            for(int k=i;k>=2;k--){
                
                System.out.print(v--);
                
            }
            
        
            System.out.println();
        }
    }
}

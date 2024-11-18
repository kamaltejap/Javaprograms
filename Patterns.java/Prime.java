public class Prime {
    public static void main(String args[]){
        int n=5;
        int k=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                while(true){
                    boolean flag=true;
                    for(int h=2;h<k;h++) {
                           if(k%h==0){
                            flag=false;
                            break;
                            } 
                        }  
                    if(flag==true){
                         System.out.print(k+" ");
                            k++;
                            break;
                    }
                    else
                        k++;
                            
                     }
                }
            
            System.out.println();
            }
      }
    }


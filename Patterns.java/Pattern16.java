public class Pattern16 {
public static void main(String args[]){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
              if(i==n ||i==1 ||j==1){
                System.out.print(n +" ");
              }
         }
        for(int j=2;j<=n-1;j++){
              if(i==n-1||i==2||j==2){
                System.out.print(n-1+" ");
              }
        }
  
        System.out.println();
    }
}

}

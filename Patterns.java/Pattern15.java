public class Pattern15 {
    public static void main(String args[]){
        int n =  5;
        //for Up side
        for(int i=1;i<=n;i++){
            //space
           for(int j=1;j<=n-i;j++){
            System.out.print("- ");
           }
           for(int j=n-i+1;j<=n;j++){
            System.out.print(j+" ");
           }
           System.out.println();
        }
    }
}

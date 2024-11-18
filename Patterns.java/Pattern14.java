public class Pattern14 {
           //Rotated Triangle
    public static void main(String argss[]){
        int n=5;
         //for UP side
        for(int i=1;i<=n;i++){
            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print("- ");
            }
            //Up side
            for(int j=n;j>n-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //for Down side
        for(int i=n;i>=1;i--){
            //Space
            for(int j=n;j>=i;j--){
                System.out.print("- ");
            }
            //Down side
            for(int j=n;j>n-i+1;j--){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
}

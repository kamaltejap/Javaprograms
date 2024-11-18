public class Pattern10 {

            //Butterfly Pattern
    public static void main(String args []){
        int n=4;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("- ");
            }
            for(int h=i;h>=1;h--){
                System.out.print(h+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("- ");
            }
            for(int h=i;h>=1;h--){
                System.out.print(h+" ");
            }
            System.out.println();
        }
    }
}

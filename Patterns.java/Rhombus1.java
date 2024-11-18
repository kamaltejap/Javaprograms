public class Rhombus1 {
    public static void main(String args[]){
        int n =  7;
        //for Up side
        for(int i=1;i<=n;i++){
            //space
           for(int j=n;j>=1;j--){
           
            if(i==j||i+j==5){
                System.out.print("* ");
            }
            else
            System.out.print("  ");
           }
         System.out.println();
        }        

    }
}

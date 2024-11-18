public class Rhombus {
    public static void main(String args[]){
        int n=4;
            //upper
        for(int i=1;i<=4;i++){

              //1st
            for(int j=1;j<=4;j++){
               
                if(i+j==5)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=2;j<=4;j++){
                if(i==j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
         }
        //lower
        for(int i=3;i>=1;i--){

            //1st
          for(int j=1;j<=3;j++){
             
              if(i+j==5)
              System.out.print("* ");
              else
              System.out.print("  ");
          }
          for(int j=1;j<=3;j++){
              if(i==j)
              System.out.print("* ");
              else
              System.out.print("  ");
          }
          System.out.println();
       }
       
        }

    }
    


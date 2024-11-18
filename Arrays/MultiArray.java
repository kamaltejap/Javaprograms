package Arrays;

public class MultiArray {
    public static void main(String[] args){
        int num[][] = new int[3][4];

         for(int i=0;i<num.length;i++)
         {
            for(int j=0;j < num[i].length;j++)
            {
                num[i][j] = (int) (Math.random() * 10);
                System.out.print(num[i][j] +" ");

            }
            System.out.println();
         }
        System.out.print("From for each loop");
        System.out.println();
       for (int n[] :num)
       {
            for(int m :n)
            {
                m =(int) (Math.random() * 10);
                System.out.print(m +" ");
            }
        System.out.println();
       } 
    }
    
}

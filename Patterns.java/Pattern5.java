public class Pattern5 {
    //Rotated Inverted Half Pyramid
    public static void main(String[] args){
        int n = 5;

        for(int i=1;i<=n;i++){
            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");//remove 'a' here...
            }
            //Right side
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
            }
            
        System.out.println("");
        }
    }
}

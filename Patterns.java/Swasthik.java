public class Swasthik {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                int g=(i+j)/2;
                
                if(i==3||j==3||(i>=g&&j==n)||(j<g&&i==n)||(j>=g&&j==1)||(i<g&&i==1)){
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

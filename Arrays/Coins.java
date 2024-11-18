package Arrays;

public class Coins {
   
     public static void main(String args[]){
                int[] demnt={1,2,5,10};
                int amt=86;

                //Caller method
                int[] res=mincoins(demnt,amt);
                for(int i=0;i<res.length;i++){
                    if(res[i]>0)
                    System.out.println(res[i]+" coins of "+demnt[i]+" rupee");
                }

    }
    //Callie method
    public static int[] mincoins(int[] demnt,int amt){

        int[] coinsarr=new int[demnt.length];
    

        for(int i=demnt.length-1;i>=0;i--){
            coinsarr[i]=amt/demnt[i];
            amt=amt%demnt[i];
        }
        return coinsarr;

    }
}
package Arrays;

public class Max3Num {
    public static void main(String args[])
    {
        int[ ] arr={3,4,2,4,1,7,8,9,6};

        int max1=0;//Integer.MIN_VALUE;
        int max2=0;
        int max3=0;
        for(int i:arr){
            if(i>max1){
                max3=max2;
                max2=max1;
                max1=i;
            }
            else if(i>max2){
                max3=max2;
                max2=i;
            }
            else if(i>max3){
                max3=i;
            }
        }
        System.out.println(max1+","+max2+","+max3);
    }
    
}

package Arrays;

public class LeastNum {
    public static void main(String args[]){
        int[ ] arr={3,5,6,7,5};

        int small=arr[0];
        for(int i:arr){
            if(i<small)//(i>big)
                small=i;
        }
        System.out.println(small);
    }
    
}

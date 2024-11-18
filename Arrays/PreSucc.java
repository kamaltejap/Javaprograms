package Arrays;

public class PreSucc {
    public static void main(String args[]){
        int[] arr={1,3,20,4,75,0,90};

            //0 index
            if(arr[0]>arr[1])
                System.out.println(arr[0]);
            //middele numbers
            for(int i=1;i<arr.length-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    System.out.println(arr[i]);
                }
            }
            //last index
            if(arr.length-1>arr.length-2)
            System.out.println(arr[arr.length-1]);
    }
}


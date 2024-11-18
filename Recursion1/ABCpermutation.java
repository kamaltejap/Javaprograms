package Recursion1;

public class ABCpermutation {
    public static void main(String args[]){
    
        String s="ABC";

        permutation(s.toCharArray(),0);
    }
    public static void permutation(char[] arr,int fi)
    {
        if(fi==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=fi;i<arr.length;i++){
         
            swapping(arr,fi,i);
            permutation(arr,fi+1);
            swapping(arr,fi,i);//for return keyword,we get reverse order

        }
    }
    public static void swapping(char[] arr,int fi,int i){
        char temp=arr[fi];
        arr[fi]=arr[i];
        arr[i]=temp;
    }
    
}



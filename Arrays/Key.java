package Arrays;
import java.util.Scanner;

public class Key {
    public static void main(String args[]){
    
        int [] arr={1,2,6,7,8,9};
        
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
    
        for(int i=0;i<arr.length-key+1;i++)
        {
            int max=0;
           
            for(int j=i;j<key+i;j++)
            {
                    if(arr[j]>max){
                      max=arr[j];
                    }
            }
             System.out.print(max+" ");
             
        }
           System.out.println();
        } 
    }
    


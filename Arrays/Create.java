package Arrays;

public class Create {
    public static void main(String[] args)
    {
        int [] num = new int[4];//mention no.of elements
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        System.out.println(num.length);
        // num[3] == 0 which is default value
        for(int i=0;i<num.length;i++)
        {
        System.out.print(num[i]+" ");
        }



    }
    
}

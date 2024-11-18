class Swapping{

    public static void main(String[] args){

        int a=2, b=3;
        //case1
        int c=a;
        a=b;
        b=c;
        System.out.println(a+","+b); 
        
        //case2
         a=a+b;
         b=a-b;
         a=a-b;

         //case3 right to left
         a = a+b -(a=b);

         //case4
         a = a*b;
         b = a/b;
         a = a/b;

         //case 5
          a = a^b;
          b = a^b;
          a = a^b;

         
    }
}
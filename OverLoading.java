public class OverLoading
{
    int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    int add(int n1, int n2)
    {
        return n1 + n2 ;
    }
    int add(int n1, int n2, int n3,int n4)
    {
        return n1 + n2 + n3 +n4;
    }
    /* we can write same method name for different no.of parameters,
       But we can't write in different types of parameters this is called method OverLoading*/
    // double add(double n1 + int n2)
    // {
    //     return n1 + n2;
    // }
    public static void main(String[] args){

        OverLoading obj = new OverLoading();
        int res =obj.add(3,4,5);
        System.out.println(res);
    }
}

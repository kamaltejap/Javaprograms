public class Count {
    public static void main(String[] args){
        int n=12345;
        int count=0;
        int even_count=0;
        int odd_count=0;
        int t=n;
        while(t>0){
            t=t/10;
            count++;

        }
        System.out.println("count is : "+count);
        while(n>0){
            int rem =n%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            n=n/10;
        }
        System.out.println("even_count : "+even_count);
        System.out.println("odd_count : "+odd_count);  
        
    }
}
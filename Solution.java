import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            int res=i*N;
            System.out.println(N+" X "+i +" = " + res);
        }
    

        bufferedReader.close();
    }
}
 


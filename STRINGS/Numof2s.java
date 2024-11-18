package STRINGS;

public abstract class Numof2s {
    public static void main(String args[]){
        int num=22;

        StringBuffer sb= new StringBuffer();

        for(int i=1;i<=num;i++){
            sb.append(i);
        }
        int cnt=0;
        for(int i=0;i<sb.length();i++){
            int n=Character.getNumericValue(sb.charAt(i));

            if(n==2){
                cnt++;
            }
        }
        System.out.println(cnt);
        
}
}

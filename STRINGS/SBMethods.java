package STRINGS;

public class SBMethods {
    public static void main(String args[]){
        String str="Hello";

        StringBuffer sb=new StringBuffer();

         sb.append(str);//Hello
         System.out.println(sb.capacity());//16
         
         System.out.println(sb.charAt(0));

         sb.reverse().toString();//olleH

         sb.deleteCharAt(2);//oleH

         sb.insert(1,"java");//ojavaleH
         
         sb.setLength(30);//capacity=30

         sb.ensureCapacity(100);

         sb.replace(1,3,"kamal");//okamalvaleH

         String sub=sb.substring(1,5);//kama
         System.out.println(sub);

        String seq=sb.subSequence(2,5).toString();//ama
        System.out.println(seq);

        sb.reverse();
        System.out.println(sb);    
    }
    
}

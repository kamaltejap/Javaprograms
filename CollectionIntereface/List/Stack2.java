package CollectionIntereface.List;
import java.util.*;
public class Stack2 {
    public static void main(String args[]){

        String str="{[()]}";

        //caller method
        if(isBalanced(str))
            System.out.println(("It is balanced String"));
        else
            System.out.println("It is not balanced String");
    }
        //callie method
	public static boolean isBalanced(String str)
    {
        Stack<Character> s= new Stack<Character>();

        for(int i=0;i<str.length();i++){  
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                s.push(ch);
            }
            else if(ch==')'&& !s.isEmpty() &&s.peek()=='('){
                s.pop();
            }
            else if(ch==']'&& !s.isEmpty()&& s.peek()=='['){
                s.pop();
            }
            else if(ch=='}'&& !s.isEmpty()&& s.peek()=='{'){
                s.pop();
            }
        }
        System.out.println(s);
    
        return s.isEmpty();
    }
}

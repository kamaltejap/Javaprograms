package CollectionIntereface.List;
import  java.util.*;

public class Stack1 {
    public static void main(String args[] ){
       /*
        It is a child class of Vector class.
        If we depend upon Last In First Out order then we need to use Stack.
        1) push(E)	: It is used to push the element to stack.
        2) pop() : It is used to pop toppest element from stack.    
        3) peek() : It will return toppest element of stack.
        4) isEmpty() : It will check stack is empty or not.
        5) search(Object o) : It will return offset value if element is found otherwise it will return -1.
        */ 

        Stack<String> s=new Stack<String>();

        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);

        s.pop();
        System.out.println(s);//remove top ele C

        System.out.println(s.peek());//B

        System.out.println(s.isEmpty());//false

        System.out.println(s.search("Z"));//-1
        System.out.println(s.search("A"));//2
    }
    
}
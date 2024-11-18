package CollectionIntereface;

public class Comparable1 {
    /*
    Comparable is an interface which is present in java.lang package.
    Comparable interface contains only one method i.e compareTo() method.
    If we depend upon default natural sorting order then we need to use Comparable interface.
ex:
		obj1.compareTo(obj2)
		It returns -ve if obj1 comes before obj2 
		It returns +ve if obj1 comes after obj2
		it returns 0 if both objects are same
     */
    public static void main(String[] args) 
	{
		System.out.println("A".compareTo("Z"));// -25 
		
		System.out.println("Z".compareTo("A")); // 25
		
		System.out.println("K".compareTo("K")); // 0
	}

}

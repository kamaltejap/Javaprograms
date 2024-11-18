package OOPS.Inheritance;
/*
 Has-A relationship is also known as composition and aggregation.There is no specific keyword to implements Has-A relationship but mostly we will use new operator.
The main objective of Has-A relationship is to provide reusability
Has-A relationship will increase dependency between two components.
 */
class Ihub 
{
	public String courseName()
	{
		return "Full Stack Java + AWS";
	}
	public double courseFee()
	{
		return 30000d;
	}
	public String trainerName()
	{
		return "Niyaz Sir";
	}
}
class Usha 
{
	public void getCourseDetails()
	{
		Ihub i=new Ihub();
		System.out.println("Course Name :"+i.courseName());
		System.out.println("Course Fee :"+i.courseFee());
		System.out.println("Trainer Name :"+i.trainerName());
	}
}
public class HasARelation//Student
{
	public static void main(String[] args)
	{
		Usha u=new Usha();
		u.getCourseDetails();
	}
/*
 * composition
============
Without existing container object there is no chance of having contained object then the 
relationship between container and contained object is called composition which is strongly association.
aggregation
============
Without existing container object there is a chance of having contained object then the 
relationship between container and contained object is called aggregation which is loosely association.
 */

    
}

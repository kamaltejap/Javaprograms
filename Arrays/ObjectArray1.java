package Arrays;
public class ObjectArray1
 {
   String name;
   int rollno;
   int marks;
   public static void main(String[] args)
   { 
    ObjectArray1 s1 = new ObjectArray1();
    s1.name = "kamal";
    s1.rollno= 23;
    s1.marks=90;
    System.out.println("s1=" + s1);

    ObjectArray1 s2 = new ObjectArray1();
    s2.name = "kam";
    s2.rollno = 24;
    s2.marks = 91;
     
    ObjectArray1 s3 = new ObjectArray1();
    s3.name = "teja";
    s3.rollno = 25;
    s3.marks =98;
    
    ObjectArray1 students[] = new ObjectArray1[3];
// it is an array ,not object
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(int i=0;i<students.length;i++)
    {
        System.out.println(s1.name + ":"+s1.marks);
        System.out.println(students[i].name + ":" + students[i].marks);
    }
    for(ObjectArray1 stud : students)
    {
        System.out.println(stud.name+":"+stud.rollno);
    }
   }
}
  
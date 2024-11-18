package ENUMclass;
/*
Enum is a group of named constants.
Enum concept introduced in 1.5 version.
Using enum we can create our own datatype called enumerated datatype.
When compare to old language enum, java enum is more powerful.
To declare the enum we will use enum keyword.
 */
enum Months{
    JAN,FEB,MAR,APR,MAY
}
// //Means
// final class Months extends java.lang.Enum{
//     public static final Moths JAN=new Months();
//     public static final Moths FEB=new Months();
//     public static final Moths MAR=new Months();
// }


public class InternalImplmt {
    public static void main(String args[]){

        Months m=Months.FEB;
        System.out.println(m);//FEB
        
        //.values()&.ordinal() are present java.lang.Enum class
        Months[] marr=Months.values();

        for(Months i:marr)
        {
            System.out.println(i+"---"+i.ordinal());

        }
    } 
}

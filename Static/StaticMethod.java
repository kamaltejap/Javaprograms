package Static;

public class StaticMethod {
    String brand;
    int price;
    static String name;
    public static void show(StaticMethod jk)//it requires object
    {
        System.out.println(jk.brand+":"+jk.price+":"+name);
    //note: name will print "note10" because last obj2 changed
    
    }
        public static void main(String[] args){
            StaticMethod obj1=new StaticMethod();
            obj1.brand="vivo";
            obj1.price=100;
            obj1.name="Z1pro";
            
            StaticMethod obj2 =new StaticMethod();
            obj2.brand="redme";
            obj2.price=150;
            obj2.name="note10";

          //StaticMethod.name="phone";
            StaticMethod.show(obj1);
            StaticMethod.show(obj2);
        }
}


    


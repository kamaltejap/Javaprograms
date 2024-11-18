package ENUMclass;
//If we declare any variables,mathods and onstructors in 
//enum class then we will put the  semicolon to constants 
enum Weeks{
    MON,TUE,WED,THU; //put semicolon

    Weeks(){
        System.out.println("Constructor");
    }
}
public class Constructor2 {
    public static void main(String args[]){

        Weeks W=Weeks.MON;//Constructor will execute no.of constants times
    }
    
}

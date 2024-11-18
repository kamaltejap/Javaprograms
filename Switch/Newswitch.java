package Switch;

public class Newswitch {
    public static void main(String[] args)
    {
         // It support only in java14
        // String day="Sunday";
        // switch (day) {
        //     case "Monday" -> System.out.println("Monday");
        //     case "Tuesday" -> System.out.println("Tuesday");
        //     default -> System.out.println("Sunday");


        String day = "Sunday";
        String result = "";
        result = Switch(day)
        {
            case :"Monday" -> "Monday";
            case "tuesday" -> "tuesday";
            default -> "Sunday";
            System.out.println(result)
        }
        }
}

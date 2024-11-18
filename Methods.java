public class Methods 
{
    public void playMusic()
    {
        System.out.println("Playing Music");

    }
    String getMeaPen(int cost)  //mention what type of data we want to return
    {
        if(cost>=10)
            return "Pen";
        return "Not pen";
    }
    public static void main(String[] args)
    {
        Methods obj = new Methods();
        obj.playMusic();
        String str = obj.getMeaPen(10);
        System.out.println(str);
    }
    
}

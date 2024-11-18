package ENUMclass;

enum  EnumClass {
    COTTON,SILK,KHADI;//put semicolon

    static int i=10;
    public static void main(String args[]){

        System.out.println(i);
    
        EnumClass s =EnumClass.COTTON;

        switch(s){
            case COTTON : System.out.println("cotton");break;
            case SILK : System.out.println("silk");break;
            case KHADI : System.out.println("khadi");break; 
        }
    }
    
}

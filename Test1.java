class Test1
{
     int i=10;
	public static void main(String[] args)
     {
          int[ ] arr={1,2,3,4};
          int n=2;

          for(int i=0;i<4;i++){
               for(int k=0;k<4;k++){
                    if(1<2){
                         int temp=arr[i];
                         arr[i]=arr[k];
                         arr[k]=temp;
                         
                       }        }  
          }
          for(int j:arr){
               System.out.println(j);
          }
     }
}
class Looping6
{
    public static void main(String arg[])
    {
         int i;
         i=1;
         System.out.println("A");
         while(i<4) 
         {
            System.out.println("B");
            i++;
            break;
          }
          System.out.println("D");
          System.out.println(i);
          
    }
}
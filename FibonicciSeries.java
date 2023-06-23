
package practiceextraquestions;


public class FibonicciSeries {
    public static void fibonicciSeries(int size,int maxNumber)
    {
        int x=1,y=0,z=1;
         System.out.println("0");
       while(z<maxNumber)
       {
        x=y;
        y=z;
        z=x+y;
           
           System.out.println(z);
           size++;
       
       }
       }
    public static void tribonicciSeries(int size)
    {
        int pre=0;
        int curr=1;
        int next=2;
        int sum=0;
        System.out.println(pre);
        System.out.println(curr);
        System.out.println(next);
      while(size>=1)
      {
          sum=pre+curr+next;
          System.out.println(sum);
         pre=curr;
         curr=next;
         next=sum;
         size--;
         
      }
       }
     public static void quadrinicciSeries(int size)
    {
        int doublepre=0;
        int pre=1;
        int curr=2;
        int next=3;
        int sum=0;
        System.out.println(doublepre);
        System.out.println(pre);
        System.out.println(curr);
        System.out.println(next);
      while(size>=1)
      {
          sum=doublepre+pre+curr+next;
          System.out.println(sum);
         doublepre=pre;
         pre=curr;
         curr=next;
         next=sum;
         size--;
         
      }
       }
   
       
     public static void main(String [] args)
     {
         fibonicciSeries(10,20);
         System.out.println("Tribonicci");
         tribonicciSeries(20);
         System.out.println("Quadrinicci");
         quadrinicciSeries(20);
    }
    
     
}

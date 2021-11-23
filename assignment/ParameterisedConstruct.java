
class Box
{
    int h,l,b;
    Box(int height,int length,int breadth)
    {
        
        h=height;
        l=length;
        b=breadth;
    }
    double volume()
    {
        return(l*b*h);
        
    }
}
public class ParameterisedConstruct
{
   public static void main(String args[])
   {
       Box b = new Box(5,4,3);
       System.out.println("The volume is "+ b.volume());
   }
}





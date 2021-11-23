
class Overload
{
    void getdata()
    {
        System.out.println("no parameters");
    }
    void getdata(int a)
    {
        System.out.println("takes one parameter"+a);
    }
    void getdata(double b)
    {
        System.out.println("takes one double valued parameter"+b);
    }
    void getdata(int a,int b)
    {
        System.out.println("takes two parameters"+a+b);
    }
}
    class OverloadFunc
    {
        
     public static void main(String args[]) 

        {
            Overload obj=new Overload();
            obj.getdata();
            obj.getdata(5);
            obj.getdata(3,2);
            obj.getdata(8.5);
            
        }
    }

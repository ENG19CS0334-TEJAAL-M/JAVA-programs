class A
{
    void getinput(int a)
    {
        System.out.println("the parent class a value= "+a);
    }
   
}
class B extends A
{
  
    void getinput(int a)
    {
       
        System.out.println("the child class value ="+a);
    }
}
class Overridefunc
{
    public static void main(String args[])
    {
        A obj=new A();
        B obj1=new B();
        obj.getinput(5);
        obj1.getinput(4);
     
        }
}
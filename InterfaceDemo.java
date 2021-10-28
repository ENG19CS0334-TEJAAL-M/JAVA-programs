//two ways of creating threads in java
/*****
by extendidng thread class
interface display
{
	public void print();
}
class InterfaceDemo implements display
{
	public void print()
	{
		System.out.println("Java Programming");
	}
	public static void main(String args[])
	{
		InterfaceDemo obj=new InterfaceDemo();
		obj.print();
	}
}

**/
//by implementing runnable interface
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		A ob=new A();
		Thread t=new Thread(ob);
		t.start();
}
}


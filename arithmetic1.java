class Arithmetic
{
	int a,b,c,d;//instance variables
	//they get their default values
	void setmethod()
	{
		a=2;
		b=3;
		c=4;
		d=5;
	}
	//take values from user
	void setmethodgeneral(int p,int q,int r,int s)//formal parameters
	{
	a=p;
	b=q;
	c=r;
	d=s;
	}
	void display()
	{
	System.out.println("Assignment through methods \n"+a+"\t"+b+"\t"+c+"\t"+d);
	}
//==============================
	int u,v,w,z;
	void func(int x,int y)//formal parameters
	{
		 u=x+y;
		 v=x-y;
		 w=x*y;
		 z=x/y;
	}
	void getoutput()
	{
	System.out.println("sum= "+u+"\t difference= "+v+"\t multiplication= "+w+"\t division= "+z );
	}
}
class arithmetic1
//save the file where the main method is declared only where the jvm starts its execution
{
	public static void main(String args[])
	{
		Arithmetic obj1=new Arithmetic();
		//object creation creating using the classname
		obj1.a=25;
		obj1.b=20;
		obj1.c=15;
		obj1.d=10;
		System.out.println("a="+obj1.a +" b="+ obj1.b+ " c="+obj1.c+" d="+obj1.d);

//================================
//create another object to access through methods the variables of the class Arithmetic

	Arithmetic obj2=new Arithmetic();
	obj2.setmethod();
	obj2.display();
//===========================
//passing parameters through the object created
	Arithmetic obj3=new Arithmetic();
	obj3.setmethodgeneral(11,12,13,14);
	obj3.display();

	Arithmetic obj4=new Arithmetic();
	obj4.setmethodgeneral(10,20,30,40);
	obj4.display();
//=======================================
//Create a function of addition subtraction multiplication division

	Arithmetic obj5=new Arithmetic();
	obj5.func(4,2);
	obj5.getoutput();
	}
}
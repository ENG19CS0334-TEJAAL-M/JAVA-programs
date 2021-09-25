class Arithmetic
{
	static int a,b,c,d;//to access members of static method
	//instance variables
	//they get their default values.The static variables are created or initialized when the class loads into JVM.


	public static void main(String args[])
{
    
System.out.println("the default values of instance variables are \n" +a+" "+b+" "+c+" "+d);

}}
/**
Local variables do not get default values. Their initial values are undefined with out assigning values by some means. Before you can use local variables they must be initialized.

If you declare a field at class level they get default values according to their type. If you declare a variable at method level or as a block (means anycode inside {}) do not get any values and remain undefined until somehow they get some starting values ie some values assigned to them.
********/
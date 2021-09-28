class BasicMath
{
	public static void main(String args[])
	//made public so that main function can be accesed outside the class
	//made  static so that main function is to be called without creating objects 
	//void so that main function returns no value

	{	
		int a=4;
	        int b=2;
		System.out.println("The sum is "+(a+b));
		System.out.println("The difference is "+(a-b));
		System.out.println("The product is "+a*b);
		System.out.println("The quotient is "+a/b);
		System.out.println("The remainder is "+a%b);
		System.out.println("the use of shorthand "+(a+=3));
		System.out.println("The use of shorthand "+(a+=b));
	}
}


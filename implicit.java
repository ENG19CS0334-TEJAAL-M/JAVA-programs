public  class implicit
{public static void main(String args[])
{
	byte b=10;
	short s=100,sh;
	int i=5,ii,in;
	long l=1000,lo;
	float ff=12.1f,f;
	double d=122.234;
	char ch='a';
	boolean bool= true;
	

	sh=b; //short stores in byte implicit conversion
	in=s; //converting short to int
	lo=i; //convering int to long
	f=l; //long to float
        d=ff; //float to double
	ii=ch; //character to integer
	System.out.println("the implicit conerted values are " +sh+" "+in+" " +lo+" "+f+" "+d+" "+ii);
}
}

	
	
	
	
	
	
	
	



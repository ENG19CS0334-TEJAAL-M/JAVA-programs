class MinMax
{
	public static void main(String args[])
	{
		int min=0,max=0;
		for(int i=0;i<args.length;i++)
		{
			int n=Integer.parseInt(args[i]);
			if(n>max)
			{
				max=n;
			}
			if(n<min)
			{
				min=n;
			}
			
		}
			System.out.println("Maximum value is "+max);
			System.out.println("Minimum value is "+min);


	}
}
			
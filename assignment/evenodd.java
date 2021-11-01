/*Write a program to print the sum and average of the even and odd numbers separately given
on command line argument.**/
public class Main
{
  public static void main (String args[])
  {
    int osum = 0, esum = 0, ecount = 1, ocount = 1;
    float oavg = 0f, eavg = 0f;
    for (int j = 0; j < args.length; j++)
      {
	int i = Integer.parseInt (args[j]);

	if (i % 2 == 0)
	  {
	    esum = esum + i;
	    ecount++;
	  }
	else
	  {
	    osum = osum + i;
	    ocount++;
	  }
      }
    eavg = esum / ecount;
    oavg = osum / ocount;
    System.out.println (" even number sum= " + esum + " average= " + eavg);
    System.out.println ("odd number sum= " + osum + " average= " + oavg);

  }
}

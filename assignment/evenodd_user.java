
import java.util.Scanner;


public class Main
{

  public static void main (String[]args)
  {
    int ecount = 0, ocount = 0, esum = 0, osum = 0;
    float eavg = 0f, oavg = 0f;

    Scanner in = new Scanner (System.in);

      System.out.println ("How many numbers");
    int n = in.nextInt ();

    for (int i = 1; i <= n; i++)
      {
          int j=in.nextInt();


	if (j % 2 == 0)
	  {
	    
	    System.out.println ("The number is even \n");
	    esum = esum + j;
        ecount++;
	  }
	else
	  {
	    
	    System.out.println ("The number is odd \n");
	    osum = osum + j;
        ocount++;
	  }
      }

    eavg=esum/ecount;
    oavg=osum/ocount;
    System.out.println ("THe sum and average of even numbers= " + esum  + " "+eavg);
    System.out.println ("THe sum and average of odd numbers= " + osum +" "+ oavg);
  }
}

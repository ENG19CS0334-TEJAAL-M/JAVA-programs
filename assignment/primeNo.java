/**8.Write a program to print prime numbers between 1-200.**/
public class Main
{
  void prime ()
  {
    for (int i = 1; i < 200; i++)
      {
	if (i % 2 != 0)
	  System.out.print (i + "\t");

      }
  }
  public static void main (String[]args)
  {
    Main obj = new Main ();
    obj.prime ();
  }
}

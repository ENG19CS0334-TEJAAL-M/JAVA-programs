public class Main
{
  int fact = 1, i;
  int factorial ()
  {
    for (i = 1; i <= 5; i++)
      {
	fact = i * fact;
      }
    return fact;
  }
  public static void main (String[]args)
  {
    Main f = new Main ();
    System.out.println ("factorial = " + f.factorial ());
  }
}

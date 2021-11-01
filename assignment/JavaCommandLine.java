
 /*******A command-line argument is 
the information that directly follows the program’s name on the command line when it is 
executed. To access the command-line arguments inside a Java program is quite easy—they 
are stored as strings in a String array passed to the args parameter of main( ). The first 
command-line argument is stored at args[0], the second at args[1], and so on. For example, 
the following program displays all of the command-line arguments that it is called with:
// Display all command-line arguments.
class CommandLine {
 public static void main(String args[]) {
 for(int i=0; i<args.length; i++)
 System.out.println("args[" + i + "]: " +
 args[i]);
 }
}
Try executing this program, as shown here:
java CommandLine this is a test 100 -1
When you do, you will see the following output:
 args[0]: this
 args[1]: is
 args[2]: a
 args[3]: test
 args[4]: 100
 args[5]: -1
 -------------------------------------------------------------------------------************/


class NewThread implements Runnable 
{
 Thread tejthread;
 String tname;
 NewThread(String name) 
 {
  tname = name;
 }
 
 public void run() {
     
  System.out.println("Thread running"+" "+ tname);
   System.out.println(tname);
   try 
   {
    Thread.sleep(1000);
   } 
   catch (InterruptedException e)
   {
    System.out.println(e);
   }
  
 }
 public void start() {
  System.out.println("Thread started"+" "+tname);
  
  if (tejthread == null) 
  {
   tejthread = new Thread(this, tname);
   tejthread.start();
  }
 }
}
public class HiHello
{
 public static void main(String[] args) {

  NewThread t1 = new NewThread("Hi");
  t1.start();
  NewThread t2 = new NewThread("Hello");
  t2.start();
 }
}
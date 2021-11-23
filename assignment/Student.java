
class Student
{
    	int r;
	int id;
   
    Student(int rollno,int classid)
    {
        r=rollno;
        id=classid;
        
    }
    boolean isEqual()
    {
        if(r==id)
	{
            return true;
	}
        else
	{
        return false;
	}
    }
    public static void main(String args[])
    {
        Student s1=new Student(4,9);
        Student s2=new Student(7,7);
        System.out.println("for case 1 "+s1.isEqual());
        System.out.println("for case 2 "+s2.isEqual());
        
    }
}
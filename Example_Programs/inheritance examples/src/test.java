class parent
{
	parent()
	{
		System.out.println("Parent Constructor");
	} 
	void eat()
	{
		System.out.println("eating...");
		}  
}
class child extends parent
{
	child()
	{
		System.out.println("child constructor");
	}
	void eat()
	{
		System.out.println("eating bread...");
	}
}
	public class test
	{
		public static void main(String[] args)
		{
			child c=new child();
		}
		
	} 
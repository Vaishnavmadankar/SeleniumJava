package SeleniumJavaProject.SeleniumJava;

public class Static_Method 
{
	
	static int deep=12;
	
	public void increament() 
	{
		deep=deep+1;
	}

	public static void main(String[] args) {
		
		// First Object//
		Static_Method Obj1=new Static_Method();
		Obj1.increament();
		System.out.println("Static values execution");
		System.out.println(Obj1.deep);
		
		// Second Object//
				Static_Method Obj2=new Static_Method();
				Obj2.increament();
				System.out.println("Static values execution");
				System.out.println(Obj2.deep);
				
				// Third Object//
				Static_Method Obj3=new Static_Method();
				Obj3.increament();
				System.out.println("Static values execution");
				System.out.println(Obj3.deep);
	}
	
}

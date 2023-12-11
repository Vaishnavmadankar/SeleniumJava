package SeleniumJavaProject.SeleniumJava;

public class Stringpalindrome 
{
   public static void main(String[] args) 
   {
	String S1="ABBA", reverseS1="";
    
	int Strlenght =S1.length();
	
	for (int i = Strlenght-1; i >= 0; --i) 
	{
		reverseS1=reverseS1 + S1.charAt(i);
	}
	
	if (S1.toLowerCase().equals(reverseS1.toLowerCase())) 
	{
	 System.out.println(S1 +" Is a Palindrome String");	
	}
	else 
	{
	System.out.println(S1 +" Is not a Palindrome String");	
	}
	
	
   }  
   
   

}

class ReverseOfString
{
	public static void main(String[] args)
	{
	String name= "jaiShreeRam" , rev="";
         
	
		for(int i = name.length()-1; i>=0; i--)	
		{
			rev=rev + name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("Palindrome"); 
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}


}
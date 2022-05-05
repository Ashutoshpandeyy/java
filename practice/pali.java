class pali
{
	public static void main (String [] args)
	{
		int n=454,sm=0;
		int temp=n;
		while(n!=0)
		{
			int rem =n%10;
			sm=sm*10+rem;

			n=n/10;
		}
		if(temp==sm)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	} 
}
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "sees", rev="";
		b
		for(int i=name.length()-1; i>=0; i--)
		{
			rev= rev + name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println(name+ " is palindrome string");
		}
		else
		{
			System.out.println(name+ " is not palindrome string");
		}
		

	}

}

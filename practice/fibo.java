class fibo{
	public static void main(String[] args)
	{
		int n =5;
		int a=0,b=1;
		while(n>0){
			System.out.print(a +" ");
			int temp=a+b;
			a=b;
			b=temp;
			n--;
		}
	}
}
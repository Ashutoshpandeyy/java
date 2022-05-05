class SelectionSort
{
	public static void main(String[] args)
	{
		int[] a={5,3,4,7,9,45};
		int temp = 0;
		for(int i = 0; i<a.length; i++)
		{
			int min=i;
			for(int j= 0; j<a.length; j++)
			{
				if(a[j]>a[min])
				{
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i =0; i <a.length; i++)
		{
			System.out.print(a[i] + " " );
		}


	}


}
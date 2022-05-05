class LinearSearch{
	public static void main(String[] args){
	
	int[] a = {2,4,5,6,7,9,10,13,65,45};
	int srch = 9, temp=0;
	
	for(int i =0; i<a.length-1; i++){
		if(a[i]==srch){
			System.out.println("element is present at " + i + " index position");
			temp = temp+1;
		}

	}
	if(temp==0)
	{
		System.out.println("Element is not found ");
	}

	}

}
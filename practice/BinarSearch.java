class BinarSearch{
	public static void main(String[] args){
		int[] a = {1,2,5,7,8,34,37,38,56,76};
                int srch = 55;
		int lowIndex = 0;
		int hiIndex = a.length - 1;
		int midIndex = (lowIndex+hiIndex)/2;

		while(lowIndex <= hiIndex){

			if(a[midIndex]==srch){

				System.out.println("Element is at " + midIndex + "Index Position");
				break;
			}

			else if(a[midIndex] < srch){

				lowIndex=midIndex+1;
			}

			else{
				hiIndex = midIndex - 1;
			}

			midIndex = (lowIndex+hiIndex)/2;
			
		}
		if(lowIndex > hiIndex){
			System.out.println("Element is not found");
		}
			
	}
}
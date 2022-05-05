import java.util.Scanner;

class palindrom {
	public static void main(String[] args) {
		int no, rem, product, sum = 0;
		int temp;
		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		temp = no;
		while (no != 0) {
			rem = no % 10;
			product = rem * rem * rem;
			sum = sum + product;
			no = no / 10;
		}
		no = temp;
		if (sum == no) {
			System.out.println(no + " is palindrome ");
		} else {
			System.out.println(no + " is not palindrome ");
		}

		sc.close();
	}

}

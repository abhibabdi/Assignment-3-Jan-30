import java.util.Scanner;
class StringCharCheck{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter the String : ");

		String str = scan.nextLine();
		
		System.out.println("Enter the character to find : ");
	
		char find = scan.next().charAt(0);

		System.out.println("Enter the position to find : ");

		int pos = scan.nextInt();

		if (str.charAt(pos) == find)
		{
			System.out.println("Character  "+str.charAt(pos)+" found at position "+pos);
		}
		else
		{
			System.out.println("Character  "+str.charAt(pos)+" not found at position "+pos);
		}

	}
}

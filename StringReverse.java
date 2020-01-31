import java.util.Scanner;
class StringReverse{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the string to be reversed :");

        String r = scan.nextLine();

        StringBuilder str =new  StringBuilder();

        str.append(r);
 
        System.out.println("Reversed String is :");

		System.out.println(str.reverse());

	}
}
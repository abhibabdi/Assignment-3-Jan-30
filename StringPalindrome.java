
import java.util.Scanner;
class StringPalindrome{
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string to check Palindrome");

		//String str = scan.nextString();
        //String str = String.nextString(args[0]);

	     String str = scan.nextLine();

        //String str = new String("abcd");
        int len = str.length();
		int i=0,j=0;
		int k = 0;

		for(i = 0, j = str.length()-1; i-j== 0 || j-i >= 1; i++, j--)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				k++;
			}
		}
        
        if(len % 2 == 1)
        {
        	if(k > str.length()/2)
        	System.out.println("String is Palindrome in nature.............");
         else
        	System.out.println("Not a Palindrome!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        }

        else if (len % 2 == 0)
        {
        	if(k >= str.length()/2)
        	System.out.println("String is Palindrome in nature.............");
            else
        	System.out.println("Not a Palindrome!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }


	}
}
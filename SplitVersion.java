import java.util.Scanner;
class SplitVersion{
	public static void main(String[] args) {
		
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter the string to be split :");

  String str = scan.nextLine();

  System.out.println("Enter the Splitter  :");

  String y = scan.nextLine();

  char exp = y.charAt(0);

    mySplit(str, exp);


	}
	static void mySplit(String str, char exp){

       int i;

       System.out.println("Split version of string is :");
      // StringBuilder []z = new StringBuilder[100];
		for(i = 0; i <= str.length() ; i++)
		{
			if(str.charAt(i) == exp)
			{
				System.out.println();
				//System.out.print(str.charAt(i));
			}
			else
				System.out.print(str.charAt(i));

		}
     


	//String []arr = str.split(exp);
       //  for(String val : arr)
		// System.out.println(val);
}
}
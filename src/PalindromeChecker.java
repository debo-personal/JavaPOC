import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		PalindromeChecker checker = new PalindromeChecker();
		String userStr;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		userStr = scanner.nextLine();
		boolean result = checker.check( userStr );
		System.out.println("This string is Palindrome: " + result );
	}
	
	public boolean check( String str ) {
		boolean result = false;
		if( str != null ) {
			int strLen = str.length();
			for(int i = 0; i < strLen/2; i++ ) {
				if( str.charAt(i) != str.charAt(strLen-1-i)) {
					result = false;
					break;
				}
				else {
					result = true;
				}
			}
		}
		return result;
	}
}
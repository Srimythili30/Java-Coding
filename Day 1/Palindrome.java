import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner myobj = new Scanner(System.in);
	    String word = myobj.nextLine();
	    String rev_str="";
	    for(int i=0;i<word.length();i++){
	        rev_str = word.charAt(i)+rev_str;
	         
	    }
	    if(word.equals(rev_str)){
	        System.out.println("Palindrome");
	    }
	    else{
	        System.out.println("Not a Palindrome");
	    }
	}
}

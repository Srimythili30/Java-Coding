import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
	    Scanner myobj = new Scanner(System.in);
	    String word = myobj.nextLine();
	    String rev_str="";
	    for(int i=0;i<word.length();i++){
	        rev_str = word.charAt(i)+rev_str;
	         
	    }
	    System.out.println(rev_str);
	}
}

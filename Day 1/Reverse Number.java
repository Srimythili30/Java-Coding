import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
	    Scanner myobj = new Scanner(System.in);
	    int num = myobj.nextInt();
	    while (num > 0 )
	    {
	       int  res= num % 10 ;
	       System.out.print(res);
	       num = num / 10;
	    }
		
	}
}

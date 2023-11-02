import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) {
	    Scanner Myobj = new Scanner(System.in);
	    int num = Myobj.nextInt();
	    int temp = num;
	    int sum = 0;
	    while (num > 0){
	        int rem = num % 10 ;
	        sum = sum + (rem*rem*rem);
	        num = num /10 ;
	    }
	    if (temp == sum) {
	        System.out.println("Armstrong");
	    }
	    else{
	        System.out.println("Not an Armstrong"); 
	    }
	}
}

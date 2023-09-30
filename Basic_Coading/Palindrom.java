
    
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		int n,c,r,s=0;


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		c=n;

		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("palindrom");
		}else {
			System.out.println("not");
		}


	}

}

    


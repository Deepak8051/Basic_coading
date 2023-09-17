import java.util.Scanner;
public class PerfectNumber {
    
    public static void main(String[]args){
        int sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;


            }

        }
        if(sum==1){
            System.out.println("num is perfect");
        }
        else {
            System.out.println("not perfect");
        }
    }
    int divisor(int x){
        return x;
    }
    
}

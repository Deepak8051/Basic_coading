import java.util.Scanner;
class Demo2{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        if(a>0){
            System.out.println("number is +ve");
        }
        else if(n<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
}
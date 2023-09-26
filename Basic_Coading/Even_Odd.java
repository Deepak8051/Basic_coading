import java.util.Scanner;
class Even_Odd{
    public static void main(String[] args) {
        System.out.println("enter your Number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum = 0;
        if(a%2==0){
            System.out.println("even ");
              sum +=a;
        }
            else {
                System.out.println("odd");
              
                System.out.println(sum);

            }
        }

    }

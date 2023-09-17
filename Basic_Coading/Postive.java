import java.util.Scanner;
public class Postive {
    public static void main(String[]args)

    {
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0)
        {
             System.out.println("number is posituve");
        }
           
            else if(n<0)
            {
                 System.out.println("num is -ve");

            }
               
                else
                 {
                    System.out.println("neither positive ");

                }
                
            }
        
    }


    

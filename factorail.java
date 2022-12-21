// for printing the factorail of the number
import java.util.Scanner;
class Lab_Task_2
{

    public static int print_numbers(int n){
        if (n==0) {
            
            return 1;
        }
        else {
            return n*print_numbers(n-1);

        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        print_numbers(n);
        System.out.println("Enter the number for factorial: "+print_numbers(n));
    }
}

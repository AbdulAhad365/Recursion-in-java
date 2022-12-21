// Using the recusion and printing the values representativly sum.
import java.util.Scanner;
class Lab_Task_2
{

    public static void print_numbers(int n,int till,int sum){
        if (till<n) {
            return;
        }
        else {
            System.out.print("The sum is ");
            sum+=n;
            System.out.print(sum);
            System.out.println();
            print_numbers(n+1,till,sum);

        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number uptill you want to find the sum ");
        int n=s.nextInt();
        print_numbers(1,n,0);

    }
}

//Print number in increasing order java
import java.util.Scanner;
class Lab_Task_2
{

    public static void print_numbers(int n){
        if (n==6) {
            return;
        }
        else {
            System.out.print(n);
            print_numbers(n+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number uptil you want to print");
        int n=s.nextInt();
        print_numbers(n);

    }
}

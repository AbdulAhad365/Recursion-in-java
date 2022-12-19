import java.util.Scanner;
class Scratch {
    static int fibonacci(int g){
        int x=2;
        int n=0;
        int m=1;
        int sum=0;
        System.out.print(n+" "+m);
        if (g==x){
            return 1;
        }
        else {

            for(int i=2;i<=g;i++){
                sum=n+m;
                n=m;m=sum;
                System.out.print(sum+" ");
            }
            return sum;

        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=7;
        System.out.println("The series is "+fibonacci(num));

    }
}

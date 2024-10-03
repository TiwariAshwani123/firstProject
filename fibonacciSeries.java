import java.util.Scanner;


class pr{

    static int fibo(int n){

        if(n==0)
           return 0;

        if(n==1)
           return 1;


        return fibo(n-2) + fibo(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to that position of fibonacci series:");
        int n = sc.nextInt();

        System.out.println("The number in position " + n + " is:" + fibo(n));

        


        sc.close();
    }
}
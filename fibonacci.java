import java.util.Scanner;
public class fibonacci {

    public int fib(int x){
        if(x<=1){
            return x;}

        return fib(x-1)+fib(x-2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        fibonacci obj = new fibonacci();
        System.out.println(obj.fib(x));

    }
}
